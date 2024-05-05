import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       Scanner leia = new Scanner(System.in);
       System.out.println("Insira o número da agência: ");
       String agencia = leia.nextLine();

       System.out.println("Insira o número da Conta: ");
       int conta = leia.nextInt();

       System.out.println("Insira seu saldo: ");
       Double saldo = leia.nextDouble();

       System.out.println("Insira seu nome: ");
       String nome = leia.next();
       
       System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " , conta " + conta + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
