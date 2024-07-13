/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author conta
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s = 0;
        int tvalores = 0;
        int media = 0;
        int cem = 0;
        int tpares = 0, timpares = 0;
        
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um número: <br><em>(valor 0 interrompe)<em></html>"));
            if (n % 2 == 0) {
                tpares++;
            } else {
                timpares++;
            }
            
            s += n; 
            tvalores++;
            
            if (n >= 100) {
                cem++;
            }
            
        } while (n != 0); 
        tpares--;
        tvalores--;
        media = s / tvalores; 
        
        JOptionPane.showMessageDialog(null, "<html>Resultado final: <hr>" + "Total de valores: " + tvalores + "<br>Pares: " + tpares + "<br>Impares: " + timpares + "<br>Acima de 100: " + cem + "<br>Média: " + media + "</html>");
    }
    
}
