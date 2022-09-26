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
        FileReader fr = null;
        BufferedReader br = null; //gerencia memoria alocada para a leitura do arquivo
        
        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);
            //ler linha a linha
            String line = br.readLine();
            while (line != null) { //equivale ao EOF do Scanner
                System.out.println(line);
                line = br.readLine();
            }
        } catch(IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                br.close(); //o ato de fechar pode gerar excessão, então precisa tratar
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }   
        }       
    }
}
