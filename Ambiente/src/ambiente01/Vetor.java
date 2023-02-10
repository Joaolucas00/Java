package ambiente01;
import java.util.Scanner;

public class Vetor {
    protected String nome;
    public int tamanho;
    
    
    
    public void status(String v[]) {
        System.out.println("---------STATUS------------");
        System.out.println("Tamanho: " + this.tamanho);
        System.out.println("Nome: " + this.nome);
        System.out.print("vetor " + nome + ": ");
        System.out.print("[");
        for (String elemento: v) {
            System.out.print(elemento + ", ");
        }
        System.out.print("]");
        System.out.println("");
        System.out.print("---------------------------");
        System.out.println("");
        
    }
    public String[] criarVetorString() {
        String v[] = new String[tamanho];
        Scanner input = new Scanner(System.in);
        for (int c=0; c<v.length; c++) {
            System.out.print(nome + "[" + c + "] = ");
            v[c] = input.nextLine();
        }
        return v;
}
    public void mostrarVetorSring(String v[]) {
        System.out.print("[");
        for (String elemento: v) {
            System.out.print(elemento + ", ");
        }
        System.out.print("]");
    }
    
}