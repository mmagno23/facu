import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Robot roboto = new Robot();
    int trueA = 1;
    while (trueA == 1) {
      Scanner reader = new Scanner(System.in);
      if (roboto.battery <= 10) {
        System.out.println ("ALERTA; SISTEMA ENCERRANDO PARA CARREGAMENTO; BATERIA EM NIVEIS CRITICOS; ALERTA;");
        trueA = 0;
        break;
      }
      System.out.println("INICIANDO ACAO: DIGITE UMA ACAO;");
      System.out.println("ACOES ACEITAS: GIRAR, AVANCAR, VOLTAR, STATUS;");
      String fazerInput = reader.nextLine();
      roboto.fazer(fazerInput);
    }
  }
}

class Robot {
  int maxBattery = 100;
  int battery = maxBattery;

  public void fazer(String action) {
    Scanner reader = new Scanner(System.in);
    switch(action) {
      case "GIRAR":
        System.out.println("DIGITE QUANTOS GRAUS O ROBO DEVERA GIRAR, NEGATIVO PARA A ESQUERDA;");
        int grausInput = reader.nextInt();
        if (battery > 10) {
          System.out.println("GIRANDO " + grausInput + "º;");
          battery -= 10;
          bateriaGasta(10);
        } else {
          bateriaFaltando();
        }
        break;
      case "AVANCAR":
        System.out.println("DIGITE QUANTOS M O ROBO DEVERA AVANCAR");
        int avancarInput = reader.nextInt();
        if (avancarInput > 0) {
          if (battery > avancarInput) {
            System.out.println("AVANCANDO " + avancarInput + "M;");
            battery -= avancarInput;
            bateriaGasta(avancarInput);
          } else {
            bateriaFaltando();
          }
          } else {
          System.out.println("NAO E PERMITIDO NUMEROS NEGATIVOS; ERROR;");
          }
        break;
      case "VOLTAR":
        System.out.println("DIGITE QUANTOS M O ROBO DEVERA VOLTAR");
        int voltarInput = reader.nextInt();
        if (voltarInput > 0) {
          if (battery > voltarInput) {
            System.out.println("VOLTANDO " + voltarInput + "M;");
            battery -= voltarInput;
            bateriaGasta(voltarInput);
          } else {
            bateriaFaltando();
          }
          } else {
          System.out.println("NAO E PERMITIDO NUMEROS NEGATIVOS; ERROR;");
          }
        break;
      case "STATUS":
        System.out.println("BATERIA ATUAL SE ENCONTRA EM " + battery + "%;");
        System.out.println("APERTE ENTER PARA CONTINUAR;");
        reader.nextLine();
        break;
      default:
        System.out.println("ERR0R;");
        System.out.println("APERTE ENTER PARA CONTINUAR;");
        reader.nextLine();
    }  
  }
  public void bateriaFaltando(){
    Scanner reader = new Scanner(System.in);
    System.out.println("BATERIA FALTANDO PARA A ACAO; ERR0R;");
    System.out.println("APERTE ENTER PARA CONTINUAR;");
    reader.nextLine();
  }

  public void bateriaGasta(int gasto){
    Scanner reader = new Scanner(System.in);
    System.out.println("BATERIA GASTA NA ACAO = " + gasto + "%;");
    System.out.println("APERTE ENTER PARA CONTINUAR;");
    reader.nextLine();
  }
}