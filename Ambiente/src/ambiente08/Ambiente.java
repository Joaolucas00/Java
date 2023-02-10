package ambiente08;

import java.util.Scanner;

public class Ambiente {

    public static void main(String[] args) {
        String palavra[] = {"P", "e", "i", "x", "e"};
        String jogadas[] = {};
        int n = 1;
        Scanner teclado = new Scanner(System.in);
        do {
            String palavraJogador = teclado.next();
            for (String elem: palavra) {
                System.out.println(elem);
            }
            
        } while(n <10);
        
    }
}
