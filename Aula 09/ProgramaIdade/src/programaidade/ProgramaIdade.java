/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programaidade;

import java.util.Scanner;

/**
 *
 * @author conta
 */
public class ProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe seu ano de nascimento: ");
        int nascimento = teclado.nextInt();
        int idade = 2024 - nascimento;
        System.out.printf("Você tem %s anos", idade);
        
        if (idade >= 18) {
            System.out.printf(", e é maior de idade!");
        } else {
            System.out.printf(", e é menor de idade!");
        }
    }
    
}
