package capitulo5.exemplos.exemplo2;

public class ManipulacaoVetorMatriz {

    public static void main(String[] args) {
        int[] idadeAlunos = new int[10];
        float[][] notasAlunos = new float[10][3];
        for (int i = 0; i < idadeAlunos.length; i++) {
            System.out.println("Entre com a idade do " + (i + 1) + "º aluno: ");
            idadeAlunos[i] = new java.util.Scanner(System.in).nextInt();
        }
        for (int i = 0; i < notasAlunos.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Entre com a nota da AV" + (j + 1) + " do " + (i + 1) + "º aluno: ");
                notasAlunos[i][j] = new java.util.Scanner(System.in).nextFloat();
            }
        }
    }
}
