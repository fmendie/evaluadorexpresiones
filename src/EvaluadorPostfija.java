
import java.util.Stack;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pipe7
 */
public class EvaluadorPostfija {
      public static int evaluar(String expresion) {
        Stack<Integer> pila = new Stack<>();

        for (char c : expresion.toCharArray()) {
            if (Character.isDigit(c)) {
                pila.push(c - '0');
            } else {
                int b = pila.pop();
                int a = pila.pop();
                switch (c) {
                    case '+': pila.push(a + b); break;
                    case '-': pila.push(a - b); break;
                    case '*': pila.push(a * b); break;
                    case '/': pila.push(a / b); break;
                }
            }
        }
        return pila.pop();
    }
}
