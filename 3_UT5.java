import java.util.Scanner;

/**
 *
 * @author danielsotoortiz
 */
public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        Rueda r1 = new Rueda();
        
        r1.setAnchura(50);
        r1.setPerfil(50);
        r1.setDiametroLlanta(50);
        
        Rueda r2 = r1;
        
        r1.setAnchura(88);
        
        System.out.println("R1"+r1.toString());
        
        System.out.println("R2"+r2.toString());
    
    
    
    }
        

        

    }


class Rueda {
    private int anchura;
    private int perfil;
    private int diametroLlanta;

    public Rueda() {
    }

    public Rueda(int anchura, int perfil, int diametroLlanta) {
        this.anchura = anchura;
        this.perfil = perfil;
        this.diametroLlanta = diametroLlanta;
    }
    
    public Rueda (Rueda r){
        this.anchura=r.getAnchura();
        this.diametroLlanta=r.getDiametroLlanta();
        this.perfil= r.getPerfil();
    }

    public void setAnchura(int anchura) {
        this.anchura = anchura;
    }

    public void setPerfil(int perfil) {
        this.perfil = perfil;
    }

    public void setDiametroLlanta(int diametroLlanta) {
        this.diametroLlanta = diametroLlanta;
    }

    

    public int getAnchura() {
        return anchura;
    }

    public int getPerfil() {
        return perfil;
    }

    public int getDiametroLlanta() {
        return diametroLlanta;
    }
    
    @Override
    public String toString() {
        return "Rueda{" + "anchura=" + anchura + ", perfil=" + perfil + ", diametroLlanta=" + diametroLlanta + '}';
    }
    
}
