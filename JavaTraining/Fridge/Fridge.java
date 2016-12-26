public class Fridge{
    int [][] key = new int [4][4];

    Fridge(){
        for(int i = 0; i < key.length; i++){
            for(int j = 0; j < key[i].length; j++){
                key[i][j] = -1;
            }
        }
   }

   Fridge(int [][]array){
        for(int i = 0; i < key.length; i++){
            for(int j = 0; j < key[i].length; j++){
                key[i][j] = array[i][j];
            }
        }
   }
    
    boolean isOpen(){
        for(int i = 0; i < key.length; i++){
            for(int j = 0; j < key[i].length; j++){
                if(key[i][j] == 1){
                    return false;
                }
            }
        }
        return true;
    }

    void turn(int x, int y){
        key[x][y] *= -1;
        for(int i = 0; i < key.length; i++){
            for(int j = 0; j < key[i].length; j++){
                if(x == i){
                    key[i][j] *= -1;
                }
                if(y == j){
                    key[i][j] *= -1;
                }                
            }
        }
    }

    void printKey(){
        for(int i = 0; i < key.length; i++){
            for(int j = 0; j < key[i].length; j++){
                if(key[i][j] == -1){
                    System.out.print(" - ");                    
                }
                else{
                    System.out.print(" + ");
                }                
            }
            System.out.println();
        }
    }
}