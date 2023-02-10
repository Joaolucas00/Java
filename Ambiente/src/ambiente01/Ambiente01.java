package ambiente01;

public class Ambiente01 {

    public static void main(String[] args) {
        Vetor vetor = new Vetor();
        vetor.nome = "Vetor02";
        vetor.tamanho = 3;
        String lista[] = vetor.criarVetorString();
        //vetor.mostrarVetorSring(lista);
        System.out.println("Mostrando... ");
        System.out.println(vetor);
    }
    
}
