package aula03.desafios;

public class DesafioForRepeticao {
    public static void main(String[] args) {
        int[] numeros = {5, 7, -7, -4, 3, -9, 0, 12, -34, 0, 3, 6, 9};

        int positivos = 0;
        int negativos = 0;
        int zeros = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                positivos++;
            } else if (numeros[i] < 0) {
                negativos++;
            } else {
                zeros++;
            }
        }
        System.out.println("QTD de positivos: " + positivos);
        System.out.println("QTD de negativos: " + negativos);
        System.out.println("QTD de zeros: " + zeros);
    }
    
}
