package myHomeWorks;

import java.util.Scanner;
//В этой игре компьютер рандомно загадывает число.   Пользователю необходимо угадать это число
//если пользователь  угадал, то в консоли появится надпись: "вы угадали"
//если нет,  то программа подсказажет больше или меньше введенная сумма относительно искомого числа

public class NumbersGame {
private int randomNum = (int) (Math.random() * 100);



    public static void main(String[] args) {
        NumbersGame game  = new NumbersGame();
        game.getInt();
    }

    private void getInt(){

        System.out.println("Введите число от 0 до 100. У вас 10 жизней!");
        for(int i = 9; i >= 0; i--) {
            Scanner scan = new Scanner(System.in);

            if (scan.hasNextInt()) {                      //Проверяем введено целое число или нет
                int playerNum = scan.nextInt();
                if (playerNum == randomNum) {
                    System.out.println("Ура! Вы угадали!");
                } else if (playerNum < randomNum) {
                    System.out.println("Попробуйте ввести число побольше! У вас осталось " + i +" жизней");
                } else if (playerNum > randomNum) {
                    System.out.println("Попробуйте ввести число поменьше! У вас осталось " + i + " жизней");
                }
            } else {
                System.out.println("Необходимо ввести число от 0 до 100. У вас осталось " + i +" жизней");
            }
        }

    }

}
