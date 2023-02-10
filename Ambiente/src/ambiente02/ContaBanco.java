package ambiente02;

class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    
    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (t == "cc") {
            this.saldo += 50;
        } else if (t == "cp") {
            this.saldo += 150;
        } else {
            System.out.println("Digite apenas cc ou cp.");
        }
    }
    
    
    public void fecharConta() {
        if (this.saldo > 0) {
            System.out.println("Conta com dinheiro. Não posso fechar a conta.");
        } else if (this.saldo < 0) {
            System.out.println("Conta com saldo negativo. Não posso fechar.");
        } else {
            this.status = false;
            System.out.println("Conta fechada com sucesso.");
        }
    }
    
    
    public void depositar(float dinheiro) {
        if (this.status) {
            this.saldo += dinheiro; 
        } else {
            System.out.println("Impossivel depositar.");
        }
    }
    
    
    public void sacar(float dinheiro) {
        if (this.status) {
            if (dinheiro <= this.saldo) {
                this.saldo -= dinheiro;
            } else {
                System.out.println("Nao tem como sacar mais do que isso.");
            }
        } else {
            System.out.println("Impossivel sacar.");
        }
    }
    
    public void pagarMensal() {
        if (this.status) {
            int v = 0;
            if (this.tipo == "cc") {
                v = 12;
            } else if (this.tipo == "cp") {
                v = 20;
            }
            this.saldo -= v;
        } else {
            System.out.println("Impossivel pagar.");
        }
    }
    
    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    public int getNumConta() {
        return numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDono() {
        return dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public boolean isStatus() {
        return status;
    }
    
    public void estadoAtual() {
        System.out.println("----------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.isStatus());
        System.out.println("----------");
    }
}
