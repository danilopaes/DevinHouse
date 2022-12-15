package aula02.condicionais;

public class CondicionalSwitchCase {

    public static void main(String[] args) {
        String cor = "verde";

        switch(cor){
            case "Azul":
            System.out.println("A cor do céu");
            break;
            case "verde":
            System.out.println("A cor das plantas");
            break;
            case "Dourada":
            System.out.println("Cor do ouro");
            break;
            default:
            System.out.println("Outra cor");
        }
        
        
    }

}
