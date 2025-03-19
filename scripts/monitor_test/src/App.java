public class App {
    public static void main(String[] args) throws Exception {
        Monitor m = new Monitor();
        System.out.println(m.lerEstado());
        m.mudaEstado();
        System.out.println(m.lerEstado());
    }
}
