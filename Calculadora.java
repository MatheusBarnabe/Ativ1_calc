public class Calculadora {
    public int a;
    public int b;
    
    double calcularSoma(double a, double b) {
        return a + b;
    }

    double calcularSubtracao(double a, double b) {
        return a - b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
} 