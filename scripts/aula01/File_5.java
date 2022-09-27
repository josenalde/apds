String path_2 = "C:\\Users\\josen\\OneDrive\\documentos\\NetBeansProjects\\file_1\\src\\main\\java\\apds\\file_1\\out.txt";
//primeira linha
String text_to_write = "eaj ufrn text \r\n";
// a partir da segunda linha quebrar no início
String text_to_write_2 = "\r\njoao;123;rua da amoras_3";
if (Arquivo.Write(path_2, text_to_write_2)) {
   System.out.println("Gravei");
} else System.out.println("Erro na gravação");
        
