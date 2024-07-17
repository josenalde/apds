import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Pontuacao> lista = new ArrayList<Pontuacao>();
        Pontuacao p1 = new Futebol("Espanha", 10, 1, 0);
        Pontuacao p2 = new Vantagem("Visa", 1500);
        Pontuacao p3 = new CartaoProva(10,5);

        lista.add(p1);
        lista.add(p2);
        lista.add(p3);

        for (Pontuacao p : lista) {
            System.out.println("Pontos: " + p.calcularPontos());
        }
        /*
         Iterator<Pontuacao> iterator = lista.iterator();
         while (iterator.hasNext()) {
            sout("Pontos: " + (iterator.next()).calcularPontos());
         }
         */

    }
}
