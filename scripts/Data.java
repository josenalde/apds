import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Data {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    String data = reader.nextLine();
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
    LocalDate dataAjuste = LocalDate.parse(data, formato); 
    System.out.println(formato.format(dataAjuste));
  }
}