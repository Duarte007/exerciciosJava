/**
 * ex3
 */
import java.util.Scanner;
public class ex3 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String phrase = in.nextLine(); 
        
        System.out.println("Frase sem vogais: "+phrase.replaceAll("[aeiouAEIOU]", ""));
    }
}