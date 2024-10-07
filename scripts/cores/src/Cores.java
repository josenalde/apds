import java.util.ArrayList;
import java.util.Collections;

public class Cores {
    public static void main(String[] args) throws Exception {
        ArrayList<String> lista = new ArrayList<String>();

        lista.add("VERDE");
        lista.add("AZUL");
        lista.add("VERMELHO");
        lista.add("AMARELO");
        lista.add("CINZA");

        //requisito 1
        lista.remove(2);
        System.out.println(lista); //chama toString nativo do ArrayList

        //requisito 2 (ordenar alfabeticamente ordem crescente)
        Collections.sort(lista, null); //Collections.reverseOrder()
        System.out.println(lista);

        //requisito 3
        alterar(lista, 2, "BRANCO");
        System.out.println(lista);

    }

    public static void alterar(ArrayList<String> L, int index, String cor) {
        L.set(index, cor);
    }
}
