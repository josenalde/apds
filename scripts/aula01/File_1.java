/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package apds.file_1;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author josen
 */
public class File_1 {

    public static void main(String[] args) {
        File fp = new File("C:\\Users\\josen\\OneDrive\\documentos\\NetBeansProjects\\file_1\\src\\main\\java\\apds\\file_1\\in.txt");
        //Scanner sc = new Scanner(System.in); //instancia scanner para ler entrada padrão
        Scanner sc = null;
        try {
            sc = new Scanner(fp);
            while (sc.hasNextLine()) { // ler até EOF
                String line = sc.nextLine();
                System.out.println(line);
            }
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }//inclui arquivo nao encontrado, permissao de arquivo etc.
        finally {
            if (sc != null) {
                sc.close(); //fecha recurso ao fim e evita excessão de ponteiro nulo
            }
        }
    }
}
