//basic array example

//public class NewJavaClass {
//    public static void main(String[] args) {
//        int[] numbers= {5,6,2,3,8,9,7};
//        System.out.println("Ayyay values");
//        for (int num : numbers){
//            System.out.println(num);
//        }
//    }

//***********************************************************
//input array in user

import java.util.Scanner;
    public class NewJavaClass {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] arr = new int[5];

            System.out.println("Enter 5 numbers:");

            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println("You entered:");
            for (int a : arr) {
                System.out.println(a);
            }
        }

    public void methodOne(){
        System.out.println("conformed");
    }

}
