
package ambiente02;

public class Ambiente02 {

    public static void main(String[] args) {
        ContaBanco juan = new ContaBanco();
        ContaBanco cleusa = new ContaBanco();
        juan.setDono("Juan");
        cleusa.setDono("Cleusa");
        juan.setNumConta(1111);
        cleusa.setNumConta(2222);
        juan.abrirConta("cc");
        System.out.println(juan.getSaldo());
        juan.depositar(540);
        System.out.println(juan.getSaldo());
        juan.fecharConta();
        cleusa.abrirConta("cp");
        juan.sacar(70);
        juan.pagarMensal();
        System.out.println(juan.getSaldo());
        juan.sacar(1000);
        cleusa.depositar(5321);
        juan.sacar(520);
        System.out.println(juan.getSaldo());
        juan.sacar(508);
        cleusa.sacar(4123);
        juan.fecharConta();
        juan.sacar(643);
        cleusa.pagarMensal();
        juan.pagarMensal();
        juan.depositar(53);
        juan.estadoAtual();
        cleusa.estadoAtual();
    }
}
