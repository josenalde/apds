package capitulo5.exercicios.desafio;

public abstract class Assinatura implements ContaMensal{
    public final static float DESCONTO_SERVICO_ADICIONAL = 0.05f;
    
    public static float calcularDesconto(float valor, int quantidadeServicos){
        return (DESCONTO_SERVICO_ADICIONAL * quantidadeServicos) * valor;
    }
    
    @Override
    public abstract float calcularCustoMensal();
}
