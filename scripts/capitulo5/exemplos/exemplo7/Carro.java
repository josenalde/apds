package capitulo5.exemplos.exemplo7;

public class Carro implements Operar {

    private String modelo;
    private String cor;
    private String placa;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public void ligar() {
        System.out.println("Carro Ligado!");
    }
}
