public class Circulo extends FiguraGeometrica {
    private float raio;
    //constructor

    public Circulo(float raio) {
        this.raio = raio;
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        if (raio > 0)
            this.raio = raio;
    }

    public float calcularCircunferencia() {
        return (float) (2*Math.PI * raio);
    }

    @Override
    public float calcularArea() {
        return (float) (Math.PI*Math.pow(raio,2)); // raio*raio
    }
    
    
}
