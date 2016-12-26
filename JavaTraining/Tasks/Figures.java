class Figures {
	public static void main(String [] args){
		//1
		System.out.println("1");
		int myCountValue = 5;
		for(int i = 0; i < myCountValue; i++){
			for(int j = 0; j < myCountValue; j++){
				if(i <= j){
					System.out.print('*' + " ");	
				}
				else {
					break;
				}
			}
			System.out.println();
		}
		System.out.println();
	    //2	
		System.out.println("2");		
		for(int i = 0; i < myCountValue; i++){
			for(int j = 0; j < myCountValue; j++){
				if(j <= i){
					System.out.print('*' + " ");	
				}
				else {
					break;
				}
			}
			System.out.println();
		}	
		System.out.println();
		//3	
		System.out.println("3");		
		for(int i = 0; i < myCountValue; i++){
			for(int j = 0; j < myCountValue; j++){
				if(j < i)
					System.out.print(' ' + " ");
				else	
					System.out.print('*' + " ");				
			}
			System.out.println();
		}
		System.out.println();
		//4	
		for(int i = 0; i < myCountValue; i++){
			for(int j = 0; j < myCountValue; j++){
				if(j > i)
					System.out.print(' ' + " ");
				else	
					System.out.print('*' + " ");
			}
			System.out.println();
		}
		System.out.println();		
	}	

}