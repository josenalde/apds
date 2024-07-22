package capitulo5.exemplos.exemplo6;

public class Principal {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        f1.setCpf("111.111.111-11");
        f1.setNome("Paulo");
        Funcionario f2 = new Funcionario();
        f2.setCpf("222.222.222-22");
        f2.setNome("Marcelo");
        Funcionario f3 = new Funcionario();
        f3.setCpf("333.333.333-33");
        f3.setNome("Andre");
        f1.adicionarSupervisionado(f2);
        f1.adicionarSupervisionado(f3);
        f2.setSupervisor(f1);
        f3.setSupervisor(f1);
        Funcionario f4 = new Funcionario();
        f4.setCpf("444.444.444-44");
        f4.setNome("Gabriel");
        f4.setSupervisor(f3);
        f3.adicionarSupervisionado(f4);
    }
}
