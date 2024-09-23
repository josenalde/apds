import java.util.Scanner;

class Main {
    
    public static void main(String[] args) {
        //System.out.println("hello world");
        //String s = "teste";
        //System.out.println(s.length());
        Robo r1 = new Robo();
        r1.name = "teste";
        Robo r2;
        r2 = new Robo();
        r2.setName("teste");
        System.out.println(r1.name);

        Robo r2d2 = new Robo();
        Robo r2d3;
        r2d3 = r2d2;
        System.out.println(r2d2 == r2d3);
        System.out.println("#r2d2: " + Integer.toHexString(System.identityHashCode(r2d2)));
        System.out.println("#r2d3: " + Integer.toHexString(System.identityHashCode(r2d3)));
        r2d2 = new Robo();
        System.out.println(r2d2 == r2d3);
        System.out.println("#r2d2: " + Integer.toHexString(System.identityHashCode(r2d2)));
        System.out.println("#r2d3: " + Integer.toHexString(System.identityHashCode(r2d3)));
        
        Scanner reader = new Scanner(System.in);
        try {
            int x = reader.nextInt();
            r1.setBatDuration(x);
            r2.setBatDuration(x);
            System.out.println(r2.equals(r1));
        } catch(Exception e) {
            System.out.println("Erro do tipo: " + e);
        }
        System.out.println(r1.toString());
        System.out.println(r2.toString());
        reader.close();
    }

}