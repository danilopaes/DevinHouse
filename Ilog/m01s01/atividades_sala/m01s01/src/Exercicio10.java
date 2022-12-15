import java.time.LocalDate;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        System.out.print("Qual o seu ano de nascimento ? ");
        Scanner scanner = new Scanner(System.in);
        
        int anoNascimento = scanner.nextInt();  
        LocalDate hoje = LocalDate.now();
        int anoAtual = hoje.getYear();
        int idadeCalculada = anoAtual - anoNascimento;
        System.out.println("Sua idade é: " + idadeCalculada);

    }
    
}
