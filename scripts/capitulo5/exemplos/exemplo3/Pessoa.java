import java.util.ArrayList;
import java.util.List;

public class Pessoa {

    private String nome;
    private String telefone;
    private String endereco;
    private List<Carro> listaCarros;

    public Pessoa() {
        listaCarros = new ArrayList();
    }

    public List<Carro> getCarro() {
        return listaCarros;
    }

    public void setCarro(List<Carro> listaCarros) {
        this.listaCarros = listaCarros;
    }

    public void adicionarCarro(Carro carro) {
        listaCarros.add(carro);
    }

    public void removerCarro(Carro carro) {
        listaCarros.remove(carro);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
