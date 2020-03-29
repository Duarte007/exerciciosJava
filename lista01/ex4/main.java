package ex4;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * main
 */
public class main {
    static ViagemDeOnibus[] viagens = new ViagemDeOnibus [20];
    static int i = 0;
    static DecimalFormat df = new DecimalFormat("0.##");
    public static void inserirViagem() throws Exception {
        Scanner in = new Scanner(System.in);
        try{
            if(i < 20){
                System.out.println("Informe a distancia da viagem em Km: ");
                double dist = Double.parseDouble(in.nextLine());
                System.out.println("Informe o tempo da viagem em horas: ");
                double tempo = Double.parseDouble(in.nextLine());
                System.out.println("Informe a quantidade de combustivel gasta na viagem em Litros: ");
                double qtdComb = Double.parseDouble(in.nextLine());
                viagens[i] = new ViagemDeOnibus(dist, qtdComb, tempo);
                i++;
            } else {
                System.out.println("Quantidade maxima de viagens ja cadastradas.");
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
            in.close();
        }
    }

    public static ViagemDeOnibus viagemMaisLonga(ViagemDeOnibus[] viagens) {
        ViagemDeOnibus viagemMaisLonga = new ViagemDeOnibus(0, 0, 0);
        for (ViagemDeOnibus viagem : viagens) {
            if (viagem != null) {
                if (viagem.getDistancia() > viagemMaisLonga.getDistancia())
                    viagemMaisLonga = viagem;
            }
        }
        return viagemMaisLonga;
    }

    public static String tempoTotal(ViagemDeOnibus[] viagens) {
        double tempoTotal = 0;
        for (ViagemDeOnibus viagem : viagens) {
            if (viagem != null) {
                tempoTotal += viagem.getTempo();
            }
        }
        return df.format(tempoTotal);
    }

    public static String quilometrosPercorridos(ViagemDeOnibus[] viagens) {
        double distanciaPercorrida = 0;
        for (ViagemDeOnibus viagem : viagens) {
            if (viagem != null) {
                distanciaPercorrida += viagem.getDistancia();
            }
        }
        return df.format(distanciaPercorrida);
    }

    public static String consumoMedio(ViagemDeOnibus[] viagens) {
        double custoMedio = 0;
        int j = 0;
        for (ViagemDeOnibus viagem : viagens) {
            if (viagem != null) {
                custoMedio += viagem.getQtdCombustivel();
                j++;
            }
        }
        return df.format(custoMedio/j);
    }

    public static void main(String[] args) throws Exception {
        int opc = 0;
        Scanner in = new Scanner(System.in);
        do{
            System.out.println("(1) Inserir viagem");
            System.out.println("(2) Buscar viagem mais longa");
            System.out.println("(3) Calcular tempo total gasto nas viagens");
            System.out.println("(4) Calcular distancia total percorrida em quilometros");
            System.out.println("(5) Calcular consumo medio de combustivel de todas as viagens");
            System.out.println("(6) Sair");
            opc = in.nextInt();

            switch(opc){
                case 1:
                    inserirViagem();
                    System.out.println("Viagem inserida com sucesso.");
                break;
                        
                case 2:
                    ViagemDeOnibus viagemMaisLonga = viagemMaisLonga(viagens);
                    System.out.println("A viagem mais longa durou "+ viagemMaisLonga.getTempo()+" horas e "+viagemMaisLonga.getDistancia()+" Km.");
                    break;
                        
                case 3:
                    System.out.println("Soma do tempo gasto em todas as viagens: "+tempoTotal(viagens));
                break;
                    
                case 4:
                    System.out.println("Soma da quilometragem percorrida em todas as viagens: "+quilometrosPercorridos(viagens));
                break;

                case 5:
                    System.out.println("Consumo medio de combustivel de todas as viagens: "+consumoMedio(viagens));
                break;

                case 6:
                    System.out.println("Finalizando...");
                break;
                    
                default:
                    System.out.println("Opcao invalida!");
                break;

            }
        } while(opc != 6);
    }
}