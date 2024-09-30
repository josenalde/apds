import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        LocalDate date = LocalDate.of(2024, 9, 30); //yy-m-day
        System.out.println(date); // padrão yyyy-mm-dd
        LocalDate date2 = LocalDate.now(); // apenas data atual (sistema)
        System.out.println(date2);
        System.out.println("Data de hoje: " + date + " menos 5 dias: " + date.minusDays(5)); 
        System.out.println("Data de hoje: " + date + " mais 5 dias: " + date.plusDays(5));
        // da mesma forma, meses e anos minusMonths, minusYears, minusWeeks...
        System.out.println(date.getDayOfWeek()); //use com getValue() se desejar o índice do dia
        // getDayOfMonth(), getYear, getMonth, getMonthValue
        System.out.println(date.lengthOfMonth()); // 30 dias por exemplo para Setembro
        // se é ano bissexto
        System.out.println(date.isLeapYear());
        LocalDate dateFirstExam = LocalDate.of(2024, 10, 24);
        System.out.println("Faltam " + date.datesUntil(dateFirstExam)); //retorna stream de datas (objeto) ordenadas
        // alternativa: gerar lista com estas datas
        List<LocalDate> dateList = date.datesUntil(dateFirstExam).collect(Collectors.toList()); //List<Object>
        for (LocalDate d : dateList) {
            System.out.println(d);
        }
        System.out.println(dateFirstExam.compareTo(date2)); // -1 if a < b, 0 if a==b, 1 if a>b
        // isBefore, isAfter, isEqual, a.equals(b)
        LocalDate today = LocalDate.now();
        LocalDate pastDate = today.minusDays(5);
        System.out.println(Duration.between(today.atStartOfDay(), pastDate.atStartOfDay()).toDays()); // diferença de datas

        Scanner cin = new Scanner(System.in);
        boolean readFlag = false;
        do {
            try {
                String dateConsole = cin.nextLine();
                DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
                LocalDate dateParsed = LocalDate.parse(dateConsole, formato); 
                System.out.println(formato.format(dateParsed));
                readFlag = true;
                
            } catch (DateTimeParseException e) {
                System.out.println("Data no formato inválido. Digite dd/MM/yyyy");
            }
        } while (!readFlag);
        cin.close();
    }
}
