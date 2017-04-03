import java.util.*;
import java.time.*;
/**
 * Posible solución al segundo ejercicio
 */
public class Ejercicio4 {
    public Set<Accionista> seleccionarMasJoven(Set<Accionista> accionistas) {
        Set<Accionista> resultado = new HashSet<>();
        LocalDate fechaDelMasJoven = null; // la fecha del mas joven. Inicialmente no la conocemos
        for(Accionista accionista : accionistas) { // recorrer accionistas
            LocalDate fechaAccionista = accionista.getFechaNacimiento(); // Sacar la fecha de nacimiento
            if (fechaDelMasJoven == null) { // Si no teníamos inicializada la fecha
                resultado.add(accionista);  // este es el primer accionista. De momento, el más joven
                fechaDelMasJoven = fechaAccionista; // y guardamos su fecha como la del más joven
            } else if (fechaAccionista.compareTo(fechaDelMasJoven) > 0) { // Su la fecha es posterior
                resultado.clear();  // Este es más joven que cualquiera que tuvieramos en el set
                resultado.add(accionista); // borramos los anteriores, añadimos este
                fechaDelMasJoven = fechaAccionista; // y guardamos su fecha como la del más joven
            } else if (fechaAccionista.equals(fechaDelMasJoven)) { // Si la fecha es igual que la que tenemos
                resultado.add(accionista); // tan solo añadimos al accionista, porque es igual de joven
            }
        }
        return resultado;
    }
    
    public static void main() {
        //Pruebas
        Ejercicio4 app = new Ejercicio4();
        Set<Accionista> miSet = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            Accionista a = new Accionista();
            miSet.add(a);
            
        }
        
        Set<Accionista> r = app.seleccionarMasJoven(miSet);
        for (Accionista a : r) {
            System.out.format("%s; ", a.getFechaNacimiento());
        }
        
        
    }
}
