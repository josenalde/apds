public class Monitor {
    String fabricante;
    float polegada;
    boolean estado;

    public String lerEstado() {
        if (estado) return "On";
        else return "Off";
    }

    public void mudaEstado() {
        estado = !estado;
    }

    public Monitor() {
        this.estado = false;
    }

}