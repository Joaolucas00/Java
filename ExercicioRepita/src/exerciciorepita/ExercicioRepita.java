/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepita;
import javax.swing.JOptionPane;
/**
 *
 * @author João Lucas
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float n, s=0, tot=0, totpar=0, totimpar=0, totcem=0, media;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "<html> Informe um numero: (valor 0 interrompe)<html>"));
            s += n;
            if (n != 0) {
                tot ++;
            }
            if (n % 2 == 0 && n != 0) {
                totpar ++;
            } else if (n % 2 != 0 && n != 0) {
                totimpar ++;
            }
            if (n>=100) {
                totcem ++;
            }
        } while (n != 0);
        media = s/tot;
        JOptionPane.showMessageDialog(null, "<html>Resultado final<br>----------------------" +
                "<br>Somatorio vale: " + s + "<br>Total de pares: " + totpar + "<br> Total de impares: " + totimpar +
                "<br>Acima de 100: " + totcem + "<br>Media dos valores: " + media + "<br>Total de valores: " + tot);
    }
    
}
