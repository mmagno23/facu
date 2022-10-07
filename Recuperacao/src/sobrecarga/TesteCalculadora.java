package sobrecarga;

public class TesteCalculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int calcinteiros = calc.soma(1,2);
        double calcd=calc.soma(1.5,2.8);

        System.out.println(calcinteiros);
        System.out.println(calcd);
    }
}
