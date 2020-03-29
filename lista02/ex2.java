import java.util.Scanner;

public class ex2 {

    public static long fatorial(long numero){
        if(numero == 1)
            return numero;
        return numero*fatorial(numero-1);
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int numero;
        System.out.println("Fatorial: ");
        numero = in.nextInt();
        System.out.println("Resultado: "+fatorial(numero));
    }
    
}
