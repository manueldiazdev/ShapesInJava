/*
    Manuel Diaz
    CSC 15
    Project #1
 */
public class Main {

    public static final int SIZE = 13;
    public static void main(String[] args){
        topHalf();
        bottomHalf();




    }
    //prints top half of shape
    public static void topHalf(){



        //prints spaces as indentations for line
        for (int i = 1; i <=SIZE+1;i++){
            System.out.print(" ");

        }
        line();
        System.out.println();

        //prints shape with all the details in it
        for (int i = 1; i <= SIZE; i++){
            //prints spaces as indentation
            for (int j = i; j<=SIZE; j++){
                System.out.print(" ");
            }
            System.out.print("/");
            //more spaces as indentations
            for (int j = 1; j<=-3*i+(3*SIZE); j++){
                System.out.print(" ");
            }
            System.out.print("___");
            //prints misc. shape throughout the shape.
            for (int j = 1; j <= i-1; j++){
                System.out.print("/__");

            }
            //prints slashes at the right hand of the shape.
            for (int j = 1; j <= i; j++){
                System.out.print("/");
            }





            System.out.println();
        }




    }
    //calls bottom half of shape
    public static void bottomHalf(){
        line();
        //prints slashes next to line
        for (int i = 1; i <= SIZE; i++){
            System.out.print("/");
        }
        System.out.println();
        //prints Building java program line with pipes as borders and slashes to the right
        for (int i = 1; i<SIZE/2+1; i++){
            System.out.print("|");
            //spaces in between pipe and text
            for (int j = 1; j<=3*SIZE/2-11; j++){

                System.out.print(" ");

            }
            //prints Building Java Programs in each line
            System.out.print("Building Java Programs");
            for (int j = 1; j<=3*SIZE/2-11; j++) {

                System.out.print(" ");
            }
            System.out.print("|");
            //prints slashes to the right
            for (int j = 1; j <= -2*i+(SIZE+2); j++){
                System.out.print("/");
            }
            System.out.println();
        }

        line();



    }
    //creates line with "+" at each end
    private static void line(){
        System.out.print("+");
        // length of line
        for (int i = 1; i <= 3*SIZE; i++){
            System.out.print("-");




        }
        System.out.print("+");


    }

}

