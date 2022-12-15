package aula01.listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Listas {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("João");
        nomes.add("Maria");
        nomes.add("José");

        System.out.println(nomes);
        System.out.println("Vazia ? " + nomes.isEmpty());
        System.out.println(nomes.size());


        boolean apagou = nomes.remove("Maria");
        System.out.println("Apagou o " + apagou);   
        System.out.println(nomes);

        nomes.clear();
        System.out.println(nomes);
        System.out.println(nomes.size());

        List<Long> numeros = Arrays.asList(10l, 34l, 56l, 78l);
        // numeros.remove(56l); não permitido

        List<Long> copia = new ArrayList<>(numeros);
        numeros.set(2, 100l);

        System.out.println(numeros);
        System.out.println(copia);
        
        List<Long> outrosNumeros = List.of(12l, 32l, 65l); //  a partir do java 8 - imutável
        //outrosNumeros.remove(12l); // não permitido
        outrosNumeros.set(2, 100l);
    }
    
}
