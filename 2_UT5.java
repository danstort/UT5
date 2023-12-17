import java.util.Scanner;

/**
 *
 * @author danielsotoortiz
 */
public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        
        Cliente cliente1 = new Cliente();
        
        cliente1.setNombre(tec.nextLine());
        
        cliente1.setDireccion(tec.nextLine());
        
        cliente1.setEmail(tec.nextLine());
        
        cliente1.setEdad(tec.nextInt());
        
        System.out.println("Nombre "+cliente1.getNombre()+", dirección: "+cliente1.getDireccion()+", email: "+cliente1.getEmail()+", edad: "+cliente1.getEdad());
        
    
    }
        

        

    }



class Cliente {

    String nombre;
    String direccion;
    String email;
    int edad;

    Cliente() {

    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEmail() {
        return email;
    }

    public int getEdad() {
        return edad;
    }

    public Cliente(String nombre, String direccion, String email, int edad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.email = email;
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    
    

}
