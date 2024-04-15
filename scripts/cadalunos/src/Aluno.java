public class Aluno {
    private String nome;
    private int matricula;
    private Float nota1;
    private Float nota2;
    private Float nota3;
    private Float media;
    private String situacao;

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public Float getNota1() {
        return nota1;
    }

    public Float getNota2() {
        return nota2;
    }

    public Float getNota3() {
        return nota3;
    }

    public Float getMedia() {
        return media;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setNota1(Float nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(Float nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(Float nota3) {
        this.nota3 = nota3;
    }

    public void setMedia(Float media) {
        this.media = media;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public void setNotas(Float n1, Float n2, Float n3) {
        this.nota1 = n1;
        this.nota2 = n2;
        this.nota3 = n3;
    }

    public Aluno() {

    }

    public void calcularMedias() {
        this.media = (this.nota1 + this.nota2 + this.nota3) / 3;
    }

    public void informarSituacao() {
        this.calcularMedias();

        if (media >= 0.0 && media < 3.0)
            this.situacao = "Reprovado(a)";
        else if (media >= 3.0 && media < 7.0)
            this.situacao = "Em recuperação...";
        else if (media > 7.0)
            this.situacao = "Aprovado(a)";
    }

    public boolean buscarAluno(int matricula) {
        //System.out.println(matricula);
        if (this.matricula == matricula) {
            // System.out.println(this.matricula == matricula);
            return true;
        } else
            return false;
    }

    public void alterarNota(int codNota, Float valorNota) {
        switch (codNota) {
            case 1:
                this.nota1 = valorNota;
                break;
            case 2:
                this.nota2 = valorNota;
                break;
            case 3:
                this.nota3 = valorNota;
                break;
        }
    }

    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", matricula=" + matricula + ", nota1=" + nota1 + ", nota2=" + nota2 + ", nota3="
                + nota3 + ", media=" + media + ", situacao=" + situacao + "]";
    }
}