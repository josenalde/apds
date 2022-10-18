// Percorre árvore de diretórios de gabarito de questões OBI, com estrutura de testes testX, inY1, inY2, outY1, outY2
// Autor: Josenalde Oliveira out22

package aula05;

import java.io.File;

public class ListFilesRecursively {
	
	public void listDirectoryTree(String startDir) {
		File dir = new File(startDir);
		File[] files = dir.listFiles();
		
		ManageIO extractValues = new ManageIO();

		if (files != null && files.length > 0) {
			for (File file : files) {
				// Verifica se arquivo atual é pasta/diretório
				if (file.isDirectory()) {
					// Se for entra recursivamente para listar arquivos
					listDirectoryTree(file.getAbsolutePath());
				} else {
					// We can use .length() to get the file size
					System.out.println(file.getName() + " (size in bytes: " + file.length()+")");
					System.out.println(file.getAbsolutePath());
					extractValues.ReadFile(file.getAbsolutePath());
				}
			}
		}
	}
}
