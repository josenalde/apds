package capitulo5.exemplos.exemplo7;

public class VeiculoAnfibio implements Operar {

    private Operar carro;
    private Operar barco;

    public VeiculoAnfibio(Carro carro, Barco barco) {
        this.carro = carro;
        this.barco = barco;
    }

    @Override
    public void ligar() {
        getCarro().ligar();
        getBarco().ligar();
    }

    public Operar getCarro() {
        return carro;
    }

    public void setCarro(Operar carro) {
        this.carro = carro;
    }

    public Operar getBarco() {
        return barco;
    }

    public void setBarco(Operar barco) {
        this.barco = barco;
    }
}
