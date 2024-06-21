/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operadoresaritmeticos;

/**
 *
 * @author conta
 */
public class OperadoresUnarios {
    public static void main(String[] args) {
        int a = 5; 
        a++; // ++ = Incremento
        System.out.println(a);
        
        int b = 5;
        b--; // -- = Decremento
        System.out.println(b);
        
        int numero = 5;
        int valor = 5 + ++numero; // ++VARIAVEL = pré-incremento
        System.out.println(valor); // 11, pois somou o 5 + 1 e depois o outro 5
        
        int numero2 = 5;
        int valor2 = 5 + numero2++; // VARIAVEL++ = pós-incremento
        System.out.println(valor2); // 10, pois só soma depois
        System.out.println(numero2); // 6, pois só somou quando acabou
    }
}
