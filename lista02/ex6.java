public class ex6 {

    // Soma na orgem n/n-1
    public static float somaRecursiva(float numero){
        if(numero - 1 == 1) return numero;
        return numero/(numero-1)+somaRecursiva(numero-1);
    }

    public static void main(String[] args){
        System.out.println("Resultado: "+somaRecursiva(4));
    }
}
