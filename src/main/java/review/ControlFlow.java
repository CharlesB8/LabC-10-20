package review;


import java.lang.reflect.Array;

// access and direction of your program
// you can control it through loops, switches and if statements
public class ControlFlow {


    public String myMethod(int input){
        //int x = 3;
        if(input == 4){
            return "true";
        } else {
            return "false";
        }


    }

    public String switchMethod(int input) {
        switch (input) {
            case 1:
                return "that's one";
            case 2:
                return "that's two";
            case 3:
                System.out.println("you need a break");
                break;
            case 4:
                return "that's four";
        }

        return "other default";
    }

    public String forMethod(){

        for(int i = 0; i < 4; i++){
            System.out.println("I am in a for loop");
        }

        return "";
    }

//    public static void main(String[] args) {
//        //if provides a specific condition that if its true it will run the block of cod
//        System.out.println(myMethod(3));
//
//    }





    public static void main(String[] args) {
        int[] ints = {1,3,4,5,5,};
        int x = 4;
        while(x == 4){
            System.out.println("I am Stuck");
            x++;
        }

        do{
            System.out.println("am I stuck here?");
        }while(x > 10);



        outer:
        for(int el : ints) {
            System.out.println(el);
            if(el == 3){
                continue;
            }
            System.out.println("I am after the continue");

        }




    }

}
