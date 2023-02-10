package ambiente03;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovado;
    
    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria())
                && l1 != l2){
            this.setAprovado(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        } else {
            this.setAprovado(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }

    public void lutar() {
        if (aprovado) {
            System.out.println("--> Desafiante <--");
            this.desafiante.apresentar();
            System.out.println("--> Desafiado <--");
            this.desafiado.apresentar();
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            System.out.println("===RESULTADO===");
            switch (vencedor) {
                case 0:
                    System.out.println("EMPATOU!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println("O " + this.desafiado.getNome() + " ganhou!!!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println("O " + this.desafiante.getNome() + " ganhou!!!");
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }
            System.out.println("===============");
        } else {
            System.out.println("Impossivel realizar a luta!");
        }
    }
            
    
    
    public Lutador getDesafiado() {
        return desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
    
    
    
}
