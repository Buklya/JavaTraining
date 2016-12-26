/*
1) принимает 2м массив строк, выводит его на экран
2) принимает 2м массив интов, возвращает 2мерный массив чаров, каждый символ в позиции массива соответствует коду символа передаваемого инта
3) принимает 2м массив интов, ивертирует массив интов (каждое значение в передаваемом массиве меняет знак)
4) приминает 2 инта, а и б, возвращает большее их этих 2х чисел
5) принимает 3 инта, возвращает большее из них
6) приминает 5 интов, возвращает большее из них
8) принимает 2 массива чаров, проверяет есть ли в 1 массиве, такая же последовательность символов которую представляет собой второй массив. Возвращает булеан
11) метод принимает инт, и возвращает факториал от заданого инта
13) Принимает массив строк и просто строку, возвращает массив строк которые содержат данную подстроку. т.е. отфильтрованый из первого
15) метод приминает дабл, выводит на екран этот дабл с точностью не больше чем 3 знака после точки
17) метод приминимает массив интов сортирует его по убыванию (нельзя использовать методы сторонних классов)
18) метод принимает массив интов и булен, если булен тру то сортирует по убываниию, иначе по возрастанию
разница диагоналей матрицы
*/

class Arrays{
	public static void main(String [] args){
		//int [][]array = {{3, 2, 7},{4, 1, 5}, {3, 8, 11}};		
		//System.out.println(differenceDiagonal(array));
		char [] firstArray = {'a', 'b', 'h', 'e', 'l', 'j', 'o', 'a', 'h', 'e', 'l', 'l', 'o'};
		char [] secondArray = {'h', 'e', 'l', 'l', 'o'};
        System.out.println(isContains(firstArray, secondArray));		
	}
	
	//1 принимает 2м массив строк, выводит его на экран
	 static void print(String [][] array){
		 for(int i = 0; i < array.length; i++){
			 for(int j = 0; j < array[i].length; j++){
				 System.out.print(array[i][j] + " ");
			 }
			 System.out.println();
		 }
	 }
	 
	 //2 принимает 2м массив интов, возвращает 2мерный массив чаров, каждый символ в позиции массива соответствует коду символа передаваемого инта
	 static char [][] toCharArray(int [][] array){
		 char [][] resultArray = new char[array.length][];
		 for(int i = 0; i < array.length; i++){
			 resultArray[i] = new char[array[i].length];
			 for(int j = 0; j < array[i].length; j++){
				 resultArray[i][j] = (char)array[i][j];
			 }			 
		 }
		 return resultArray;
	 }
	 
	 //3 принимает 2м массив интов, ивертирует массив интов (каждое значение в передаваемом массиве меняет знак)
	 static void invert(int [][] array){		 
		 for(int i = 0; i < array.length; i++){			 
			 for(int j = 0; j < array[i].length; j++){
				 array[i][j] *= -1;
			 }			 
		 }		 
	 }
	 
	 //4 приминает 2 инта, а и б, возвращает большее их этих 2х чисел
	 static int max(int a, int b){
		 return a > b ? a : b;
	 }
	 
	 //5 принимает 3 инта, возвращает большее из них
	 static int max(int a, int b, int c){
		 return max(max(a, b), c);
	 }
	 
	 //6 приминает 5 интов, возвращает большее из них
	 static int max(int a, int b, int c, int d, int e){		 
		 return max(max (a, b, c), max(d, e));
	 }
	 
	 
	 //8 принимает 2 массива чаров, проверяет есть ли в 1 массиве, такая же последовательность символов которую представляет собой второй массив. Возвращает булеан
	 static boolean isContains(char [] firstArray, char [] secondArray){
		 for(int i = 0; i < firstArray.length; i++){
			 int j = 0;
			 if(secondArray[j] == firstArray[i]){
				 while(j != secondArray.length){
					 j++;
					 i++;
					 if(secondArray[j] != firstArray[i]){
						 break;
					 }
					 if(j == secondArray.length - 1){
						 return true;
					 }
				 }
			 }
		 }
		 return false;
	 }
	 
	 //11 метод принимает инт, и возвращает факториал от заданого инта
	 static int factorial(int number){
		int i = 1;
		while(number > 1){
			i *= number;
			number--;			
		}
		 return i;
	 }
	 
	 //разница диагоналей матрицы --> 1 for
	 static int differenceDiagonal(int [][] array){
		 int diagonal = 1, reverseDiagonal = 1, length = array.length;
		 for(int i = 0; i < length; i++){
				for(int j = 0; j < length; j++){
					if(i == j){
						diagonal *= array[i][j];
					}
					if(j == length - 1 - i){
						reverseDiagonal *= array[i][j];						
					}		 
				}				 
		 }
		 System.out.println(diagonal);
		 System.out.println(reverseDiagonal);
		 return diagonal - reverseDiagonal;
	 }
	 
	 
	 
	 
	 
	 static void print(char [][] array){
		 for(int i = 0; i < array.length; i++){
			 for(int j = 0; j < array[i].length; j++){
				 System.out.print(array[i][j] + " ");
			 }
			 System.out.println();
		 }
	 }
	 
	 static void print(int [][] array){
		 for(int i = 0; i < array.length; i++){
			 for(int j = 0; j < array[i].length; j++){
				 System.out.print(array[i][j] + " ");
			 }
			 System.out.println();
		 }
	 }
	
	
}