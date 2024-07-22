package capitulo5.exemplos.exemplo1;

import java.util.Date;

public class Imovel implements Balancete{

    private String descricao;
    private Date dataInicioContrato;
    private float valorAluguel;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataInicioContrato() {
        return dataInicioContrato;
    }

    public void setDataInicioContrato(Date dataInicioContrato) {
        this.dataInicioContrato = dataInicioContrato;
    }

    public float getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(float valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    @Override
    public float declararDespesa() {
        return valorAluguel;
    }

}
