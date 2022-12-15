package aula03.repeticao;

import java.util.List;

public class RepeticaoForArrysLista {
    public static void main(String[] args) {
       String[] cores = {"vermelho", "branco", "preto"};
         for (int i = 0; i < cores.length; i++){
            System.out.println(cores[i]);
         }

       List<String> coresStr = List.of("vermelho", "branco", "preto");
         for(int i = 0; i < coresStr.size(); i++){
            System.out.println(coresStr.get(i));  
         }  
    }

}
