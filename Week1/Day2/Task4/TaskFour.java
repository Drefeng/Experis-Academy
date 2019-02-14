/**
 * @author Billy Infante
 */

public class TaskFour{
    public static void main(String[] args){
        int row, column;

        if(args.length > 1){
            row = Integer.parseInt(args[0]);
            column = Integer.parseInt(args[1]);
            drawRectangle(row, column);
        }
        else{
            System.out.println("Input require row and column");
        }
    }

    static void drawRectangle(int row, int column){
        for(int i=0; i < row; i++){
            for(int j=0; j < column; j++){

                //outer square
                if(i == 0 || j == 0 || i == row-1 || j == column-1){
                    System.out.print("#");
                }
              
                // top inner row
                else if(j > 2 && j <= column-3 && i == 2){
                    System.out.print("#");
                }
                //bottom, inner row
                else if( j > 2 && j <=column-3 && i == row-3){
                    System.out.print("#");
                }

                  // left inner column
                else if( i >= 2 && i <= row-3 && j == 2){
                    System.out.print("#");
                }
                // right inner column
                else if(i >= 2 && i <= row-3 && j == column-3){
                    System.out.print("#");
                }

                //fill empty space
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}