import java.util.Scanner;
public class App {
    
    public static void main(String[] args) throws Exception {
        int dim;
        Scanner cin = new Scanner(System.in);
        dim = cin.nextInt();
        
        MagicSquare A = new MagicSquare(dim);
        // read numbers from console
        A.getNumbers();
        A.showSquare();

        System.out.println(A.isMagicSquare());      
        
        cin.close();
    }
}
