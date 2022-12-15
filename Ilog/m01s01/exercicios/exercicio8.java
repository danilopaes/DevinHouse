public class exercicio8 {
    public static void main(String args[]) {

        String nomeTime = "Tabajara F.C.";
        int vitoria =12;
        int derrotas = 2;
        int empates = 6;
        int partidas = vitoria + derrotas + empates;
        int pontos = (vitoria * 3) + (empates * 1) + (derrotas * 0);
        System.out.println("O time " + nomeTime + "acumulou " + pontos + " pontos após jogar " + partidas + " partidas.");
    }
    
}
