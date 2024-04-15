import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Aluno> alunos = new ArrayList<Aluno>();

        Scanner reader = new Scanner(System.in);
        int op;
        do {
            System.out.println("-----------------------");
            System.out.println("MENU PRINCIPAL");
            System.out.println("-----------------------");
            System.out.println("1 - CADASTRAR ALUNOS");
            System.out.println("2 - CADASTRAR NOTAS");
            System.out.println("3 - CALCULAR MÉDIAS");
            System.out.println("4 - INFORMAR SITUAÇÕES");
            System.out.println("5 - INFORMAR DADOS DE UM ALUNO");
            System.out.println("6 - ALTERAR NOTA");
            System.out.println("7 - SAIR");

            // System.out.println(alunos.size());
            op = reader.nextInt();
            switch (op) {
                case 1: {
                    /*
                     * for (int i = 0; i < 3; i++) {
                     * Aluno a = new Aluno();
                     * System.out.print("Nome: ");
                     * a.setNome(reader.nextLine());
                     * if (i == 0)
                     * reader.nextLine();
                     * System.out.print("Matrícula: ");
                     * a.setMatricula(Integer.parseInt(reader.nextLine()));
                     * alunos.add(a);
                     * }
                     */
                    Aluno a = new Aluno();
                    a.setNome("joao maria");
                    a.setMatricula(123);
                    alunos.add(a);
                    Aluno b = new Aluno();
                    b.setNome("pedro silva");
                    b.setMatricula(456);
                    alunos.add(b);
                    Aluno c = new Aluno();
                    c.setNome("maria azevedo");
                    c.setMatricula(678);
                    alunos.add(c);
                }
                    break;

                case 2: {
                    Float n1, n2, n3;
                    int i = 0;
                    for (Aluno a : alunos) { // for each
                        // System.out.println("Notas 1, 2, 3 de " + a.getNome() + ":");
                        // if (i == 0)
                        // reader.nextLine();
                        // n1 = Float.parseFloat(reader.nextLine());
                        // n2 = Float.parseFloat(reader.nextLine());
                        // n3 = Float.parseFloat(reader.nextLine());
                        // a.setNotas(n1,n2,n3);
                        n1 = Float.parseFloat("3.0");
                        n2 = Float.parseFloat("4.0");
                        n3 = Float.parseFloat("5.0");

                        a.setNotas(n1, n2, n3);
                        // System.out.println(a.getNota1());
                        // System.out.println(a.getNota2());
                        // System.out.println(a.getNota3());
                        i++;
                    }
                    break;
                }
                case 3: {
                    for (Aluno a : alunos) {
                        a.calcularMedias();
                        // System.out.println(a.getMedia());
                    }
                    break;
                }
                case 4: {
                    for (Aluno a : alunos) {
                        a.informarSituacao();
                        System.out.println(a.getNome() + " com média: " + a.getMedia() + " está " + a.getSituacao());
                    }
                    break;
                }
                case 5: {
                    System.out.flush();
                    boolean found = false;
                    System.out.println("Informe matricula: ");
                    reader.nextLine();
                    for (Aluno a : alunos) {
                        if (a.buscarAluno(Integer.parseInt(reader.nextLine())) && !found) {
                            // System.out.println("Achei...");
                            System.out.println(a.toString());
                            found = true;
                            break;
                        }
                    }
                    if (!found)
                        System.out.println("Estudante nao encontrado(a)...");
                    break;
                }
                case 6: {
                    boolean found = false;
                    System.out.println("Informe matricula: ");
                    reader.nextLine();
                    for (Aluno a : alunos) {
                        if (a.buscarAluno(Integer.parseInt(reader.nextLine())) && !found) {
                            System.out.println(a.toString());
                            System.out.println("Qual nota deseja alterar (1, 2 ou 3?) e qual o novo valor da nota?");
                            a.alterarNota(Integer.parseInt(reader.nextLine()), Float.parseFloat(reader.nextLine()));
                            a.informarSituacao();
                            System.out
                                    .println(a.getNome() + " com média: " + a.getMedia() + " está " + a.getSituacao());
                            found = true;
                            break;
                        }
                    }
                    if (!found)
                        System.out.println("Estudante nao encontrado(a)...");
                    break;
                }
            }
        } while (op != 7);
    }
}
