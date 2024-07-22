package capitulo5.exercicios.desafio;

public class Streaming implements ContaMensal{

    public final static float CUSTO_CATALOGO = 5.0f;
    public final static float CUSTO_LANCAMENTO = 7.0f;
    private int filmesCatalogoAssistidos;
    private int filmesLancamentoAssistidos;
    
    public Streaming (int filmesCatalogoAssistidos, int filmesLancamentoAssistidos){
        setFilmesCatalogoAssistidos(filmesCatalogoAssistidos);
        setFilmesLancamentoAssistidos(filmesLancamentoAssistidos);
    }

    public int getFilmesCatalogoAssistidos() {
        return filmesCatalogoAssistidos;
    }

    public void setFilmesCatalogoAssistidos(int filmesCatalogoAssistidos) {
        this.filmesCatalogoAssistidos = filmesCatalogoAssistidos;
    }

    public int getFilmesLancamentoAssistidos() {
        return filmesLancamentoAssistidos;
    }

    public void setFilmesLancamentoAssistidos(int filmesLancamentoAssistidos) {
        this.filmesLancamentoAssistidos = filmesLancamentoAssistidos;
    }

    @Override
    public float calcularCustoMensal() {
        return (CUSTO_CATALOGO * getFilmesCatalogoAssistidos()) + (CUSTO_LANCAMENTO * getFilmesLancamentoAssistidos()); 
    }
    
}
