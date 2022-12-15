package aula03.desafios;
public class DesafioForRepeticao02 {
    public static void main(String[] args) {
        double valor = 1200;
        int anos = 0;
        while (valor < 5000) {
            anos++;
            double perc = valor * 0.10;
            valor += perc;
            
        }
    }
    
}
