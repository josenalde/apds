import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Player {
  private String name;
  private String posicao;
  private String birthDate;
  private String nationallity;
  private float height;
  private float weight;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPosicao() {
    return posicao;
  }

  public void setPosicao(String posicao) {
    this.posicao = posicao;
  }

  public String getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(String birthDate) {
    this.birthDate = birthDate;
  }

  public String getNationallity() {
    return nationallity;
  }

  public void setNationallity(String nationallity) {
    this.nationallity = nationallity;
  }

  public float getHeight() {
    return height;
  }

  public void setHeight(float height) {
    this.height = height;
  }

  public float getWeight() {
    return weight;
  }

  public int calcAge(String date) {
    DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
    LocalDate dateLD = LocalDate.parse(date, format); 
    LocalDate today = LocalDate.now();
    //System.out.println(format.format(today));
    //System.out.println(dateLD.getDayOfYear()); 
    //System.out.println(today.getDayOfYear());
    //if (dateLD.isAfter(today)) {
    if ((dateLD.getDayOfYear() > today.getDayOfYear())) {
      // ainda não fez aniversário este ano
      return ((today.getYear() - dateLD.getYear()) - 1);
    } else return today.getYear() - dateLD.getYear();
  }

  public int calcYearsToRetire(String date) {
    int idade = calcAge(date);
    int anosRestantes = 0;
    if (posicao == "defesa") {
        anosRestantes = Math.abs(40-idade);
    } else if (posicao == "meio-campo") {
        anosRestantes = Math.abs(38-idade);
    } else if (posicao == "atacante") {
        anosRestantes= Math.abs(35-idade);
    }
    return anosRestantes;
  }

  public void setWeight(float weight) {
    this.weight = weight;
  }

  public Player(String name, String posicao, String birthDate, String nationallity, float height, float weight) {
    this.name = name;
    this.posicao = posicao;
    this.birthDate = birthDate;
    this.nationallity = nationallity;
    this.height = height;
    this.weight = weight;
  }

  @Override
  public String toString() {
    return "Player: " + name + ", " + posicao + ", "
        + birthDate + ", " + nationallity + ", "
        + height + ", " + weight;
  }

}