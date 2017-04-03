import java.util.*;
/**
 * Posible solución al tercer ejercicio
 */
public class Ejercicio3 {
    public void imprimirValores(int[] elArray, int inicio, int cantidadValores) {
        for(int i = 0; i < cantidadValores; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(elArray[(inicio + i) % elArray.length]);
        }
    }
    
    public static void main() {
        //Pruebas
        Ejercicio3 app = new Ejercicio3();
        app.imprimirValores(new int[]{5, 12, 22, -1, 4, 0, 6, 9, 4}, 5, 8);
    }
}
