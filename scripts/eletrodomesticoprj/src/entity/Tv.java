package entity;

public class Tv extends Eletrodomestico {
    private int tamanho;
    private int canal;
    private int volume;

    public Tv(int tamanho, int voltagem) {
        super(false, voltagem);
        this.canal = 0;
        this.tamanho = tamanho;
        this.volume = 0;
    }
    
    @Override
    public void ligar() {
        super.setLigado(true);
        setCanal(3); //canal=0
        setVolume(25); // volume = 0;
    }
    
    @Override
    public void desligar() {
        super.setLigado(false);
        setCanal(0); //canal=0
        setVolume(0); // volume = 0;
    }

    public int getTamanho() {
        return tamanho;
    }
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    public int getCanal() {
        return canal;
    }
    public void setCanal(int canal) {
        this.canal = canal;
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Tv [tamanho=" + tamanho + ", canal=" + canal + ", volume=" + volume + ", esta " + super.isLigado()
                + ", com voltagem =" + super.getVoltagem() + "]";
    }

    

    
}
