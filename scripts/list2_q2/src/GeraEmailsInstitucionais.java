import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class GeraEmailsInstitucionais {
    public static void main(String[] args) throws Exception {
        String path = "C:\\Users\\josen\\OneDrive\\ensino\\tads\\tad0009poo\\src\\list2_q2\\src\\docentes.csv";
        String line;
        String[] parsedLine = new String[]{null};
        ArrayList<String> emailsInstitucionais =  new ArrayList<String>();
        ArrayList<String> nomesDuplicados = new ArrayList<String>();
        int d = 0;
        //ideia de instanciar diretamente no try, portanto a memoria é liberada quando o escopo do try encerrar
        try (BufferedReader br = new BufferedReader(new FileReader(path))) { //neste caso não precisa do finally
            //ler linha a linha
            line = br.readLine(); //cabeçalho (descartar)
            //System.out.println(line);
            line = br.readLine();
            //System.out.println(line);
            while (line != null) { //equivale ao EOF do Scanner
                parsedLine = line.split(";");
                if (emailsInstitucionais.contains(generateEmail(parsedLine[1],false))) {
                    //System.out.println("EMAIL DUPLICADO");
                    d+=1;
                    emailsInstitucionais.add(generateEmail(parsedLine[1],true));
                    nomesDuplicados.add(parsedLine[1]);
                } else {
                    emailsInstitucionais.add(generateEmail(parsedLine[1],false));
                }
                line = br.readLine();
            }
            Collections.sort(nomesDuplicados);
            Collections.sort(emailsInstitucionais);
            System.out.println(d + "nomes duplicados ");
            /*
            for (String n : nomesDuplicados)  {
                System.out.println(n);
            }*/
            for (String e : emailsInstitucionais)  {
                 System.out.println(e);
            }
        } catch(IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    private static String generateEmail(String email, boolean isDuplicated) {
        String first, last, second;
        //System.out.println(email);
        first = email.split(" ")[0];
        last = email.split(" ")[email.split(" ").length-1];
        if (!isDuplicated) {
            return (first + "." + last).toLowerCase();
        } else {
            second = email.split(" ")[1];
            return (first + "." + second + "." + last).toLowerCase();
        }
    }
}
