package ex4;

/**
 * ViagemDeOnibus
 */
public class ViagemDeOnibus {

    private double distancia, qtdCombustivel, tempo;

    public ViagemDeOnibus(double distancia, double qtdCombustivel, double tempo) throws IllegalArgumentException{
        if(distancia < 0)
            throw new IllegalArgumentException("Distancia invalida.");
        if(qtdCombustivel < 0)
            throw new IllegalArgumentException("Quantidade de combustivel invalida.");
        if(tempo < 0)
            throw new IllegalArgumentException("Tempo invalido.");

        this.distancia = distancia;
        this.qtdCombustivel = qtdCombustivel;
        this.tempo = tempo;
    }

    public double getDistancia(){
        return this.distancia;
    }

    public double getQtdCombustivel(){
        return this.qtdCombustivel;
    }

    public double getTempo(){
        return this.tempo;
    }

    public double calcVelocidadeMedia(){
        return this.distancia/this.tempo;
    }

    public double calcConsumoMedio(){
        return this.qtdCombustivel/this.distancia;
    }


}