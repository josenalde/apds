package aula01;

public class Caneta {
	private String modelo;
	private String cor;
	private float ponta;
	protected int carga;
	protected boolean tampada;
	
	public void status() {
		System.out.println("Modelo " + this.modelo);
		System.out.println("Uma caneta " + this.cor);
		System.out.println("Caneta Tampada? " + this.tampada);
		System.out.println("Ponta " + this.ponta);
		System.out.println("Carga " + this.carga + " ml");
	}
	
	public void escrever() {
		if (this.tampada) {
			System.out.println("ERRO! Caneta tampada!");
		} else System.out.println("Estou escrevendo...");
	}
	public void tampar() {
		this.tampada = true;
	}
	public void destampar() {
		this.tampada = false;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getPonta() {
		return ponta;
	}

	public void setPonta(float ponta) {
		this.ponta = ponta;
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	public boolean isTampada() {
		return tampada;
	}

	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}
}
