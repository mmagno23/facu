import java.util.Scanner;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Scanner Leitor = new Scanner(System.in);
        Robo robo = new Robo(100, 0);
        boolean loop = true;
        while (loop) {
            System.out.println("O que o robo deve fazer ");
            System.out.println("1- Andar para frente");
            System.out.println("2- Andar para tras");
            System.out.println("3- Quantos Graus deseja vira");
            System.out.println("4- Tirar foto");
            System.out.println("5- Status do Robo");
            System.out.println("6- Recarregar");
            System.out.println("7- Sair");

            int valor = Leitor.nextInt();
            switch (valor) {
                case 1:
                    robo.andaFrente();
                    break;
                case 2:
                    robo.andaTras();
                    break;
                case 3:
                System.out.println("graus voce deseja virar?");    
                int graus=Leitor.nextInt();
                    robo.direcaoGraus(graus);
                    break;
                case 4:
                    robo.tiraFoto();
                    break;
                case 5:
                    robo.status();
                    break;
                case 6:
                    robo.recarregar();
                    break;
                default:
                    System.out.println("opção invalida");
                    break;
                    case 7:
                   System.out.println("Sistema sendo finalizado");
                   loop = false;
            }
        }

        Leitor.close();

    }

}