import java.util.Scanner;

/**
 *
 * @author danielsotoortiz
 */
public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        Estudiante a1 = new Estudiante();
        
        a1.setNombre(tec.nextLine());
        a1.setDirección(tec.nextLine());
        a1.setEdad(tec.nextInt());
        a1.setNre(tec.nextInt());
        System.out.println(a1.toString());

    }

}

class Estudiante {

    String nombre;
    String dirección;
    int edad;
    int nre;

    public Estudiante() {
    }

    public Estudiante(String nombre, String dirección, int edad, int nre) {
        this.nombre = nombre;
        this.dirección = dirección;
        this.edad = edad;
        this.nre = nre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNre(int nre) {
        this.nre = nre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDirección() {
        return dirección;
    }

    public int getEdad() {
        return edad;
    }

    public int getNre() {
        return nre;
    }

    @Override
    public String toString() {
        return "Estudiante: " + "Nombre: " + nombre + ", direccion: " + dirección + ", edad: " + edad + ", nre: " + nre;
    }
    
    

}
