import java.util.Scanner;

public class P2 {
    
    static int poderP2 = 30;
    static int VidaP2 = 100;

    public P2() {
        P1 classe = new P1();
        Scanner ler = new Scanner(System.in);
        int poderFracoP2 = 30;
        int poderMedioP2 = 50;
        int poderEspecialP2 = 70;
        int iniciar;
        int escolhaAtaque = 0;
        System.out.println("");
        System.out.println("Batalha de Pokemon - TIME INIMIGO");
        System.out.println("");
        System.out.println("Digite 1 para Iniciar:");
        iniciar = ler.nextInt();
        if (iniciar == 1) {
            System.out.println("Time Inimigo - Player2: P2");
            System.out.println("");
            System.out.println("P1 Vs P2");
            System.out.println("");
            System.out.println("Aperte 2 para Aplicar Poder Fraco");
            System.out.println("Aperte 3 para Aplicar Poder Mediano");
            System.out.println("Aperte 4 para Aplicar Poder Forte");
            System.out.println("");     
            escolhaAtaque = ler.nextInt();
             for(int i = 1; i <= 2; ++i){ 
            switch (escolhaAtaque) {
                case 2:
                    System.out.println("");
                    System.out.println("P2 Aplicou um Póder Fraco");
                    System.out.println("Poder Aplicado = " + poderFracoP2);
                    
                    P1.vidaP1 -= 30;
                    break;
                case 3:
                    System.out.println("");
                    System.out.println("P2 aplicou um Poder Mediano");
                    System.out.println("Poder Aplicado = " + poderMedioP2);
                    
                    P1.vidaP1 -= 50;
                    break;

                case 4:
                    System.out.println("");
                    System.out.println("P2 aplicou um Poder Especial");
                    System.out.println("Poder Aplicado = " + poderEspecialP2);
                    
                    P1.vidaP1 -= 70;
                    break;
                default:
                     System.out.println("Numero Invalido !");
            }
        }
        System.out.println("");
        System.out.println("Vida do P1:"+ P1.vidaP1);
        System.out.println("Vida do P2:"+ VidaP2);
        System.out.println("");
        System.out.println("Vencedor Da Batalha: P2");
        }
    }
}