package capitulo5.exercicios.exercicio1;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList <Integer> lista = new ArrayList();
        for (int i=0; i < 10; i++){
            lista.add(10-i);
        }
        for ( Integer i: lista){
            System.out.println(i);
        }
    }
}
