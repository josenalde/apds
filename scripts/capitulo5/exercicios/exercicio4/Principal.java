package capitulo5.exercicios.exercicio4;

public class Principal {
    public static void main(String[] args) {
        Jogo jogo = new Jogo("Médio");
        Jogavel p1 = new Jogavel (jogo,"Rildo",100,3);
        NaoJogavel p2 = new NaoJogavel (jogo,"Nildo",100,false);
        jogo.adicionar(p1);
        jogo.adicionar(p2);
        p1.botaoA(p2);
        p1.botaoA(p2);
        p1.botaoB(p2);
        System.out.println("Vitalidade de " + p2.getNome() + " é " + p2.getVitalidade());
    }
}
