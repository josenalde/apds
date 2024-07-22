package capitulo5.exemplos.exemplo7;

public class Barco implements Operar {

    private String tamanho;
    private float calado;

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public float getCalado() {
        return calado;
    }

    public void setCalado(float calado) {
        this.calado = calado;
    }

    @Override
    public void ligar() {
        System.out.println("Barco Ligado!");
    }
}
