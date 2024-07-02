/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoreslogicos;

/**
 *
 * @author conta
 */
public class OperadoresLogicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x, y, z;
        x = 4;
        y = 7;
        z = 12;
        boolean p, q, r;
        p = (x<y && y<z)?true:false; // && -> E
        System.out.println(p);
        
        q = (x<y || y==z)?true:false; // || -> OU
        System.out.println(q);
        
        r = (x<y ^ y<z)?true:false; // || -> OU EXCLUSIVO
        System.out.println(r);
    }
    
}
