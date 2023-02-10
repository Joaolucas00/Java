package ambiente05;

//import ambiente04.*;

public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;
    
    /*
    public Pessoa(String n, int i, String s) {
        this.nome = n;
        this.idade = i;
        this.sexo = s;
        
    }
    */
    
    public void fazerAniver() {
        this.idade++;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public int getIdade() {
        return this.idade;
    }
    
    public String getSexo() {
        return this.sexo;
    }
    
    protected void setNome(String n) {
        this.nome = n;
    }
    
    protected void setIdade(int i) {
        this.idade = i;
    }
    
    protected void setSexo(String s) {
        this.sexo = s;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
    }
    
    
}
