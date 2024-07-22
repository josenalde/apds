public class Principal {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setNome("Agnes");
        p1.setTelefone("21 99999-9999");
        p1.setEndereco("Rua dos capitães, 2");
        Carro c1 = new Carro();
        c1.setModelo("Clio");
        c1.setPlaca("ESB 1234");
        c1.setCor("Prata");
        c1.setPessoa(p1);
        Carro c2 = new Carro();
        c2.setModelo("Pálio");
        c2.setPlaca("TRS 4321");
        c2.setCor("Branco");
        c2.setPessoa(p1);
        p1.adicionarCarro(c1);
        p1.adicionarCarro(c2);
        System.out.println("Carros de: " + p1.getNome());
        for (Carro c : p1.getCarro()) {
            System.out.println(c.getModelo());
        }
    }
}
