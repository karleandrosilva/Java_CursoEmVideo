/*.
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operadoresaritmeticos;

/**
 *
 * @author conta
 */
public class Arredondamento {
    
    public static void main(String[] args) {
        float n = -10;
        int ar = (int) Math.abs(n); // não mostra o sinal somente o número
        int ar2 = (int) Math.floor(n); // arredonda para baixo
        int ar3 = (int) Math.ceil(n); // arredonda para cima
        int ar4 = (int) Math.round(n); // arredonda aritmeticamente
        System.out.println("Arredondamento para baixo: " + ar);
    }
    
}