/*
 * Por Josenalde Oliveira
 * Imagine uma tabela de distâncias entre as cidades. Aqui são apenas 5 cidades (1,2,3,4,5), gerando uma matriz quadrada 5x5
 * A distância de uma cidade para ela mesma é obviamente 0. A distância de 1 para 2 é a mesma de 2 para 1 etc.
 * No exemplo abaixo, a matriz D de distâncias já está preenchida como um caso de teste, conforme consta na Lista2
 * Os índices das linhas vão de 0 a 4, assim como os das colunas, de 0 a 4, conforme aprendemos em Algoritmos, pois o Java se comporta neste caso como o C/C++
 * Quando eu quero saber a distância da cidade 3 para a cidade 5, na matriz D basta subtrair 1, para referenciar o índice equivalente.
 * Ou seja, eu olho índice (3-1)=2 e (5-1)=4, ou seja, a célula D[2][4] da matriz e vejo que a distância é 11km.
 */

public class Distancia {
    static int [][] D = {{0,15,30,5,12},
                         {15,0,10,17,28},
                         {30,10,0,3,11},
                         {5,17,3,0,80},
                         {12,28,11,80,0}}; 
    public static void main(String[] args) throws Exception {
        // Da mesma forma que na questão 3, entre com a string do percurso desejado no console. Exemplo:
        // java Distancia "1,2,3,2,5,1,4"
        // Neste caso, o resultado deverá ser 80, pois o que o código faz é separar esta string pela vírgula e guardar num vetor
        // "1,2,3,2,5,1,4" <=> [1,2,3,2,5,1,4], logo, o resultado é: distancia(1,2) + distancia(2,3) + distancia(3,2) + distancia (2,5)
        //                                                           + distancia(5,1) + distancia (1,4) = 80km
        
        // criando alguns testes
        /*args[0] = "1,2,3,2,5,1,4";
        args[1] = "1,4,5";
        args[2] = "1,1";
        args[3] = "5,1,2,3,4,5";
        args[4] = "4,5,4,5,4";
        int[] r = {80, 84, 0, 120, 320};*/

        if (args.length > 0) {
            for (int j = 0; j < args.length; j++) {
                //String rt = (r[j] == calculaDistancia(args[j]))?"OK":"FAILED";
                //System.out.println("Teste" + (j+1) + ": " + calculaDistancia(args[j]) + ": " + rt);
                System.out.println(calculaDistancia(args[0]));
            }
        }
    }

    public static int calculaDistancia(String percurso) {
        int distancia = 0;
        if (percurso.length() > 0) {
            for (int j = 0; j < percurso.length(); j++) {
                String[] cidades = percurso.split(","); // separa a string do percurso lida do console onde cada item é uma cidade no vetor p
                distancia = 0; //acumular distancias
                for (int i = 0; i < cidades.length-1; i++) {
                    // a origem é a cidade no índice atual i. O destino é a cidade no índice seguinte, por isto destino é i+1
                    int origem = Integer.parseInt(cidades[i]); // cidades[i] é string, então converter para Inteiro
                    int destino = Integer.parseInt(cidades[i+1]);
                    distancia += D[origem-1][destino-1]; // a distancia é acumulada (somatório) com a distância da origem ao destino, consultando a célula na matriz de distâncias D
                }
            }
        }
        return distancia;
    }
}
