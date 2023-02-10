package ambiente04;

public class Ambiente04 {

    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[2];
        p[0] = new Pessoa("Juan", 22, "M");
        
        p[1] = new Pessoa("Luan", 24, "M");
        
        l[0] = new Livro("Cosmos", "Carl Sagan", 321, p[0]);
        
        l[1] = new Livro("Sapiens", "Yuval Noah Harari", 202, p[0]);

        l[0].abrir();
        l[0].folhear(23);
        System.out.println(l[0].detalhes());
        l[0].fechar();
        System.out.println(l[1].detalhes());
    }
    
}
