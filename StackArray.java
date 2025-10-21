
package pila;

/**
 *Este ejercicio fue realizado en clase con el fin de fortalecer mi conocimiento 
 de manera practica sobre el tema de Pilas. Creamos esta clase con el proposito de 
 elaborar las operaciones que realizan las pilas y el comportmiento de ella.
 * @author Nataly Victoria Gonzalez Aviles-GTI0141 
 *Viernes 17 de Octubre de 2025.
 Estructura de datos
 */
public class StackArray <T> implements IStack <T> {
    private T[] elements; // Estructura de datos interna (Array)
    private int top;
   
    
    public StackArray(){
        elements =(T[]) new Object[30];
    }

     public StackArray(int size){
        elements =(T[]) new Object[size];
    }
    
    

 @Override
public void push(T elemento) {
    if (top < elements.length) {
        elements[top] = elemento; // Inserta el elemento en la posición actual
        top++; // Avanza la cima
    } else {
        System.out.println(" La pila está llena, no se pueden agregar más elementos.");
    }
}


    @Override
  
    public T pop() {
    if (isEmpty()) {
        System.out.println("️ La pila está vacía, no se puede eliminar ningún elemento.");
        return null; // o puedes lanzar una excepción si prefieres
        // throw new IllegalStateException("La pila está vacía");
    } else {
        T elementoEliminado = elements[top]; 
        elements[top] = null;
        top--; // baja la cima
        return elementoEliminado; // devuelve el elemento quitado
    }
}


    public T peek() {
    if (isEmpty()) {
    System.out.println("Pila Vacía");
 }
    System.out.println("Conociendo el último de la pila");
    return (T) elements[top -1];
 }

   

    @Override
    public boolean isEmpty() {
        
        return top == 0;
            
        
    }
    
    
}



