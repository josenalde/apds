package capitulo5.exercicios.desafio;

public class Celular extends Assinatura{
    
    public final static int FRANQUIA = 5000;
    public final static float CUSTO_MB_EXTRA = 0.01f;
    
    private int consumoMB;
    
    public Celular(int consumoMB){
        setConsumoMB(consumoMB);
    }

    @Override
    public float calcularCustoMensal() {
        if (consumoMB <= FRANQUIA){
            return 50;
        }
        else{
            float valorExtra = (consumoMB - FRANQUIA) * CUSTO_MB_EXTRA;
            return 50 + valorExtra;
        }
    }

    public int getConsumoMB() {
        return consumoMB;
    }

    public void setConsumoMB(int consumoMB) {
        this.consumoMB = consumoMB;
    }
    
    

}
