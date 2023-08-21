package  Question_3;

import java.util.Scanner;

public class CountInput {
    public static void cont() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a quantidade de números e operadores (+ ou -) que farão parte das operações: ");
        int m = scanner.nextInt();

        if (m > 100) {
            System.out.println("Quantidade inválida, favor forneça uma quantidade entre 0 e 100.");
            return;
        }

        System.out.print("Informe o 1º número: ");
        int result = scanner.nextInt();

        for (int i = 1; i < m; i++) {
            System.out.print("Informe o próximo operador (+ ou -): ");
            char operator = scanner.next().charAt(0);

            System.out.print("Informe o próximo número: ");
            int num = scanner.nextInt();

            if (operator == '+') {
                result += num;
            } else if (operator == '-') {
                result -= num;
            } else {
                System.out.println("Operador inválido. Utilize apenas '+' ou '-'.");
                return;
            }
        }

        System.out.println("Resultado da operação: " + result);
    }
}