package ambiente04;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    public Livro(String ti, String a, int totp, Pessoa l) {
        this.titulo = ti;
        this.autor = a;
        this.totPaginas = totp;
        this.leitor = l;
        this.aberto = false;
        this.pagAtual = 0;
        
    }
    
    public String detalhes() {
        System.out.println("--------------------");
        return "Livro{" + "titulo = " + titulo 
                + "\nautor = " + autor + "\n totPaginas = " 
                + totPaginas + ", pagAtual = " + pagAtual 
                + "\n leitor = " + leitor.getNome() + 
                ", sexo = " + leitor.getSexo() + ", idade = " + leitor.getIdade() +
                "\n aberto = " + aberto + '}';
    }
    
    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        if (aberto) {
            if (p > this.totPaginas) {
                System.out.println("O livro tem " + this.totPaginas + " paginas.");
            } else {
                this.pagAtual = p;
            }
        } else {
            System.out.println("Livro esta fechado.");
        }
    }

    @Override
    public void avancarPag() {
        if (this.aberto) {
            if (this.totPaginas == this.pagAtual) {
                System.out.println("Voce esta na ultima pagina.");
            } else {
                this.pagAtual++;
            }
        } else {
            System.out.println("Livro esta fechado.");
        }
    }

    @Override
    public void voltarPag() {
        if (this.aberto) {
            if (this.pagAtual == 0) {
                System.out.println("Voce esta na primeira pagina.");
            } else {
                this.pagAtual--;
            }
        } else {
            System.out.println("Livro esta fechado.");
        }
    }
    
    public String getTitulo() {
        return this.titulo;
    }
    
    public String getAutor() {
        return this.autor;
    }
    
    public int getTotPaginas() {
        return this.totPaginas;
    }
    
    public int getPagAtual() {
        return this.pagAtual;
    }
    
    public boolean getAberto() {
        return this.aberto;
    }
    
    public Pessoa getLeitor() {
        return this.leitor;
    }
    
    private void setTitulo(String t) {
        this.titulo = t;
    }
    
    private void setAutor(String a) {
        this.autor = a;
    }
    
    private void setTotPaginas(int tp) {
        this.totPaginas = tp;
    }
    
    private void setPagAtual(int pa) {
        this.pagAtual = pa;
    }
    
    private void setAberto(boolean ab) {
        this.aberto = ab;
    }
    
    private void setLeitor(Pessoa l) {
        this.leitor = l;
    }
    
}
