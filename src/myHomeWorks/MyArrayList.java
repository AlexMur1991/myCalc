package myHomeWorks;

import java.util.Scanner;

public class MyArrayList {

    public static void main(String[] args) {

        MyArrayList myArrayList = new MyArrayList();
        int maxInt = myArrayList.getInt();
        int[] myArray = myArrayList.creatingArray(maxInt);
        for (int i = 0; i < myArray.length; i++){
            System.out.print(myArray[i] + " ");
        }
        System.out.println("\n");

        for (int i = 0; i < myArray.length; i++){
            System.out.println(myArray[i]);
        }

    }
    public int getInt(){
        Scanner scan = new Scanner(System.in);
        int maxValueArray;
        System.out.print("Введите число: ");
        if (scan.hasNextInt()) {
            maxValueArray = scan.nextInt();
        }else {
            System.out.println("Вы не ввели целое число. Попробуйте еще раз.");
            maxValueArray = getInt();
        }return maxValueArray;
    }

    public  int[] creatingArray(int maxValueArray){
        int[] myArray = new int[maxValueArray / 2];
        for(int i = 0, j = 2; i < myArray.length; i++ ){
            myArray[i] = j;
            j += 2;
        }return myArray;
    }
}
