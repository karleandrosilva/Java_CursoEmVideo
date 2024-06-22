/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operadoresaritmeticos;

/**
 *
 * @author conta
 */
public class GeradorNumeros {
    public static void main(String[] args) {
        double aleatorio = Math.random(); // gera numeros entre 0.0 a 1.0
        System.out.println("Número aleatório: " + aleatorio);
        
        int n = (int) (5 + aleatorio * (10-5)); // gera numeros entre 5 e 10
        int v = (int) (10 + aleatorio * (20-10)); // gera numeros entre 10 e 20 
        System.out.println(v);
    }
    
}
