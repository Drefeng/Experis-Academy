/**
 * @author Billy Infante
 */

public class TaskThree{

    public static void main(String[] args){
        if(args.length > 0 ){
            drawSquare(Integer.parseInt(args[0]));
        }
        else{
            System.out.println("Need a integer number");
        }
    
    }

    static void drawSquare(int size){
        for(int i=0; i < size; i++){
            for(int j=0; j < size; j++){
                if(i == 0 || j == 0 || i == size-1 || j == size-1){
                System.out.print("#");
                }
                else{
                    System.out.print("_");
                }
            }
            System.out.println();
        }
    }
}