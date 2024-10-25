/*
 * Por Josenalde Oliveira
 * A entrada é pelo console com o nome da pessoa completo escrito entre aspas duplas. Exemplo: java Abrevia "Paulo Lucas Mateus Joao de Jesus"
 * Ao clicar no RUN (play) é compilado com o javac Abrevia.java, produzindo Abrevia.class, mas não sabe quem é o parâmetro do console, por isto
 * é necessário executar no console o comando java Abrevia ".......", ou seja, o nome a processar.
 */
public class Abrevia {
    public static void main(String[] args) throws Exception {
        if (args.length > 0) { // se o usuário digitou algum parâmetro no console entra neste IF
            //System.out.println(args[0]); // parâmetro String delimitado por aspas duplas (só para debug)
            String[] nameSubstrings = new String[]{null}; // inicializa vetor de strings para guardar partes do nome
            nameSubstrings = args[0].split(" "); // faz a separação por espaço em branco e guarda no vetor
            String nameLetters = ""; // declara e inicializa a string alvo, que irá guardar as abreviaturas
            for (int i = 0; i < nameSubstrings.length; i++) { // percorre vetor das partes do nome
                if (nameSubstrings[i].length() > 2) { // se a parte do nome tiver no mínimo 3 letras, gera a abreviação
                    nameLetters += nameSubstrings[i].toUpperCase().charAt(0); // passa para maiúsculo (toUpperCase) e pega só primeira letra (charAt(0))
                    nameLetters += ". ";
                } else {
                    nameLetters += nameSubstrings[i].toLowerCase(); // se tiver 1 ou 2 letras na parte do nome, não gera abreviatura e repete em minúsculo (de, do...)
                    nameLetters += " ";
                }
                
            }
            nameLetters.trim(); //remove espaços em branco ao redor
            System.out.println(nameLetters);
        }
    }
}
