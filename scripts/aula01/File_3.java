package apds.file_1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author josen
 */
public class File_1 {

    public static void main(String[] args) {
        
        String path = "C:\\Users\\josen\\OneDrive\\documentos\\NetBeansProjects\\file_1\\src\\main\\java\\apds\\file_1\\in.txt";
        
        //ideia de instanciar diretamente no try, portanto a memoria é liberada quando o escopo do try encerrar
        try (BufferedReader br = new BufferedReader(new FileReader(path))) { //neste caso não precisa do finally
            //ler linha a linha
            String line = br.readLine();
            while (line != null) { //equivale ao EOF do Scanner
                System.out.println(line);
                line = br.readLine();
            }
        } catch(IOException e) {
            System.out.println("Error: " + e.getMessage());
        } 
    }
}
