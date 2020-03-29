import java.util.Arrays;

/**
 * ex5
 */
public class ex5 {

    public static String retiraVogais(String palavra, int ini){
        String[] letras = palavra.split("");
        String[] vogais = {"a", "e", "i", "o", "u", "A", "E", "I", "O", "U"};
        if(ini == letras.length -1) return "";
        if(!Arrays.stream(vogais).anyMatch(letras[ini]::equals))
            return letras[ini]+retiraVogais(palavra, ini+1);
        return retiraVogais(palavra, ini+1);
    }

    public static void main(String[] args){
        System.out.println("Palavra sem vogais: "+retiraVogais("paralelepipedo", 0));
    }
}
