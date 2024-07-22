package capitulo5.exemplos.exemplo1;

public class Professor extends Profissional {

    private int horasTrabalhadas;

    public Professor() {
        this(0);
    }

    public Professor(float salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public Professor(String cpf, String nome, float salarioBruto) {
        super(cpf, nome, salarioBruto);
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public float calcularSalarioLiquido(float desconto, float bonus) {
        return ((salarioBruto * horasTrabalhadas) * desconto) + bonus;
    }

    public float calcularSalarioLiquido(float desconto) {
        return ((getSalarioBruto() * horasTrabalhadas) * desconto);
    }

    @Override
    public String obterRegistroProfissional() {
        return getCpf();
    }
}
