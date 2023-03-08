import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        int idade;
        String nome;

        Scanner entrada = new Scanner(System.in);
        
        // System.out.print("Digite sua idade: ");
        // idade = entrada.nextInt();
        // System.out.println("Sua idade é de: " + idade + " anos");
        
        System.out.print("\nDigite seu nome: ");
        nome = entrada.nextLine();

        System.out.println("Seu nome é: " + nome);

        entrada.close();
    }
}