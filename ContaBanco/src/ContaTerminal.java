import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) 
    {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o nome da Agência: ");
        String agencia = scanner.nextLine();
        
        System.out.println("Por favor, digite o número da Conta !");
        int numero = scanner.nextInt();

        // Consumir a linha restante
        scanner.nextLine();
 
        System.out.println("Digite seu Nome: ");
        String nome = scanner.nextLine();
         
        System.out.println("Digite seu saldo: ");
        double saldo = scanner.nextDouble();
 
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Olá " + nome + ", " + "obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo de " + saldo + " já está disponível para saque.");
        
    }
}
