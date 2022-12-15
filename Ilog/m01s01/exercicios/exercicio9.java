import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        System.out.print("Qual o seu herói favorito ? ");
        Scanner scanner = new Scanner(System.in);
        String heroiFavorito = scanner.nextLine();
        System.out.println("Seu herói favorito é: " + heroiFavorito);
    }
    
}
