import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        //Exibir as mensagens para o nosso usuário
        System.out.println("Seja bem vindo(a) ao Banco DIO");
        System.out.println("Por favor, digite o número do Usuário: ");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da agência: ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número da conta: ");
        String conta = scanner.next();
        scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente: ");
        String cliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da conta: ");
        Double saldo = scanner.nextDouble();

        //Obter pela scanner os valores digitados no terminal

        //Exibir a mensagem conta criada
        System.out.println("Olá, " + cliente + ". Obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é: " + agencia);
        System.out.println("Sua conta é: " + conta);
        System.out.println("Seu saldo atual é: " + saldo);
    }
}
