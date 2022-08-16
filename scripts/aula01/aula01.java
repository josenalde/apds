package aula01;

public class aula01 {
	public static void main(String [] args) {
		caneta c1 = new caneta();
		//c1.cor = "azul";
		c1.setCor("Azul");
		//c1.ponta = 0.5f;
		c1.setPonta(0.5f);
		//c1.tampada = false;
		c1.tampar();
		c1.escrever();
		c1.destampar();
		c1.escrever();
		c1.status();
		
		caneta c2 = new caneta();
		//c2.modelo = "bic";
		c2.setModelo("bic");
		c2.destampar();
		//c2.cor = "preto";
		c2.setCor("preta");
		c2.setPonta(0.7f);
		c2.setCarga(100);
		c2.escrever();
		c2.status();
	}
}
