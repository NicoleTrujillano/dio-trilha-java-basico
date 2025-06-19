import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência !");
        System.out.print("Usuário: ");
        int numero = sc.nextInt();

        System.out.println("Agora digite o nome da Agência !");
        System.out.print("Agência: ");
        String agencia = sc.next();

        System.out.println("Por favor, insira seu nome !");
        System.out.print("Nome Cliente: ");
        String nome = sc.next();

        System.out.println("Por favor, digite o seu saldo !");
        System.out.print("Saldo: R$");
        float saldo = sc.nextFloat();

        System.out.println("Olá "+nome+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", "+
                "conta "+numero+" e seu saldo R$"+String.format("%.2f", saldo)+" já está disponível para saque.");
    }
}
