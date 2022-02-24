package TP2;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        System.out.println("Quel exercice ? Saisissez :\n" +
                "1. Discriminant\n" +
                "2. Parité d’un nombre\n" +
                "3. Calcul d’extremum\n" +
                "4. Égalité entre chaînes de caractères\n" +
                "5. Factorielle\n" +
                "6. Compte à rebous\n" +
                "7. Valeurs de carrés\n" +
                "8. Table de multiplication\n" +
                "9. Division d’entiers\n" +
                "10. Règle graduée\n" +
                "11. Nombres premiers\n" +
                "12. Manipulations sur un tableau");
        int a = sc.nextInt();
        if (a==1){discriminant();}
        if (a==2){parite();}
        if (a==3){maximum();minimum();}
        if (a==4){egaliteStr();}
        if (a==5){factorielle();}
        if (a==6){countdown();}
        if (a==7){carre();}
        if (a==8){tableMultiplication();}
        if (a==9){division();}
        if (a==10){regle();}
        if (a==11){nombrePremier();}
        if (a==12){initialisationTableau();}

    }

//3.1.1 Calcul du discriminant du second degré

    public static void discriminant() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quelle est la valeur de a ?");
        int a = scanner.nextInt();
        System.out.println("Quelle est la valeur de b ?");
        int b = scanner.nextInt();
        System.out.println("Quelle est la valeur de c ?");
        int c = scanner.nextInt();
        int delta =(int) (Math.pow(b, 2) - 4 * a * c);
        if (delta < 0) {
            System.out.println("Ce polynome n’a pas de racine réelle");
            double k = (Math.sqrt(-delta))/2*a;
            double q = -b/2*a;
            if(q!=0) {
                System.out.println("Ce polynome admet 2 racines complexes: " + q + "-" + k+ "i" + " et " + q + "+" + k + "i");
            }
            else{
                if(k==1){System.out.println("Ce polynome admet 2 racines complexes: "+"-" +"i" + " et "+ "i");}
                else {
                    System.out.println("Ce polynome admet 2 racines complexes: " + "-" + k + "i" + " et " + k + "i");
                }
            }


        }
        else if(delta == 0){
            int x0 = -b/2*a ;
            System.out.println("Ce polynôme admet une racine double: "+ x0);
        }
        else if(delta > 0){
            double x1 = (-b-Math.sqrt(delta))/2*a;
            double x2 = (-b+Math.sqrt(delta))/2*a;
            System.out.println("Ce polynôme admet 2 racines: "+x1+" et "+x2);
        }
    }

    //3.1.2 Calcul de la parité d’un nombre

    public static void parite(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisissez un entier:");
        int a  = sc.nextInt();
        if(a%2==0){
            System.out.println("L'entier "+a+" est pair");
        }
        else{
            System.out.println("L'entier "+a+" est impair");
        }

    }

    //3.1.3 Calcul d’extremum

    //maximun

    public static void maximum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisissez un premier entier:");
        int a = sc.nextInt();
        System.out.println("Saisissez un deuxième entier:");
        int b = sc.nextInt();
        if(a>b){
            System.out.println(a+" est le maximum");
        }
        else{
            System.out.println(b+" est le maximum");
        }
    }

    //minimum

    public static void minimum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisissez un premier entier:");
        int a = sc.nextInt();
        System.out.println("Saisissez un deuxième entier:");
        int b = sc.nextInt();
        if(a<b){
            System.out.println(a+" est le minimum");
        }
        else{
            System.out.println(b+" est le minimum");
        }


    }

    //3.1.4 Égalité entre chaînes de caractères

    public static void egaliteStr() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisissez une chaine de caractères:");
        String a = sc.nextLine();
        System.out.println("Saisissez une autre chaine de caractères");
        String b = sc.nextLine();
        if(a.equals(b)==true) {
            System.out.println("Ces deux chaines de caractères sont identiques");

        }
        else{
            System.out.println("Ces deux chaines de caractères sont différentes");
        }
    }

    //Factorielle

    public static void factorielle() {
        Scanner scanner = new Scanner(System.in);
        int n;
        do{
        System.out.println("Saisir un entier positif ou nul");
         n = scanner.nextInt();}while (n<0);
        int factorielle = 1;
        for (int i = 1; i <= n; i++) { //On met i=1 pour eviter une factorielle nulle
            factorielle *= i;
        }
        System.out.println(n + "! = " + factorielle);
    }

    //3.2.1 Compte à rebours de 10 à 0.

    public static void countdown() {
        for (int i = 10; i>=0; i--) {
            System.out.println(i + " ");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(i==0){
                System.out.println("BOOM!");
            }
        }
    }

    //3.2.2 Valeurs de carrés

    public static void carre() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisissez un entier:");
        int a = sc.nextInt();
        System.out.println(a+" "+a*a);
    }

    //3.2.3 Tables de multiplication

    public static void tableMultiplication() {
        for(int i = 1;i<=10;i++ ) {
            for(int k = 1;k<=10;k++) {
                System.out.print(i*k+"  ");
            }
            System.out.println(" ");
        }
    }

    //3.2.5 Division d’entiers

    public static void division() {
        Scanner sc = new Scanner(System.in);
        double a;
        double b;

        System.out.println("Saisir  un premier entier:");
        a = sc.nextInt();
        do{
        System.out.println("Saisir un deuxieme entier :");
        b = sc.nextInt();}while (b==0);
        double c = a/b;
        System.out.println("Le résultat de l'opération est: "+c);
    }

    //3.3.1 Règle graduée

    public static void regle() {
        Scanner sc = new Scanner(System.in);
        int a;
        do{
        System.out.println("Saissisez la longueur de votre règle :");
        a = sc.nextInt();}while (a<0);
        for (int i=0;i<=a; i++) {
            if (i%10==0){
                System.out.print("|");
            }else{
            System.out.print("-");}
        }
    }

    //3.3.2 Nombres premiers

    public static void nombrePremier(){
        Scanner sc = new Scanner(System.in);
        int a;
        do{
        System.out.println("Saisissez un entier positif");
        a = sc.nextInt();}while(a<0);
        int i = 2;
        while (i<a && a%i != 0) {
            i++;
        }
        if (i==a) {
            System.out.println(a+" est un nombre premier");
        }
        else{
            System.out.println(a+" n'est pas un nombre premier");
        }
    }

//3.4 Tableaux

   public static void initialisationTableau() {
        int maxval;
        int minval;
        int[] tableau = new int[20];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Saisir un entier");
            int entier = scanner.nextInt();
            tableau[i] = entier;
        }
        for (int nombre:tableau) {
            System.out.print(nombre+" ");
        }

        maxval=tableau[0];
        minval=tableau[0];
        for (int i=0; i<tableau.length;i++) {
            if (tableau[i]>maxval) {maxval=tableau[i];}
            if (tableau[i]<minval) {minval=tableau[i];}
        }
        System.out.println("\nLe minimum est: "+minval);
        System.out.println("Le maximum est: "+maxval);
    }
}
