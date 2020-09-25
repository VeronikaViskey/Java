import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 1 задание
        guessTheNumber();
        // 2 задание
        guessTheString();


    }

// 1 задание
    public static void guessTheNumber() {
        int size = 10;
        int randomNumber = new Random().nextInt(size);
        System.out.println(String.format("Угадайте число от 0 до %s \nУ вас есть 3 попытки", size));
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i < 4; i++) {
            System.out.println(String.format("Попытка номер : %s \n ", i));
            System.out.println("Введите число");
            int guess = scanner.nextInt();

            if (guess == randomNumber) {
                System.out.println("Вы выиграли!");
                break;
            }
            if (i == 3) {
                System.out.println("Вы проиграли!");
                break;
            }
                if (guess > randomNumber) {
                    System.out.println("Загаданное число МЕНЬШЕ");
                }
                if (guess < randomNumber) {
                    System.out.println("Загаданное число БОЛЬШЕ");
                }
            }

            System.out.println("Повторить игру еще раз?\n 1 - да ; 0 - нет");
            int newGame = scanner.nextInt();
            if (newGame == 1) {
                guessTheNumber();
            }

        }
        
    // 2 задание
    public static void guessTheString(){
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        int i = new Random().nextInt(words.length);
        String rightWord;
        rightWord = words[i];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Было загадано слово, попробуйте его угадать:");
        String guess = scanner.nextLine();

        while (guess.equals(rightWord)==false){

            for (i = 0; i < rightWord.length()-1; i++) {
                char result1 = rightWord.charAt(i);
                char result2 = guess.charAt(i);
                if (result1 == result2) {
                    System.out.print(result1);
                }
                else  {
                    System.out.print("#");
                }

            }
            System.out.print("##########");
            System.out.println("\nПопробуйте угадать еще раз:");
            guess = scanner.nextLine();
        }

        System.out.println("Вы выиграли!");
    }
    }

