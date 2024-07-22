package capitulo5.exercicios.desafio;

public class Principal {
    public static void main(String[] args) {
        Cliente cliente = new Cliente ("José");
        Streaming aluguel = new Streaming (1,1);
        cliente.setAluguel(aluguel);
        TV tv = new TV("Standard");
        Internet internet = new Internet(50);
        Celular celular = new Celular(5000);
        cliente.adicionarAssinatura(tv);
        cliente.adicionarAssinatura(internet);
        cliente.adicionarAssinatura(celular);
        System.out.println("Total a pagar: " + cliente.pagar()); 
    }
}
