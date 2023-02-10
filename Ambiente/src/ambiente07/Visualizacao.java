package ambiente07;

public class Visualizacao {
    private Gafanhoto espectador;
    private Video filme;

    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.viuMaisUm();
        this.espectador.ganharExp(0.5f);
        this.filme.setViews(this.filme.getViews() + 1);
        this.filme.setReproduzindo(true);
    }


    public void Avaliar() {
        this.filme.setCurtidas(this.filme.getCurtidas() + 1);
        this.filme.setAvaliacao(this.filme.getAvaliacao() + 1);
    }
    
    public void Avaliar(int nota) {
        this.filme.setCurtidas(this.filme.getCurtidas() + 1);
        this.filme.setAvaliacao(this.filme.getAvaliacao() + nota);
    }
    
    public void Avaliar(float porc) {
        this.filme.setCurtidas(this.filme.getCurtidas() + 1);
        this.filme.setAvaliacao(this.filme.getAvaliacao() + porc);
    }

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" + espectador + ", filme=" + filme + '}';
    }
    
    
    
}
