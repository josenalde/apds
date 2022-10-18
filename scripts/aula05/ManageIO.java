package aula05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ManageIO {
	 public void ReadFile(String path) {
		 List<Integer> list = new ArrayList<Integer>();
		 //ideia de instanciar diretamente no try, portanto a memoria é liberada quando o escopo do try encerrar
		 try (BufferedReader br = new BufferedReader(new FileReader(path))) { //neste caso não precisa do finally
			 //ler linha a linha
			 String line = br.readLine(); 
			 //System.out.println(line); //aqui está correto
			 while (line != null) { //equivale ao EOF do Scanner
				 String[] vLine = line.split(" ");
				 if (vLine.length > 1) { //para evitar o \n
					 //System.out.println(vLine.length); //correto 4 por linha
					 for (int p=0; p < vLine.length; p++) {
						 //System.out.println(vLine[p]);
						 list.add(Integer.parseInt(vLine[p]));
					 }
				 }
				 line = br.readLine(); //tem um ENTER na última linha
			 }
		 System.out.println("Coordenadas lidas: ");
         for (Integer p: list) {
             System.out.println(p);
         }
		 } catch(IOException e) {
			 System.out.println("Error: " + e.getMessage());
		 }
	 }
}

