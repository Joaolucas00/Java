package ambiente;
import java.util.Scanner;

public class Vetor implements VetorInterface {
    private String nome;
    private int tamanho;
    
    
    public Vetor(String n, int t) { //Este é o Método Contrutor.
        this.tamanho = t;
        this.nome = n;
    }
    
    
    @Override
    public void status(String v[]) {
        System.out.println("---------STATUS------------");
        System.out.println("Tamanho: " + this.getTamanho());
        System.out.println("Nome: " + this.getNome());
        System.out.print("Vetor: " + this.getNome() + " = ");
        this.mostrarVetorString(v);
        System.out.println("");
        System.out.print("---------------------------");
        System.out.println("");
        
    }
    
    
    public String[] criarVetor() {
        String v[] = new String[this.getTamanho()];
        Scanner input = new Scanner(System.in);
        for (int c=0; c<v.length; c++) {
            System.out.print(this.getNome() + "[" + c + "] = ");
            v[c] = input.nextLine();
            //this.mostrarVetorSring(v);
        }
        return v;
    }
    
    
    
    @Override
    public void mostrarVetorString(String v[]) {
        System.out.print("[");
        for (String elemento: v) {
            System.out.print(elemento + ", ");
        }
        System.out.print("]");
    }
    
    
    private int getTamanho() {
        return this.tamanho;
    }
    
    
    private String getNome() {
        return this.nome;
    }
    
    
    private void setNome(String n) {
        this.nome = n;
    }
    
    private void setTamanho(int t) {
        this.tamanho = t;
    }

    @Override
    public String[] criarVetorString() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    
}