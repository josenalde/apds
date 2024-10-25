import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class GeraEmailsInstitucionais {
    public static void main(String[] args) throws Exception {
        //obter o path completo clicando com o botão direito sobre o nome do arquivo docentes.csv e em copy path
        String path = "C:\\Users\\josen\\OneDrive\\ensino\\tads\\tad0009poo\\src\\list2_q2\\src\\docentes.csv";
        String line; // para guardar temporariamente cada linha do arquivo
        String[] parsedLine = new String[]{null}; // para guardar a linha já separada com cada parte em um vetor String
        ArrayList<String> emailsInstitucionais =  new ArrayList<String>(); // para guardar os e-mails gerados
        ArrayList<String> nomesDuplicados = new ArrayList<String>(); // apenas para guardar os nomes duplicados, só para conferência
        
        int d = 0; // apenas para guardar quantos duplicados encontrou (debug)
        //ideia de instanciar diretamente no try, portanto a memoria é liberada quando o escopo do try encerrar
        try (BufferedReader br = new BufferedReader(new FileReader(path))) { //Classes FileReader e BufferedReader trabalham sempre JUNTAS
            //ler linha do cabeçalho (primeira linha) só para descartar e pular a linha
            line = br.readLine(); //cabeçalho (descartar)
            //System.out.println(line); // se printar, irá aparecer o cabeçalho com os nomes de cada coluna do banco de dados
            line = br.readLine(); // lê a segunda linha do banco de dados, já com o primeiro docente
            
            while (line != null) { //equivale ao EOF do Scanner, ou seja, lê até o fim do arquivo, quando não há mais linhas para ler retorna NULL
                parsedLine = line.split(";"); // a linha separada por ; é armazenada no vetor parsedLine, logo, o nome é o segundo dado, de índice 1
                if (emailsInstitucionais.contains(generateEmail(parsedLine[1],false))) { // uso do contains para checar se já existe
                    //System.out.println("EMAIL DUPLICADO");
                    d+=1;
                    emailsInstitucionais.add(generateEmail(parsedLine[1],true)); // se já tem, adiciona segundo nome também. É tratado na função generateEmail
                    nomesDuplicados.add(parsedLine[1]); // só para debug
                } else {
                    emailsInstitucionais.add(generateEmail(parsedLine[1],false)); // se é a primeira vez, o segundo parâmetro é FALSE
                }
                line = br.readLine(); // lê próxima linha e volta o loop
            }
            //Collections.sort(nomesDuplicados); // ordena só para fins de exibição na tela
            //System.out.println(d + "nomes duplicados ");
            /*
            for (String n : nomesDuplicados)  {
                System.out.println(n);
            }*/
            Collections.sort(emailsInstitucionais); // ordena só para fins de exibição na tela
            for (String e : emailsInstitucionais)  {
                 System.out.println(e); // itera a lista e exibe os e-mails gerados
            }
        } catch(IOException e) {
            System.out.println("Error: " + e.getMessage()); // caso dê qualquer erro no processo, avisa aqui...
        }
    }
    // criada por Josenalde Oliveira. Recebe o nome docente e se o nome é duplicado ou não
    private static String generateEmail(String name, boolean isDuplicated) {
        String first, last, second;
        first = name.split(" ")[0];
        last = name.split(" ")[name.split(" ").length-1]; // para obter o último índice do vetor de partes do nome
        if (!isDuplicated) { // se não é duplicado, o nome é first.last@ufrn.br
            return (first + "." + last).toLowerCase() + "@ufrn.br";
        } else {
            second = name.split(" ")[1];
            return (first + "." + second + "." + last).toLowerCase() + "@ufrn.br";
        }
    }
}
