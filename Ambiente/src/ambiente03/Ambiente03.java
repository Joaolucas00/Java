package ambiente03;

public class Ambiente03 {

    public static void main(String[] args) {
        Lutador l[] = new Lutador[4];
        l[0] = new Lutador("Juan", "Mexico", 23, 5, 4, 1, 1.89f, 104.5f);
        l[1] = new Lutador("Luan", "Brasil", 31, 11, 5, 12, 1.99f, 69.5f);
        l[2] = new Lutador("Bostil", "pl", 46, 1, 16, 2, 1.87f, 92.4f);
        l[3] = new Lutador("lulu", "pt", 59, 2, 13, 1, 1.81f, 89.5f);
        Luta rinha = new Luta();
        rinha.marcarLuta(l[1], l[1]);
        rinha.lutar();
    }
    
}
