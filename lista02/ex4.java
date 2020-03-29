/**
 * ex4
 */
public class ex4 {

    public static int somaDigitos(int numero, int ini){
        String num = Integer.toString(numero);
        String[] digitos = num.split("");
        if(ini == digitos.length -1) return Integer.parseInt(digitos[ini]);
        return Integer.parseInt(digitos[ini])+somaDigitos(numero, ini+1);
    }

    public static void main(String[] args){
        System.out.println("Soma dos digitos: "+somaDigitos(2029, 0));
    }
}
