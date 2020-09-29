import java.util.Scanner;

public class P1 {

static int vidaP1 = 100;

public P1() {

  int poderFraco1 = 20;
  int poderMedio1 = 30;
  int poderEspecial1 = 60;
  int iniciar;
  int escolhaAtaque = 0;

  Scanner ler = new Scanner(System.in);
  System.out.println("");
  System.out.println("Batalha de Pokemon - SEU TIME");
  System.out.println("");
  System.out.println("Digite 1 para Iniciar:");
  iniciar = ler.nextInt();

  for (int i = 1; i <= 2; ++i) {    

  if (iniciar == 1 && i == 1) {
        System.out.println("");
        System.out.println("Seu Time - Player1: P1");
        System.out.println("");
        System.out.println("P1 Vs P2");
        System.out.println("");
        System.out.println("Aperte 2 para Aplicar Poder Fraco");
        System.out.println("Aperte 3 para Aplicar Poder Mediano");
        System.out.println("Aperte 4 para Aplicar Poder Forte");
        escolhaAtaque = ler.nextInt();

        switch (escolhaAtaque) {

        case 2:
          System.out.println("");
          System.out.println("P1 Aplicou um Póder Fraco");
          System.out.println("Poder Aplicado = " + poderFraco1);

          P2.VidaP2 -= 20;
          break;
        case 3:
          System.out.println("");
          System.out.println("P1 aplicou um Poder Mediano");
          System.out.println("Poder Aplicado = " + poderMedio1);
          P2.VidaP2 -= 30;
          break;

        case 4:
          System.out.println("");
          System.out.println("P1 aplicou um Poder Especial");
          System.out.println("Poder Aplicado = " + poderEspecial1);
          System.out.println("");
          P2.VidaP2 -= 60;
          break;        
        }
      }
    }
  }
}
