/*1 принимает массив чаров, возвращает строку состоящую из символов массива
2 принимает массив интов, и значение типа инт, возвращает индекс массива в котором значение совпадает с передаваемым, начиная с начала массива. Если значения в массиве нет возвращает -1
3 принимает массив интов, и значение типа инт, возвращает индекс массива в котором значение совпадает с передаваемым, начиная с конца массива. Если значения в массиве нет возвращает -1
4 принимает инт год, и возвращает тру если год високосный
5 принимает массив интов и число, выводит на экран только элементы массива которые кратны этому числу
6 метод принимает массив интов сортирует его по возрастанию
7 принимает массив байт, если в массиве есть повторяющиеся элементы, возвращает тру
*/
import java.util.*;
class SmallTasks{
	public static void main(String [] args){
		byte [] array = {1, 2,31};
		System.out.println(hasDuplicates(array));
	}
	static void print(int [] array){
		for(int i = 0; i < array.length; i++){
			System.out.println(array[i]);
		}
	}
	//1
	static String toString(char [] array){
		return new String(array);		
	}
	//2	
	static int indexOf(int [] array, int value){
		for(int i = 0; i < array.length; i++){
			if(array[i] == value){
				return i;
			}				
		}
		return -1;
	}
	//3
	static int lastIndexOf(int [] array, int n){
		for(int i = array.length-1; i > 0; i--){
			if(array[i] == n){
				return i;
			}				
		}
		return -1;
	}
	//4 // nope! %100 %400 one line --> correct
	static boolean isLeapYear(int year){			
		return (year % 4 == 0 && year % 100 !=0)|| (year % 400 == 0);
	}
	//5
	static void ratio(int [] array, int n){
		for(int i = 0; i < array.length; i++){
			if(array[i] % n == 0){
				System.out.println(array[i]);
			}				
		}
	}
	//6
	static void sortArray(int [] array){
		Arrays.sort(array);
	}
	
	//7 -> O(n^2) -> O(n)
	static boolean hasDuplicates(byte [] array){
		byte [] tempArray = array;
		Arrays.sort(tempArray);
		for(int i = 0; i < array.length-1; i++){			
				if(array[i] == array[i+1]){
					return true;
				}			
			}	
		return false;
	}	
}
