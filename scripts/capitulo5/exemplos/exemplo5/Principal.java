package capitulo5.exemplos.exemplo5;

public class Principal {
    public static void main(String[] args) {
        Combo premium = new Combo();
        Brinde b1 = new Brinde();
        b1.setDescricao("Balde de Pipoca Personalizado!");
        b1.setCombo(premium);
        Brinde b2 = new Brinde();
        b2.setDescricao("Caneca do herói!");
        b2.setCombo(premium);
        Pipoca p1 = new Pipoca();
        p1.setTipo("Salgada");
        p1.setCombo(premium);
        Refrigerante r1 = new Refrigerante();
        r1.setTamanho("Médio");
        r1.setCombo(premium);
        Refrigerante r2 = new Refrigerante();
        r2.setTamanho("Médio");
        r2.setCombo(premium);
        premium.setPipoca(p1);
        premium.adicionarBrinde(b1);
        premium.adicionarBrinde(b2);
        premium.adicionarRefrigerante(r1);
        premium.adicionarRefrigerante(r2);
    }
}
