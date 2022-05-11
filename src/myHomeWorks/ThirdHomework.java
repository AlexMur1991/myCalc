package myHomeWorks;
import java.util.Scanner;
/*
* данная программа создает массив, началом и концом которого являются числа, указанные пользователем.
* Затем она выводит в консоль количество четных чисел.
*/
public class ThirdHomework {

    public int minNumber;
    public int maxNumber;


    public static void main(String[] args) {
        ThirdHomework m = new ThirdHomework();
        int minNumber = m.assignMinNumber();
        int maxNumber = m.assignMaxNumber();
        int[] myArray = m.creatingArray(minNumber, maxNumber);
        int count = 0;
        for(int i = 0; i < myArray.length; i++){
            if(myArray[i] % 2 == 0)
                count++;
        }
        System.out.println ("В получившемся массиве " + count + " четных чисел. ");

    }
    public int assignMinNumber(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите минимальное число: ");
        if (scan.hasNextInt()){
            minNumber = scan.nextInt();
        }else {
            System.out.println("Необходимо ввести число. Попробуйте ещё раз.");
            minNumber = assignMinNumber();
        }return minNumber;
    }

    public int assignMaxNumber(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите максимальное число: ");
        if (scan.hasNextInt()){
            int number = scan.nextInt();
            if(number > minNumber){
                maxNumber = number;
            }else{
                System.out.println("Максимальное число должно быть больше минимального. Повторите попытку.");
                maxNumber = assignMaxNumber();
            }
        }else {
            System.out.println("Необходимо ввести число. Попробуйте ещё раз.");
            maxNumber = assignMaxNumber();
        }return maxNumber;
    }

    public int[] creatingArray(int minNumber, int maxNumber){
        int j = maxNumber - minNumber + 1;
        int s = minNumber;
        int[] myArray = new int[j];
        for(int i = 0; i < myArray.length; i++){
            myArray[i] = s;
            s++;
        }return myArray;
    }

}
