package aula01;

public class aula01 {
	public static void main(String [] args) {
		Caneta c1 = new Caneta();
		c1.setCor("Azul");
		c1.setPonta(0.5f);
		c1.tampar();
		c1.escrever();
		c1.destampar();
		c1.escrever();
		c1.status();
		
		Caneta c2 = new Caneta();
		c2.setModelo("bic");
		c2.destampar();
		c2.setCor("preta");
		c2.setPonta(0.7f);
		c2.setCarga(100);
		c2.escrever();
		c2.status();
	}
}
