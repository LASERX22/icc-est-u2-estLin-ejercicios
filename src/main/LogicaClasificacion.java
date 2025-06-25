package main;

import java.util.*;

public class LogicaClasificacion {

    /**
     * Invierte una cadena de texto utilizando una pila (Stack).
     *
     * @param texto Cadena original a invertir.
     * @return Cadena invertida.
     *
     *         Ejemplo:
     *         Entrada: "Hola Mundo"
     *         Salida: "odnuM aloH"
     */
    public String invertirCadena(String texto) {
        StringBuilder builder = new StringBuilder();
        Stack<Character> letras = new Stack<>();
        for (int i = 0; i < texto.length(); i++) {
            letras.push(texto.charAt(i));
        }
        while(!letras.isEmpty()){
            Character nLetra = letras.pop();
            builder.append(nLetra);
        }
        return builder.toString();

    }

    /**
     * Verifica si los símbolos de paréntesis, corchetes y llaves están bien
     * balanceados.
     *
     * @param expresion Cadena con símbolos.
     * @return true si está balanceada, false en caso contrario.
     *
     *         Ejemplo:
     *         Entrada: "{[()]}"
     *         Salida: true
     */
    public boolean validarSimbolos(String expresion) {
        Stack<Character> pila = new Stack<>();
        for (int i = 0; i < expresion.length(); i++) {
            char caracter= expresion.charAt(i);
            if (caracter=='(' || caracter=='['||caracter=='{') {
                pila.push(caracter);
            }
            if(caracter==')' || caracter==']'||caracter=='}'){
                if (pila.isEmpty()){
                    return false;
                }
                char ultimo = pila.peek();
                if(caracter==')' && ultimo=='('){
                    pila.pop();
                }
                if(caracter==']' && ultimo=='['){
                    pila.pop();
                }
                if(caracter=='}' && ultimo=='{'){
                    pila.pop();
                }
            }
        }
        if (pila.isEmpty()){
            return true;
        }
        return false;
    }

    /**
     * Ordena una pila de enteros en orden ascendente usando otra pila auxiliar.
     *
     * @return Lista ordenada.
     *
     *         Ejemplo:
     *         Entrada: [3, 1, 4, 2]
     *         Salida: [1, 2, 3, 4]
     */
    public List<Integer> ordenarPila(Stack<Integer> pila) {
        Stack<Integer> newStack = new Stack<>();
        if(pila==null){
            System.out.println("No se encuentran numeros");
        }
        while(!pila.isEmpty()) { 
            int menor=pila.pop(); 
            while(!newStack.isEmpty() && newStack.peek()>menor){ 
                pila.push(newStack.pop()); 
            newStack.push(menor);
            }
        }
        while(!newStack.isEmpty()){
            pila.push(newStack.pop());
        }
        return new ArrayList<>(pila);
    }

    /**
     * Clasifica una lista de enteros separando pares e impares.
     * Usa LinkedList para mantener el orden de inserción.
     *
     * @return Lista con pares primero, luego impares.
     *
     *         Ejemplo:
     *         Entrada: [1, 2, 3, 4, 5, 6]
     *         Salida: [2, 4, 6, 1, 3, 5]
     */
    public List<Integer> clasificarPorParidad(LinkedList<Integer> original) {

        return new ArrayList<>();
    }
}
