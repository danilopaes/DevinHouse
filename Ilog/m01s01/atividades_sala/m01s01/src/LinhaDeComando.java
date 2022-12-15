import java.util.Scanner;

public class LinhaDeComando {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu primeiro nome: ");
        String nome = scanner.next();
        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("O nome informado foi: " + nome + " e a idade informada foi: " + idade );
    }
    
}
