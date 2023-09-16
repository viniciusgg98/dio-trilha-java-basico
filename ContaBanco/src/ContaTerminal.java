import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //Trocando o idioma para utiliza . ao invelz de ,
        Locale.setDefault(Locale.US);
        //Criando metodo Scanner
        Scanner input = new Scanner(System.in);
        //Numero da agencia
        System.out.println("Qual o número da sua agência: ");
        String Agencia = input.nextLine();  

        //Loop do NumeroConta
        int NumeroConta = 0;
        while (true){
            try { 
                System.out.println("Digite o número da sua conta: ");
                NumeroConta = input.nextInt();
                input.nextLine();
                break;
                
            } catch (Exception e) {
                System.out.println("Apenas números inteiros");
                input.nextLine();
            }
        }

        //Nome
        System.out.println("Digite seu nome: ");
        String Nome = input.nextLine();

        //Loop do Saldo
        Double Saldo = 0.0;
        while (true){
            try { 
                System.out.println("Digite seu saldo: ");
                Saldo = input.nextDouble();
                break;
                
            } catch (Exception e) {
                System.out.println("Apenas números");
                input.nextLine();
            }
        }
        //Formatando para 2 casas apos a virgula e fechando o input
        String nSaldo = String.format("%.2f", Saldo);
        input.close();
        //Exibir a mensagem conta criada
        System.out.printf("\n\nOlá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %s já está disponível para saque" , Nome, Agencia , NumeroConta, nSaldo);
        
    }
}
