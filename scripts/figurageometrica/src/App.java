public class App {
    public static void main(String[] args) throws Exception {
       Quadrado q1 = new Quadrado(3);
       Circulo c1 = new Circulo(1);
       System.out.println("Area do quadrado: " + q1.calcularArea());
       System.out.println("Perimetro do quadrado: " + q1.calcularPerimetro());
       System.out.println("Area do circulo: " + c1.calcularArea());
       System.out.println("Circunferencia: " + c1.calcularCircunferencia());
       System.out.println("Distancia para o centro da figura: " + FiguraGeometrica.calcularDistancia(4, 8));
    }
}
