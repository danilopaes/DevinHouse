package aula02.condicionais;
public class CondicionalIF {
    public static void main(String[] args) {
        int  idade = 20;
        if (idade < 0){
            System.out.println("Idade invalida");
        }else if(idade < 12){
            System.out.println("Criança");
        }else if(idade < 18){
            System.out.println("Adolescente");
    }else if (idade < 60){
            System.out.println("Adulto");
        }else{
            System.out.println("Idoso");
        }
    }
    
}
