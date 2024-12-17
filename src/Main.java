import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String anyWordWhatISay;

        final int NUM = 22;
        String word = "word";
        anyWordWhatISay = NUM + word;

        if(NUM < 0){
            System.out.println("Вы ввели отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы ввели положительное число");
        } else {
            System.out.println("Вы ввели ноль");
        }
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Привет " + name + "!");
    }
}