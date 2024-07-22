package capitulo5.exercicios.exercicio2;

import java.util.ArrayList;
import java.util.Iterator;

public class Principal {

    public static void main(String[] args) {
        ArrayList<Pontuacao> lista = new ArrayList();
        Pontuacao p1 = new Futebol("Botafogo", 10, 1, 0);
        Pontuacao p2 = new Vantagem("321 grana", 1500);
        Pontuacao p3 = new CartaoProva(10, 5);

        lista.add(p1);
        lista.add(p2);
        lista.add(p3);

        Iterator<Pontuacao> iterator = lista.iterator();
        while (iterator.hasNext()) {
            System.out.println("Pontos: " + (iterator.next()).calcularPontos());
        }
    }
}
