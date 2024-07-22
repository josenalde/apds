package capitulo5.exercicios.exercicio3;

public class Principal {
    public static void main(String[] args) {
        Projeto prj = new Projeto();
        prj.setNome("SisGerV");
        prj.setValor(10000);
        Empregado emp = new Empregado();
        emp.setNome("João");
        emp.setSalario(3500);
        Telefone tel = new Telefone();
        tel.setDdd("021");
        tel.setNumero("9999-9999");
        
        Alocacao alocacao = new Alocacao();
        alocacao.setHoras(40);
        
        alocacao.setEmpregado(emp);
        alocacao.setProjeto(prj);
        prj.adicionarAlocacao(alocacao);
        emp.adicionarAlocacao(alocacao);
        tel.setEmpregado(emp);
        emp.adicionarTelefone(tel);
       
    }
}
