package myHomeWorks;

import java.util.Scanner;
//В этой игре компьютер рандомно загадывает число.   Пользователю необходимо угадать это число
//если пользователь  угадал, то в консоли появится надпись: "вы угадали"
//если нет,  то программа подсказажет больше или меньше введенная сумма относительно искомого числа

public class NumbersGame {
private int randomNum;
private int minNumberRange;
private int maxNumberRange;



    public static void main(String[] args) {
        NumbersGame game  = new NumbersGame();
        game.rangeMathRandom();
        game.playGame();

        System.out.println();
    }
    // метод range принимает минимальные и максимальные числа для создания диапазона в котором рандомно выбирается число.
    public  void rangeMathRandom(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Давайте создадим диапазон в котором будем угадывать число.\n" +
                "Введите минимальное число диапазона: ");
        minNumberRange = scanner.nextInt();
        System.out.println("Теперь введите максимальное число диапазона");
        maxNumberRange = scanner.nextInt();
        randomNum = (int) (Math.random() * (maxNumberRange - minNumberRange) + minNumberRange);

    }

    private void playGame(){
        System.out.println("Настало время угадать число в диапазоне от " + minNumberRange + "до " +
                maxNumberRange + ". У вас 10 жизней!");
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
