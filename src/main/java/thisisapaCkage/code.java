package thisisapaCkage;

import thisisapaCkage.soumission.trouve_un_9_de_paques;

import java.util.Scanner;

/**
 * ne compte pas dans la soumission : ceci est le fichier pour tester le code
 */
public class code {
    public static void main(String[] args) {
        // demande à l'utilisateur de saisir un texte
        System.out.println("Saisissez un texte : ");
        // récupère le texte saisi
        Scanner sc = new Scanner(System.in);
        String texte = sc.nextLine();
        // envoie le résultat de trouve_un_9_de_paques()
        System.out.println(trouve_un_9_de_paques.trouve_un_9_de_paques(texte));
    }
}
