package Interfaces;


public class Principal {
    public static void main(String[] args) {
        Cachorro cao= new Cachorro();
        String resp =cao.andar(" norte");
        System.out.println(resp);
    }
}
