package capitulo5.exemplos.exemplo5;

import java.util.ArrayList;
import java.util.List;

public class Combo {

    private Pipoca pipoca;
    private List<Refrigerante> listaRefrigerantes;
    private List<Brinde> listaBrindes;

    public Combo() {
        listaRefrigerantes = new ArrayList();
        listaBrindes = new ArrayList();
    }

    public Pipoca getPipoca() {
        return pipoca;
    }

    public void setPipoca(Pipoca pipoca) {
        this.pipoca = pipoca;
    }

    public List<Refrigerante> getListaRefrigerantes() {
        return listaRefrigerantes;
    }

    public void setListaRefrigerantes(List<Refrigerante> listaRefrigerantes) {
        this.listaRefrigerantes = listaRefrigerantes;
    }

    public void adicionarRefrigerante(Refrigerante refrigerante) {
        listaRefrigerantes.add(refrigerante);
    }

    public void removerRefrigerante(Refrigerante refrigerante) {
        listaRefrigerantes.remove(refrigerante);
    }

    public List<Brinde> getListaBrindes() {
        return listaBrindes;
    }

    public void setListaBrindes(List<Brinde> listaBrindes) {
        this.listaBrindes = listaBrindes;
    }

    public void adicionarBrinde(Brinde brinde) {
        listaBrindes.add(brinde);
    }

    public void removerBrinde(Brinde brinde) {
        listaBrindes.remove(brinde);
    }
}
