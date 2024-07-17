/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor01;

/**
 *
 * @author conta
 */
public class Vetor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n[] = {3, 5, 8, 7, 9};
        //int n[] = new int [4];
        
        System.out.printf("Total de casas: %s", n.length); // length -> comprimento
        
        for (int c = 0; c <= n.length-1; c++) {
            System.out.printf("\nNa posição %s temos o valor %s ",c, n[c]);
        } 
    }
    
}
