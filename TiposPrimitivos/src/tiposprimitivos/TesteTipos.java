/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiposprimitivos;

/**
 *
 * @author conta
 */
public class TesteTipos {
    public static void main(String[] args) { // método principal
        // convertendo um inteiro para String
        int idade = 30;
        String valor = Integer.toString(idade); // Integer = Inteiro - toString = Método
        System.out.println(valor);
        
        // ao contrário - String para inteiro
        String valor2 = "40";
        int idade2 = Integer.parseInt(valor2);
        System.out.println(idade2);
        
        // String para float
        String valor3 = "50.5";
        float idade3 = Float.parseFloat(valor3);
        System.out.println(idade3);
    }
}
