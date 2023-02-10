package ambiente06;

public class Ambiente06 {

    public static void main(String[] args) {
        Bolsista b1 = new Bolsista();
        Aluno a1 = new Aluno();       
        
        b1.setNome("Juan");
        b1.setIdade(22);
        b1.setSexo("M");
        b1.setMatric(true);
        b1.setCurso("Fisica");
        b1.fazerAniver();
        b1.pagarMensalidade();
        b1.renovarBolsa();
        System.out.println(b1.toString());
        System.out.println(b1.getCurso());
        System.out.println(b1.getMatric());
    }
    
}
