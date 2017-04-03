import java.util.*;
/**
 * Posible solución al segundo ejercicio
 */
public class Ejercicio2 {
    public boolean hayExterior(Set<String> paradas) {
        if (paradas == null) {
            return false;
        }
        boolean encontrado = false;
        Iterator<String> iter = paradas.iterator();
        while(!encontrado && iter.hasNext()) {
            String siguiente = iter.next();
            if (siguiente.toLowerCase().contains("ivelany")) {
                encontrado = true;
            }
        }
        return encontrado;
    }
    
    public static void main() {
        //Pruebas
        Ejercicio2 app = new Ejercicio2();
        Set<String> s = new HashSet<>();
        s.add("wrieio");
        s.add("rpweoriepo  eirjowier o");
        s.add("rpweo wweriuh iuhriuewth");
        System.out.println(app.hayExterior(s));
        s.add("ewoir weoir jweior iVeLanY rei oiwe");
        s.add(" oiwer oiw eri owier o weu wg g ");
        System.out.println(app.hayExterior(s));
    }
}
