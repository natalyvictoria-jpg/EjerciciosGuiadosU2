
package pila;

/**
 *Este ejercicio fue realizado en clase con el fin de fortalecer mi conocimiento de maner practica sobre el tema de Pilas
 * @author Nataly Victoria Gonzalez Aviles-GTI0141 
 *Viernes 17 de Octubre de 2025.
 Estructura de datos
 */

public class MainPila {
    public static void main(String[] args) {
        StackArray<String> pila = new StackArray<>(5);

        // Agregar tres nombres
        pila.push("Sofía");
        pila.push("Ramiro");
        pila.push("Rey");

        // Mostrar la cima con peek
        System.out.println("Elemento en la cima (peek): " + pila.peek());

        // Eliminar un elemento con pop
        String eliminado = pila.pop();
        System.out.println("Elemento eliminado (pop): " + eliminado);

        // Mostrar la cima después de pop
        System.out.println("Elemento en la cima después de pop: " + pila.peek());

        // Agregar otro nombre
        pila.push("Victoria");
        System.out.println("Elemento agregado (push): Victoria");

        // Mostrar la cima final
        System.out.println("Elemento en la cima final: " + pila.peek());
    }
}

