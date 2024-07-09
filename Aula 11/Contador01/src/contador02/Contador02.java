/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contador02;

/**
 *
 * @author conta
 */
public class Contador02 {
    public static void main(String[] args) {
        // TODO code application logic here
        int cc = 0;
        while (cc < 10){
            cc++; //ou -> cc = cc + 1;
            if (cc == 3 || cc == 6 || cc == 9) {
                continue; // interrompe o fluxo natural e retorna para o while
            }
            System.out.println("Cambalhota: " + cc);
        }
        System.out.println("Fim");
    }
}
