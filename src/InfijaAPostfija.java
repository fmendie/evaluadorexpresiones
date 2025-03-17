
import java.util.Stack;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pipe7
 */
public class InfijaAPostfija {
     private static int prioridad(char operador) {
        switch (operador) {
            case '+': case '-': return 1;
            case '*': case '/': return 2;
            case '^': return 3;
            default: return -1;
        }
    }

    public static String convertir(String expresion) {
        StringBuilder resultado = new StringBuilder();
        Stack<Character> pila = new Stack<>();

        for (char c : expresion.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                resultado.append(c);
            } else if (c == '(') {
                pila.push(c);
            } else if (c == ')') {
                while (!pila.isEmpty() && pila.peek() != '(') {
                    resultado.append(pila.pop());
                }
                pila.pop();
            } else {
                while (!pila.isEmpty() && prioridad(pila.peek()) >= prioridad(c)) {
                    resultado.append(pila.pop());
                }
                pila.push(c);
            }
        }

        while (!pila.isEmpty()) {
            resultado.append(pila.pop());
        }
        return resultado.toString();
    }
}
