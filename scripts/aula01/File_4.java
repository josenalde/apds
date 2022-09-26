package apds.file_1;
import apds.file_1.entities.Products;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author josenalde
 */
public class File_1 {

    public static void main(String[] args) {
        
        String path = "C:\\Users\\josen\\OneDrive\\documentos\\NetBeansProjects\\file_1\\src\\main\\java\\apds\\file_1\\products.csv";
        List<Products> list = new ArrayList<Products>();
        //ideia de instanciar diretamente no try, portanto a memoria é liberada quando o escopo do try encerrar
        try (BufferedReader br = new BufferedReader(new FileReader(path))) { //neste caso não precisa do finally
            //ler linha a linha
            String line = br.readLine(); //cabeçalho (descartar)
            line = br.readLine(); //tentar ler segunda linha (primeiro produto)
            while (line != null) { //equivale ao EOF do Scanner
                String[] vLine = line.split(",");
                String name = vLine[0];
                Double price = Double.parseDouble(vLine[1]);
                Integer qtd = Integer.parseInt(vLine[2]);
                
                Products prod = new Products(name, price, qtd);
                list.add(prod);
                
                line = br.readLine();
            }
            System.out.println("Products: ");
            for (Products p: list) {
                System.out.println(p);
            }
        } catch(IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
