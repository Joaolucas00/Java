package ambiente03;

public class Lutador implements LutadorInterface {
    private String nome, nacionalidade, categoria;
    private int idade, vitorias, derrotas, empates;
    private float altura, peso;
    
    public Lutador(String no, String na, int id, int vi, int de, 
            int em, float al, float pe) {
        this.setNome(no);
        this.setNacionalidade(na);
        this.setIdade(id);
        this.setVitorias(vi);
        this.setDerrotas(de);
        this.setEmpates(em);
        this.setAltura((float) al);
        this.setPeso( (float) pe);
    }

    @Override
    public void apresentar() {
        System.out.println("-------------------");
        System.out.println("Lutador " + this.getNome());
        System.out.println("Origem " + this.getNacionalidade());
        System.out.println("Tem " + this.getIdade() + " anos.");
        System.out.println(this.getAltura() + "m de altura");
        System.out.println("Pesando " + this.getPeso() + "Kg.");
        System.out.println("Vitorias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());
    }

    @Override
    public void status() {
        System.out.println("-------------------");
        System.out.println(this.getNome());
        System.out.println("Categoria " + this.getCategoria());
        System.out.println(this.getVitorias() + " vitorias.");
        System.out.println(this.getDerrotas() + " derrotas.");
        System.out.println(this.getEmpates() + " empates.");

    }

    @Override
    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);

    }

    @Override
    public void perderLuta() {
        this.setDerrotas( this.getDerrotas() + 1);
        
    }

    @Override
    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }

    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getIdade() {
        return idade;
    }

    public int getVitorias() {
        return vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public float getAltura() {
        return altura;
    }

    public float getPeso() {
        return peso;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    private void setCategoria() {
        if (this.peso < 52.2) {
            this.categoria = "Invalido";
        } else if (this.peso <= 70.3) {
            this.categoria = "Leve";
        } else if (this.peso <= 83.9) {
            this.categoria = "Medio";
        } else if (this.peso <= 120.2) {
            this.categoria = "Pessado";
        } else {
            this.categoria = "Invalido";
        }
    }

    private void setIdade(int idade) {
        this.idade = idade;
    }

    private void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    private void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    private void setEmpates(int empates) {
        this.empates = empates;
    }

    private void setAltura(float altura) {
        this.altura = altura;
    }

    private void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }
}
