import java.io.File;
import java.io.FilenameFilter;

public class Principal {

	public static void main(String[] args) {
		// Cria array para guardar path dos arquivos
        String[] pathnames;

        //Cria um ponteiro para a pasta desejada no disco
        String rootPath = "C:\\Users\\Josenalde\\Desktop\\apds\\software\\aula05\\external_archives\\test1";
        File f = new File(rootPath);

        // Filtro para retornar nomes segundo algum critério
        FilenameFilter filter = new FilenameFilter() {
           @Override
           public boolean accept(File f, String name) {
                return name.startsWith("in");
           }
        };
        //pathnames = f.list(filter);
        // Preenche o array com o nome de cada arquivo ou pasta
        pathnames = f.list();

        // Itera sobre o array pathnames
        for (String path : pathnames) {
            // Print the names of files and directories
            System.out.println(path); //exibe em ordem ascii, ou seja, test1, test10, test11 etc.
        }
	}

}
