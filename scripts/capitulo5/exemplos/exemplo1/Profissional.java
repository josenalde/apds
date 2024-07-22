package capitulo5.exemplos.exemplo1;

public abstract class Profissional implements Balancete {

    private String cpf;
    private String nome;
    protected float salarioBruto;

    public Profissional() {
        salarioBruto = 0;
    }

    public Profissional(String cpf, String nome, float salarioBruto) {
        this.cpf = cpf;
        this.nome = nome;
        this.salarioBruto = salarioBruto;
    }

    public String getCpf() {
        return cpf;
    }

    public final void setCpf(String cpf) {
        //código para validar o CPF
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(float salarioBruto) {
        if (salarioBruto >= 0) {
            this.salarioBruto = salarioBruto;
        }
    }

    public float calcularSalarioLiquido(float desconto, float bonus) {
        return (salarioBruto * desconto) + bonus;
    }

    public abstract String obterRegistroProfissional();

    @Override
    public float declararDespesa() {
        return salarioBruto;
    }
}
