import java.util.Random;
import java.util.Scanner;
public class Jokenpo {
    public static void main(String[] args) {
        char resp = 's';
        Integer jog;
        Integer comp;
        Integer vjog;
        Integer vcom;
        Integer empate;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Bem vindo, ao JOKENPO, do Mackenzie");
            System.out.println("Opções");
            System.out.println("[1] Pedra");
            System.out.println("[2] Papel");
            System.out.println("[3] Tesoura");
            System.out.println("[4] Finalaizar");

            System.out.println("Jogador: ");
            jog = scanner.nextInt();

            comp = random.nextInt(3) + 1;

            if(jog == 1 && comp == 3){
                vjog = vjog + 1;

            }
            if(jog == 1 && comp == 2){
                vcomp = vcomp + 1;

            }
            if(jog == 1 && comp == 3){
                vjog = vjog + 1;

            }


        }




    }
}
