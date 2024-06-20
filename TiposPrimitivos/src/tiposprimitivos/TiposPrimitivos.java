/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposprimitivos;

/**
 *
 * @author conta
 */
public class TiposPrimitivos {
    public static void main(String[] args) {
        String nome = "Karleandro";
        float nota = 8.5f;
        System.out.println("A sua nota é " + nota);
        
        System.out.printf("A nota de %s é %.2f \n", nome, nota); // 
        // %s = caractere | .2f = duas casas decimais | \n = pula linha
        
        System.out.format("A nota de %s é %s \n", nome, nota);
        
    }
    
}
