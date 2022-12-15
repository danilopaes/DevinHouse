package aula02.condicionais;
public class Pratica01 {
    public static void main(String[] args) {
        
        int idade = 18;
        String resultado;

        if (idade >= 18){
            resultado = "Maior de idade";
        } else {
            resultado = "Menor de idade";
        }
        
        System.out.println(resultado);
    }
    
}
