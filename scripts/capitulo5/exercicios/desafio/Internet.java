package capitulo5.exercicios.desafio;

public class Internet extends Assinatura{
    private int velocidadeConexaoMbps;

    public Internet(int velocidadeConexaoMbps){
        setVelocidadeConexaoMbps(velocidadeConexaoMbps);
    }
    
    public int getVelocidadeConexaoMbps() {
        return velocidadeConexaoMbps;
    }

    public void setVelocidadeConexaoMbps(int velocidadeConexaoMbps) {
        this.velocidadeConexaoMbps = velocidadeConexaoMbps;
    }

    @Override
    public float calcularCustoMensal() {
        if (velocidadeConexaoMbps == 50){
            return 100;
        }
        else{
            return 150;
        }
    }
    
    
    
}
