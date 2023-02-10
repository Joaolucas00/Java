package ambiente07;

public class Gafanhoto extends Pessoa {
    private boolean login;
    private int totAssistido;

    public Gafanhoto(String nome, int idade, String sexo, boolean login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }
    
    public void viuMaisUm() {
        if (login) {
            this.totAssistido += 1;
        } else {
            System.out.println("Nao esta logado.");
        }
    }

    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() + "\nlogin=" + login + ", totAssistido=" + totAssistido + '}';
    }

    public boolean isLogin() {
        return login;
    }

    public void setLogin(boolean login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
    
    
    
    
}
