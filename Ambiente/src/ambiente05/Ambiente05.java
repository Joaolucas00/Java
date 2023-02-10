package ambiente05;

public class Ambiente05 {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno alun1 = new Aluno();
        Funcionario func = new Funcionario();
        Professor prof = new Professor();
        
        p1.setNome("Juan");
        p1.setIdade(23);
        p1.setSexo("M");
        
        System.out.println(p1.getNome());
        
        alun1.setNome("Luan");
        alun1.setMatric(true);
        alun1.setCurso("Biologia");
        
        System.out.println(alun1.getMatric() + ", " +alun1.getCurso());
        
        
        func.setNome("Pedro");
        System.out.println(func.getNome());
    }
    
}
