/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author conta
 */
public class EntradaDados {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); // entrada de dados (input)
        
        System.out.println("Informe seu nome: ");
        String nome = teclado.nextLine();
        
        System.out.println("Informe sua idade");
        int idade = teclado.nextInt();
        
        System.out.format("A idade de %s é %s \n", nome, idade);
    
    }
      
}
