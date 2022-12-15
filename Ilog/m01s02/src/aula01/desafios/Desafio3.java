package aula01.desafios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Desafio3 {
    public static void main(String[] args) {
        //  int[] numeros = new int[5];
        //     numeros[0] = 1;
        //     numeros[1] = 2;
        //     numeros[2] = 3;
        //     numeros[3] = 4;
        //     numeros[4] = 5;
        //     //ou int[] numeros = {1, 2, 3, 4, 5};


        
        List<Integer> lista1 = Arrays.asList(5, 6, 7, 8, 9, 10);
        List<Integer> lista2 = List.of(5, 6, 7, 8, 9, 10);

        List<Integer> lista = new ArrayList<>();
        lista.set(0, 5); // indice zero, valor 5
        lista.set(1, 6);
        lista.set(2, 7);
        lista.set(3, 8);
        lista.set(4, 9);
        lista.set(5, 10);

        lista.get(0); // 5
        

    }
    
}
