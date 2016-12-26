/*Написать 2 метод для конвертации :
int -> String
double -> String
1) Нельзя использовать стандартные методы для конвертации.
2) При контеканации можно за раз использовать не больше 1 символа (т.е. при переводе из числа в строку, из числа нужно достать по одной цифре)
3) Числа могут быть отрицательными
4) Числа с плавающей точкой могут и не содержать дробную часть (12345)
п.с. Можно использовать методы класса Math*/

class Convert{
	public static void main(String [] args){
		int n = -123;
		System.out.println(toString(n));
	}
	
	static String toString(int value){
		String s = "";
		int tempValue = value;
		if(tempValue < 0){
			tempValue *= -1;
		}
		while(tempValue != 0){
				s = (tempValue % 10) + s;
				tempValue /= 10;		
		}
		
		if(value < 0){
			s = "-" + s;
		}				
		return s;
	}
	
	static String toString(double value){
		String s = new String();
		return s;
	}
}