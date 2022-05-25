public class Robo {
    private int bateria;
    private int graus;

    public Robo(int bateria, int graus) {
        this.bateria = bateria;
        this.graus = graus;
    }

    private boolean consumeBateria() {
        if (this.bateria < 10) {
            System.out.println("Robo sem bateria, favor recarregar");
            return false;
        } else {
            this.bateria -= 5;
            return true;
        }
    }

    public void andaFrente() {
        if (this.consumeBateria()) {
            System.out.println("Andou pra frente ");
        }
    }

    public void andaTras() {
        if (this.consumeBateria()) {
            System.out.println("Andou pra tras");
        }
    }

    public void tiraFoto() {
        if (this.consumeBateria()) {
            System.out.println("Foto tirada");
        }
    }

    public void direcaoGraus(int graus) {
        int quantidadeGrausTotal = this.graus + graus;
        if (this.consumeBateria()) {
            if (quantidadeGrausTotal > 360) {
                this.graus = quantidadeGrausTotal - 360;
                System.out.println("O graus atual é" + this.graus);
            } else {
                this.graus = quantidadeGrausTotal;
                System.out.println("O graus atual é" + this.graus);
            }
        }
    }

    public void status() {
        System.out.println("graus: " + this.graus);
        System.out.println("bateria: " + this.bateria);
    }

    public void recarregar() {
        this.bateria = 100;
        System.out.println("Recarregando bateria...... " + this.bateria + " bateria carregada");
    }
}