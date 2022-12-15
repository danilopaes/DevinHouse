package aula02.condicionais;
public class Pratica02 {
    public static void main(String[] args) {
        
        float[] notas = { 10f , 5f, 7f, 8.5f};

        float media = (notas[0] + notas[1] + notas[2] + notas[3]) / notas.length;

        boolean passou;

        if(media >=7){
            passou = true;
        } else {
            passou = false;
        }

        System.out.println(String.format("Media = %f e passou = %s", media, passou));

    }
    
}
