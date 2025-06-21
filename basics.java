import java.util.Scanner;
public class basics {
    public static void main(String[] args) {


        //user inputs ------------------------------------------------      
        //integer, double, boolean, word, string, byte, short
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextLine()+ " integer");// nextInt(),nextDouble(), nextBoolean(), next(), nextLine(), nextByte(), nextShort()
        //nextLine().charAt(0),next()-word, nextLine()-string.


        //data types-------------------------------------------------
        //primitives
        //int, double, boolean, byte, short, char, long, float
        int a = 10; // 4 bytes
        double b = 20.5; // 8 bytes
        boolean c = true; // 1 bit
        byte e = 100; // 1 byte
        short f = 30000; // 2 bytes
        char g = 'A'; // 2 bytes
        long h = 100000L; // 8 bytes
        float i = 10.5f; // 4 bytes
        //-------------------------------------
        //non-primitives
        //String, Arrays, Classes, Interfaces, etc.
        String str = "Hello, World!";
        int[] arr = {1, 2, 3, 4, 5};
        //Classes and Objects
        class Person {
            String name;
            int age;//

            Person(String name, int age) {
                this.name = name;
                this.age = age;// constructor
            }
        } 
        Person person = new Person("John", 30); // creating an object of Person class
        System.out.println("Name: " + person.name + ", Age: " + person.age);
        //Interfaces
        interface Animal {
            void sound(); // abstract method
        }   
        class Dog implements Animal {
            public void sound() {
                System.out.println("Woof!");
            }
        }
        Dog dog = new Dog(); // creating an object of Dog class
        dog.sound(); // calling the sound method of Dog class
        //--------------------------------------------------
        //Operators------------------------------------------------
        //Arithmetic: +, -, *, /, %
        int sum = a + 5; // addition
        double product = b * 2; // multiplication   
        boolean isTrue = c && true; // logical AND
        //Relational: ==, !=, >, <, >=, <=
        boolean isEqual = (a == 10); // equality check
        boolean isGreater = (b > 15.0); // greater than check
        //Assignment: =, +=, -=, *=, /=, %=
        a += 5; // equivalent to a = a + 5
        b *= 2; // equivalent to b = b * 2
        //Unary: ++, --, +, -
        a++; // increment
        b--; // decrement
        //Ternary: condition ? trueValue : falseValue
        String result = (a > 5) ? "Greater than 5" : "Not greater than 5"; // ternary operator
        System.out.println("Result: " + result);
        //Bitwise: &, |, ^, ~, <<, >>
        int bitwiseAnd = a & 5; // bitwise AND
        int bitwiseOr = a | 5; // bitwise OR
        int bitwiseXor = a ^ 5; // bitwise XOR
        int bitwiseNot = ~a; // bitwise NOT
        int leftShift = a << 2; // left shift
        int rightShift = a >> 2; // right shift
        //-----------------------------------------------------

        //Conditional: if, else, switch
        if (a > 5) {
            System.out.println("a is greater than 5");
        } else {
            System.out.println("a is not greater than 5");
        }
       
        //Switch case
        switch (a) {
            case 10:
                System.out.println("a is 10");
                break;
            case 20:
                System.out.println("a is 20");
                break;
            default:
                System.out.println("a is neither 10 nor 20");
        }

        //conditional else if
        if (a > 10) {
            System.out.println("a is greater than 10");
        } else if (a == 10) {
            System.out.println("a is equal to 10");
        } else {
            System.out.println("a is less than 10");
        }
//--------------------------------------------------------------------------------
        //Loops: for, while, do-while
        //For loop
        for (int j = 0; j < 5; j++) {
            System.out.println("For loop iteration: " + j);
        }
        //While loop
        int k = 0;
        while (k < 5) {
            System.out.println("While loop iteration: " + k);
            k++;
        }
        //Do-while loop
        int l = 0;
        do {
            System.out.println("Do-while loop iteration: " + l);
            l++;
        } while (l < 5);
        //--------------------------------------------------------------------------------
        //Arrays: single-dimensional and multi-dimensional
        //Single-dimensional array
        int[] singleArray = {1, 2, 3, 4, 5};
        System.out.println("Single-dimensional array:");
        for (int num : singleArray) {
            System.out.print(num + " ");
        }
        System.out.println();
        //Multi-dimensional array
        int[][] multiArray = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Multi-dimensional array:");
        for (int[] row : multiArray) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        //--------------------------------------------------------------------------------
        


        //Calling the add function
        int sumResult = add(5, 10);
    }
    //functions: defining and calling
        //Function to add two numbers
    static int add(int x, int y) {
            return x + y;
        }

}
