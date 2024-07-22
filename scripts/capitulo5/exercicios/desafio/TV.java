package capitulo5.exercicios.desafio;

public class TV extends Assinatura{
    private String categoria;
    
    public TV(String categoria){
        setCategoria(categoria);
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public float calcularCustoMensal() {
        if (categoria.equals("Standard")){
            return 50;
        }
        else{
            return 80;
        }
    }
    
    
    
}
