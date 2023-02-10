package ambiente06;

//import ambiente05.*;

public class Aluno extends Pessoa {
    private boolean matric;
    private String curso;
    
    /*
    public Aluno(boolean ma, String c) {
        this.curso = c;
        this.matric = ma;
    }
    */
    
    public void cancelMatric() {
        this.setMatric(!this.getMatric());
    }
    
    public void pagarMensalidade() {
        System.out.println("Pagando mensalidade... ");
    }

    public boolean getMatric() {
        return matric;
    }

    public void setMatric(boolean matric) {
        this.matric = matric;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
}
