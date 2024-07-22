package capitulo5.exemplos.exemplo2;

import capitulo5.exemplos.exemplo1.Engenheiro;

public class VetorObjetos {

    public static void main(String[] args) {
        Engenheiro[] engenheiros = new Engenheiro[10];
        for (int i = 0; i < engenheiros.length; i++) {
            engenheiros[i] = new Engenheiro();
        }
        for (Engenheiro eng : engenheiros) {
            System.out.println("Entre com o nome do engenheiro: ");
            String n = new java.util.Scanner(System.in).next();
            eng.setNome(n);
        }
    }
}
