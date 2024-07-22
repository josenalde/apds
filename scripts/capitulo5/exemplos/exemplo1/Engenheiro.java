package capitulo5.exemplos.exemplo1;

public class Engenheiro extends Profissional {

    public final static float PISO_SALARIAL = 7000;
    private String crea;

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }

    public static float calcularPisoCorrigido(float fatorTrabalhista) {
        return PISO_SALARIAL * fatorTrabalhista;
    }

    @Override
    public String obterRegistroProfissional() {
        return crea;
    }
}
