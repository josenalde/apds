package capitulo5.exercicios.exercicio2;

public class CartaoProva implements Pontuacao {

    private int acertos;
    private int erros;

    public CartaoProva(int acertos, int erros){
        this.acertos = acertos;
        this.erros = erros;
    }
    
    public int getAcertos() {
        return acertos;
    }

    public void setAcertos(int acertos) {
        this.acertos = acertos;
    }

    public int getErros() {
        return erros;
    }

    public void setErros(int erros) {
        this.erros = erros;
    }

    @Override
    public float calcularPontos() {
        return (acertos * 2) - erros;
    }
}
