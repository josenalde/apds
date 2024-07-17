public class Vantagem extends Clube {
    private float milhas;

    public Vantagem(String nome, float milhas) {
        super(nome);
        this.milhas = milhas;
    }

    @Override
    public float calcularPontos() {
        return milhas * 1.5f;
    }

    public float getMilhas() {
        return milhas;
    }

    public void setMilhas(float milhas) {
        this.milhas = milhas;
    }
}
