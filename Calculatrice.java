import java.util.Scanner;

public class calculatrice {
    public static void main(String[] args) {

        int valeurune, valeurdeux, resultat = 0;
        String operateur;


//Scanner pour choix de la valeur 1
        Scanner premiereValeur = new Scanner(System.in);
        System.out.print("Choisissez une première valeur : ");
        valeurune = Integer.parseInt(premiereValeur.nextLine());
        System.out.println("Vous avez choisi : " +valeurune);


// Scanner pour choix de la valeur 2
        Scanner secondeValeur = new Scanner(System.in);
        System.out.print("Choisisser une seconde valeur : ");
        valeurdeux = Integer.parseInt(secondeValeur.nextLine());
        System.out.println("Vous avez choisi : " +valeurdeux);

//Opération à effectuer
        Scanner operationChoix = new Scanner(System.in);
        System.out.print("Choisissez une opération à effectier : ");
        operateur = operationChoix.nextLine();
        System.out.println("Vous avez choisi : " + operateur);

//Calcul de l'opération
        switch (operateur) {
            case "+" : resultat = valeurune + valeurdeux;
                break;
            case "-" : resultat = valeurune - valeurdeux;
                break;
            case "*" : resultat = valeurune * valeurdeux;
                break;
            case "/" : resultat = valeurune / valeurdeux;
                break;
            default :
                System.out.println("Merci de rentrer un opérateur valide");
        }
        System.out.println("Le calcul de : " + valeurune + operateur + valeurdeux + "=" + resultat);
    }
}
