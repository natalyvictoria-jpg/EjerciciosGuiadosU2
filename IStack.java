
package pila;

/**
 *Este ejercicio fue realizado en clase con el fin de fortalecer mi conocimiento 
 de manera practica sobre el tema de Pilas. Creamos esta clase con el proposito de 
 elaborar las operaciones que realizan las pilas y el comportmiento de ella.
 * @author Nataly Victoria Gonzalez Aviles-GTI0141 
 *Viernes 17 de Octubre de 2025.
 Estructura de datos
 */
public interface IStack <T> {
    void push(T element);
    T pop();
    T peek ();
    boolean isEmpty();
    
}

