import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importer a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);;
        // usei o Locate para permitir que use o (.) inves de (,) para os números decimais


        // exbir uma mensagem para o usuário
        System.out.println("BEM VINDO!");

        //obter pela classe os valores digitados no terminal
        System.out.println("Por favor, digite o número da conta !");
        int conta = scanner.nextInt();
        
        System.out.println("Por favor, digite o número da agencia!");
        String agencia = scanner.next();
        
        scanner.nextLine(); // Consumir a quebra de linha pendente

        System.out.println("Por favor, digite seu nome !");
        String nome = scanner.nextLine();;

        
        System.out.println("Por favor, digite o saldo da conta !");
        double saldo = scanner.nextDouble();

        
        //Exibir a mensagem da conta criada
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco. Sua agência é %s, conta %d e seu saldo R$%.2f já está disponível para saque!", nome, agencia, conta, saldo);
        // usei o printf para formatar o saldo com duas casas decimais

        scanner.close();
        // Encerrar o scanner para evitar vazamento de recursos
    }
}
