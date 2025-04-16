import entity.Radio;
import entity.Tv;
public class App {
    public static void main(String[] args) throws Exception {
        Tv mytv = new Tv(32, 220);
        Radio myradio = new Radio(220);

        mytv.ligar();
        System.out.println(mytv.toString());
        myradio.ligar();
        System.out.println(myradio.isLigado()?"ligado":"desligado");
        myradio.desligar();
        System.out.println(myradio.isLigado()?"ligado":"desligado");
    }
}
