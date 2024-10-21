public class Abrevia {
    public static void main(String[] args) throws Exception {
        if (args.length > 0) {
            //System.out.println(args[0]); // parâmetro String delimitado por aspas duplas
            String[] nameSubstrings = new String[]{null};
            nameSubstrings = args[0].split(" ");
            String nameLetters = "";
            for (int i = 0; i < nameSubstrings.length; i++) {
                if (nameSubstrings[i].length() > 2) {
                    nameLetters += nameSubstrings[i].toUpperCase().charAt(0);
                    nameLetters += ". ";
                } else {
                    nameLetters += nameSubstrings[i];
                    nameLetters += " ";
                }
                
            }
            nameLetters.trim(); //remove espaços em branco ao redor
            System.out.println(nameLetters);
        }
    }
}
