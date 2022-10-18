package aula05;

import java.io.File;

public class ListFilesRecursively {
	
	public void listDirectoryTree(String startDir) {
		File dir = new File(startDir);
		File[] files = dir.listFiles();

		if (files != null && files.length > 0) {
			for (File file : files) {
				// Verifica se arquivo atual é pasta/diretório
				if (file.isDirectory()) {
					// Se for entra recursivamente para listar arquivos
					listDirectoryTree(file.getAbsolutePath());
				} else {
					// We can use .length() to get the file size
					System.out.println(file.getName() + " (size in bytes: " + file.length()+")");
				}
			}
		}
	}
}
