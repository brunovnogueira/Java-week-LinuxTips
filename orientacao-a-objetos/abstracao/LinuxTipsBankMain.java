
public class LinuxTipsBankMain {

    public static void main(String[] args) {

        System.out.println("Seja bem vinda ao linux tips bank");
        ContaCorrente ccKamila = new ContaCorrente("Bruno");
        ccKamila.consultarSaldo();
        System.out.println(ccKamila.getNome());
        ccKamila.fazerPix();


        ContaPoupanca cpKamila = new ContaPoupanca();
        cpKamila.consultarSaldo();
        cpKamila.fazerPix();

    }
}
