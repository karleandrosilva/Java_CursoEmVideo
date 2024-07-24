/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testefuncao2;

/**
 *
 * @author conta
 */
public class TesteFuncao2 {

    /**
     * @param args the command line arguments
     */
    
    static int soma (int a, int b) {
        int s = a + b;
        return s;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Começou agora");
        int sm = soma(5, 2);
        System.out.printf("A soma vale: %s", sm);
        
    }
    
}
