package Question_2;

import java.util.Scanner;

public class Feelings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Read read = new Read();

        String message;

        System.out.println("Por favor escreva sua mensagem:");
        message = scanner.nextLine();
        int countHappy = read.Count(message, ":-)");
        int countSad = read.Count(message, ":-(");

        if (countHappy > countSad) {
            System.out.println("Diversão");
        } else if (countSad > countHappy) {
            System.out.println("Chateação");
        } else {
            System.out.println("Neutro");
        }
    }
}
