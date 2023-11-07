package fr.article;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {


        Scanner clavier = new Scanner(System.in);
        System.out.println("Quelle est le nombre d'article: ");
        int nbArticles = clavier.nextInt();
        int somme=0;
        for (int i = 1; i<= nbArticles; i++){
            System.out.println("Prix de l'article " + i +" :");
            somme += clavier.nextInt();
        }
        System.out.println("la somme est: "+ somme);
    }
    
}
