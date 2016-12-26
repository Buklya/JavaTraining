/*Дан холодильник закрытый на замок. На передней панели расположено 16 рычагов матрицей 4 на 4. Рычаги могут принимать как горизонтальное, так и вертикальное положение.
При повороте одного из рычагов, все рычаги по вертикали и горинтали от поворачиваемого меняют положение на противоположное.
Когда все рычаги принимают горизонтальное положение холодильник открывается.
1) Разработать формат хранения матрицы. Тоесть предусмотреть возможность решения заранее заданой матрицы.
2) Найти минимальное количество шагов за которое можно решить матрицу и открыть холодильник.
3) Вывести комбинацию рычагов которую нужно повернуть для того чтобы открыть холодильник.*/

class Test{
    public static void main(String [] args){
        int[][]array = {{-1, -1, -1, -1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}};
        Fridge fridge = new Fridge(array);
        fridge.printKey();
        System.out.println("==================");
        System.out.println(play(fridge));        
    }

    static int play(Fridge fridge){
        int count = 0;
        for(int i = 0; i < fridge.key.length; i++){
            for(int j = 0; j < fridge.key.length; j++){
                if(fridge.isOpen()){
                    return count;
                } else {
                    fridge.turn(i, j);
                }
                count ++; 
                fridge.printKey();
                System.out.println("==================");          
            }
        }
        return count;
    }
    
    


}