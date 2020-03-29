/**
 * ex2
 */
import java.util.Scanner;
public class ex2 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Posicao Fibonacci: ");
        int pos = in.nextInt();
        System.out.println("Valor correspondente: "+calcFibonacci(pos));
    }

    private static int calcFibonacci(int pos){
        int fibonacci = 1, previous = 0, current = 1;
        if(pos == 1){
            return 1;
        }
        for(int i = 1 ; i < pos ; i++){
            fibonacci=previous+current;
            previous = current;
            current = fibonacci;
        }
        return fibonacci;
    }
}