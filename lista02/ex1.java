import java.util.Scanner;
public class ex1{

    public static long potencia(int base, int potencia){
        if(potencia == 1)
            return base;
        return base*potencia(base, potencia-1);
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int base, expoente;
        System.out.println("Base: ");
        base = in.nextInt();
        System.out.println("Expoente: ");
        expoente = in.nextInt();
        System.out.println("Resultado: "+potencia(base, expoente));
    }
}
