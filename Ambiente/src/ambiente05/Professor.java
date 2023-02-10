package ambiente05;

public class Professor extends Pessoa {
    private String especialidade;
    private int salario;

    
    /*
    public Professor(String esp, int sal) {
        this.especialidade = esp;
        this.salario = sal;
    }
    */
    
    public void receberAumento(int n) {
        this.setSalario(this.getSalario() + n);
    }
    
    public String getEspecialidade() {
        return this.especialidade;
    }
    
    public int getSalario() {
        return this.salario;
    }
    
    public void setEspecialidade(String esp) {
        this.especialidade = esp;
    }
    
    public void setSalario(int sal) {
        this.salario = sal;
    }
}
