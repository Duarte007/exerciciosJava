/**
 * hello
 */
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args){
        int num = 0;
        int sequence = 0, longestSequence = 0, aux = 0;
        Scanner in = new Scanner(System.in);
        do{
            System.out.println("Digite um numero:");
            num = in.nextInt();
            if(aux < num || aux == num){
                if(aux == num) sequence = 1;
                else sequence++;
            } else {
                if(sequence > longestSequence) longestSequence = sequence;
                sequence = 1;
            }
            aux = num;
        } while(num != -1);
        System.out.println("Maior Sequencia: "+ longestSequence);
        System.out.println("Finalizando...");
    }
}