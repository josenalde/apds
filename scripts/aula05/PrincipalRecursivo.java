package aula05;

public class Principal {
	
    public static void main(String[] args) {
        ListFilesRecursively obiJudge = new ListFilesRecursively();
        String startDir = ("C:\\Users\\Josenalde\\Desktop\\apds\\software\\aula05\\external_archives");
        obiJudge.listDirectoryTree(startDir);
    }
}	

