
/**
 * Write a description of class Accionista here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Accionista {
    private java.time.LocalDate fechaNacimiento;
    private String nombre;
    static java.util.Random random;
    static int num;
    static {
        random = new java.util.Random();
        num = 1;
    }
    
    public Accionista() {
        // Obtiene una fecha aleatoria, con muy poco rango para que haya mucha probabilidad
        // de obtener varios accionistas con la misma fecha.
       fechaNacimiento = java.time.LocalDate.of(random.nextInt(10)+1960, 1, 1);
       nombre = "Accionista" + String.format("%03d", num);
    }
   
    public java.time.LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    
    public String toString() {
        return String.format("%s %s; ", nombre, fechaNacimiento);
    }
}
