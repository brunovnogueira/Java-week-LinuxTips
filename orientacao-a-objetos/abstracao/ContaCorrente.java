
class ContaCorrente implements Conta {
    private String nome;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public void consultarSaldo() {
        System.out.println("seu saldo é 1234");
    }

    @Override
    public void fazerPix() {
        System.out.println("digite o valor que voce deseja transferir");

    }

    public ContaCorrente(String nome) {
        this.nome = nome;
    }

}
