package entity;
public class Radio extends Eletrodomestico {
    private int volume;
    private float sintonia;
    private int banda;
    //constantes em Java (final - imutável, static - pertencem à classe Radio, não necessita instanciar objeto para acessar)
    public static final short AM = 1;
    public static final short FM = 2;

    public Radio(int voltagem) {
        super(false, voltagem);
        setBanda(Radio.FM);
        setSintonia(0);
        setVolume(0);
    }

    @Override
    public void desligar() {
        super.setLigado(false);
        setSintonia(0); //canal=0
        setVolume(0); // volume = 0;
    }
    @Override //sobrescrita
    public void ligar() {
        super.setLigado(true);
        setSintonia(92.5f);
        setVolume(25);
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public float getSintonia() {
        return sintonia;
    }

    public void setSintonia(float sintonia) {
        this.sintonia = sintonia;
    }

    public int getBanda() {
        return banda;
    }

    public void setBanda(int banda) {
        this.banda = banda;
    }


}
