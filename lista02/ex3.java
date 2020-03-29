public class ex3 {
    static int i = 0;
    public static int maiorValor(int[] vetor, int atual, int proximo){
        if(proximo > vetor.length - 1) return vetor[atual];
        if(vetor[atual] > vetor[proximo]) return maiorValor(vetor, atual, proximo+1);
        if(vetor[atual] < vetor[proximo]) return maiorValor(vetor, proximo, proximo+1);
        return vetor[atual];
    }

    public static void main(String[] args){
        int[] vetor = {200000, 4, 1, 500, 65, 23, 67, 23, 87, 66, 75, 999, 10000, 4563};
        System.out.println("Maior valor: "+maiorValor(vetor, 0, 1));
    }
    
}
