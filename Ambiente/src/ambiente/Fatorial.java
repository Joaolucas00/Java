package ambiente;

public class Fatorial {
    
    public int fatorialRecursivo(int n) {
        if (n == 0) {
            return 1;
        }
        System.out.println(n);
        System.out.println(this.fatorialRecursivo(n-1) * n);
        return fatorialRecursivo(n-1)*n;
    }
}
