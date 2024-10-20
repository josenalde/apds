public class Distancia {
    static int [][] D = {{0,15,30,5,12},
                      {15,0,10,17,28},
                      {30,10,0,3,11},
                      {5,17,3,0,80},
                      {12,28,11,80,0}}; 
    public static void main(String[] args) throws Exception {
        
        
        // criando alguns testes manualmente
        args[0] = "1,2,3,2,5,1,4";
        args[1] = "1,4,5";
        args[2] = "1,1";
        args[3] = "5,1,2,3,4,5";
        args[4] = "4,5,4,5,4";
        int[] r = {80, 85, 0, 120, 320};

        if (args.length > 0) {
            for (int j = 0; j < args.length; j++) {
                String rt = (r[j] == calculaDistancia(args[j]))?"OK":"FAILED";
                System.out.println("Teste" + (j+1) + ": " + calculaDistancia(args[j]) + ": " + rt);
            }
        }
    }

    public static int calculaDistancia(String arg) {
        int d = 0;
        if (arg.length() > 0) {
            for (int j = 0; j < arg.length(); j++) {
                String[] p = arg.split(",");
                d = 0; //acumular distancias
                for (int i = 0; i < p.length-1; i++) {
                    int origem = Integer.parseInt(p[i]);
                    int destino = Integer.parseInt(p[i+1]);
                    d += D[origem-1][destino-1];
                }
            }
        }
        return d;
    }
}
