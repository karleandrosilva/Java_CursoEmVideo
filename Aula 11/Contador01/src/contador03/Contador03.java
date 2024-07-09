/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contador03;

/**
 *
 * @author conta
 */
public class Contador03 {
    public static void main(String[] args) {
        // TODO code application logic here
        int cc = 0;
        while (cc < 10){
            cc++; //ou -> cc = cc + 1;
            if (cc == 2 || cc == 4 || cc == 6) {
                continue; // interrompe o fluxo natural e retorna para o while
            }
            if (cc == 7) {
                break; // interrome a execução do while
            }
            System.out.println("Cambalhota: " + cc);
        }
        System.out.println("Fim");
    }
}
