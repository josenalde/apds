package capitulo5.exemplos.exemplo1;

import java.util.Date;

public class Principal {

    public static void main(String[] args) {
        Profissional prof1 = new Professor("111.111.111-11", "José", 100);
        Profissional prof2 = new Professor("222.222.222-22", "Pablo", 90);
        Profissional prof3 = new Engenheiro();
        prof3.setCpf("333.333.333-33");
        prof3.setNome("Jorge");
        prof3.setSalarioBruto(8500);
        ((Engenheiro) prof3).setCrea("1234");
        Profissional prof4 = new Medico();
        prof4.setCpf("444.444.444-44");
        prof4.setNome("Lucas");
        prof4.setSalarioBruto(9500);
        ((Medico) prof4).setCrm("4321");
        Imovel i1 = new Imovel();
        Date dataInicioContrato = new Date(2020, 01, 31);
        i1.setDataInicioContrato(dataInicioContrato);
        i1.setDescricao("Sede da Empresa");
        i1.setValorAluguel(1000.78f);
        imprimirDespesa(i1);
        imprimirDados(prof3);
        imprimirDespesa(prof3);
        imprimirDados(prof4);
        imprimirDespesa(prof4);
    }

    public static void imprimirDados(Profissional prof) {
        System.out.println("CPF: " + prof.getCpf());
        System.out.println("Nome: " + prof.getNome());
        System.out.println("Registro Profissional: " + prof.obterRegistroProfissional());
    }

    public static void imprimirDespesa(Balancete bal) {
        System.out.println("Despesa: " + bal.declararDespesa());
    }
}
