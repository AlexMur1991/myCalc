package consoleCalc;

import java.util.Scanner;

public class ConsoleCalc {
    private int result;



    // Метод getInt принимает из консоли число, проверяет что оно является целым числом и возвращает его.

    private static  int getInt(){
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.print("Введите число: ");
        if (scan.hasNextInt()) {
            num = scan.nextInt();
        }else {
            System.out.println("Вы не ввели целое число. Попробуйте еще раз.");
            num = getInt();
        }return num;
    }
    private char  getOperation (){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите операцию: ");
        char operation = scan.nextLine().charAt(0);
        return operation;
    }

    private int calcMath(int num1, int num2, char operation){

        switch (operation){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Вы допустили ошибку!");
                result = calcMath(num1, num2, getOperation());
        }return  result;
    }


    public static void main(String[] args) {
        ConsoleCalc calc = new ConsoleCalc();
        int num1 = getInt();
        int num2 = getInt();
        int result = calc.calcMath(num1, num2, calc.getOperation());

        System.out.println("Ответ: " + result);
    }
}
