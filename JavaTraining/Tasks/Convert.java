/*�������� 2 ����� ��� ����������� :
int -> String
double -> String
1) ������ ������������ ����������� ������ ��� �����������.
2) ��� ������������ ����� �� ��� ������������ �� ������ 1 ������� (�.�. ��� �������� �� ����� � ������, �� ����� ����� ������� �� ����� �����)
3) ����� ����� ���� ��������������
4) ����� � ��������� ������ ����� � �� ��������� ������� ����� (12345)
�.�. ����� ������������ ������ ������ Math*/

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