package capitulo5.exercicios.exercicio2;

public class Futebol extends Clube {
    private int vitorias;
    private int empates;
    private int derrotas;
    
    public Futebol(String nome, int vitorias, int empates, int derrotas) {
        super(nome);
        this.vitorias = vitorias;
        this.empates = empates;
        this.derrotas=derrotas;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    
    @Override
    public float calcularPontos() {
        return (3 * getVitorias()) + getEmpates();
    }
    
}
