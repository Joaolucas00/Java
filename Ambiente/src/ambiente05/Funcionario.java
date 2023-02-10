package ambiente05;

public class Funcionario extends Pessoa {
    private String setor;
    private boolean trabalhando;
    
    /*
    public Funcionario(String s, boolean trab) {
        this.setor = s;
        this.trabalhando = trab;
    }
    */
    
    public void mudarTrab() {
        this.setTrabalhando(!this.isTrabalhando());
    }

    
    public String getSetor() {
        return setor;
    }

    public void setSetor(String s) {
        this.setor = s;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trab) {
        this.trabalhando = trab;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "setor=" + setor + ", trabalhando=" + trabalhando + '}';
    }
    
    
    
}
