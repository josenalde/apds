import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculadora {
    private int valueA;
    private int valueB;
    private char op; // equivalente a char em C++, tipo char em Java é unicode (16 bytes)

    public boolean testValue(int valueX) {
        int vMin = -100;
        int vMax = 100;
        try {
            if (valueX >= vMin && valueX <= vMax)
                return true;
            else {
                throw new ArithmeticException("Erro: Valores fora de faixa");
            }
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public boolean testOperator() {
        List<Character> validOps = new ArrayList<>();
        validOps.add('+');
        validOps.add('-');
        validOps.add('*');
        validOps.add('/');
        if (validOps.contains(op))
            return true;
        else
            return false;
    }

    public int calculate() {
        int res = 0;
        switch (op) {
            case '+': {
                res = valueA + valueB;
                break;
            }
            case '-': {
                res = valueA - valueB;
                break;
            }
            case '*': {
                res = valueA * valueB;
                break;
            }
            case '/': {
                if (valueB != 0) {
                    res = valueA / valueB;
                    break;
                }
            }
        }
        return res;
    }

    public void show(int res) {
        this.toString();
        System.out.println(" = " + res);
    }

    public void captureInformations() {
        Scanner reader = new Scanner(System.in);
        int a = reader.nextInt();
        char op = reader.next().charAt(0); // nao ha nextChar() em java lê até encontrar espaço
        int b = reader.nextInt();
        Calculadora c = new Calculadora(a, op, b);
        int r = c.calculate();
        c.show(r);
        reader.close();
    }

    public Calculadora() {

    }

    public Calculadora(int valueA, char op, int valueB) {
        this.op = op;
        if (this.testOperator()) {
            if (testValue(valueA))
                this.valueA = valueA;
            if (testValue(valueB))
                this.valueB = valueB;
        }
    }

    public char getOp() {
        return op;
    }

    public void setOp(char op) {
        this.op = op;
    }

    public int getValueA() {
        return valueA;
    }

    public void setValueA(int valueA) {
        this.valueA = valueA;
    }

    public int getValueB() {
        return valueB;
    }

    public void setValueB(int valueB) {
        this.valueB = valueB;
    }

    @Override
    public String toString() {
        return "Calculadora [valueA=" + valueA + ", valueB=" + valueB + ", op=" + op + "]";
    }

}
