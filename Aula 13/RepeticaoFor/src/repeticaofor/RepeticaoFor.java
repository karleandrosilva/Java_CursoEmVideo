/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repeticaofor;

/**
 *
 * @author conta
 */
public class RepeticaoFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int cc = 1; cc <= 100; cc += 10) {
            System.out.printf("Cambalhota %s \n", cc);
        }
        
        /*
        MESMA COISA QUE: 
        int cc = 0;
        while (cc < 4) {
            System.out.printf("Cambalhota %s \n", cc+1);
            cc++;
        }
        */
    }
    
}
