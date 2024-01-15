/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cohete;

/**
 *
 * @author danielsotoortiz
 */
public class Cohete implements Cloneable{
    
    private static int numCohetes=0;

    public Cohete() {
        
        numCohetes++;
    }

    public int getNumCohetes() {
        return numCohetes;
    }

    @Override
    public Object clone(){
        Object obj=null;
        try{
            obj=super.clone();
            numCohetes++;
        }catch(CloneNotSupportedException ex){
            System.out.println(" no se puede duplicar");
        }
        return obj;
    }
    
    
    
    
    
    
}
