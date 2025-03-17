
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pipe7
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la expresión en notación infija: ");
        String expresion = scanner.nextLine().replaceAll("\\s+", "");

        if (!BalancedParentheses.estaBalanceado(expresion)) {
            System.out.println("Error: Los paréntesis no están balanceados.");
            return;
        }

        String postfija = InfijaAPostfija.convertir(expresion);
        System.out.println("Expresión en notación postfija: " + postfija);

        int resultado = EvaluadorPostfija.evaluar(postfija);
        System.out.println("Resultado de la evaluación: " + resultado);
    }
}
