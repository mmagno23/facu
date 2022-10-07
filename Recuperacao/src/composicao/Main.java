package composicao;

public class Main {

    public static void main(String[] args) {

        Carro carro = new Carro();

        carro.setModelo("Gol");
        carro.setAnoDeFabricacao(2012);
        carro.setCor("Preto");
        carro.setMarca("Volkswagen");

        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Ano de Fabricação: " + carro.getAnoDeFabricacao());
        System.out.println("Cor: " + carro.getCor());
        System.out.println("Marca: " + carro.getMarca());
    }
}
