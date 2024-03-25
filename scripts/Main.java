public class Main {
  public static void main(String[] args) {
    Player p = new Player("joao silva", "meio-campo", "22/03/2005", "brasileiro", 1.85f, 90f);
    System.out.println(p.toString());
    System.out.print("tem " + p.calcAge(p.getBirthDate()) + " anos");
    System.out.println(" faltando " + p.calcYearsToRetire(p.getBirthDate()) + " para aposentar");

   
  }
}