import java.util.Scanner;

public class Cafe {
    public static void main(String[] args) {

        int sommePourCafe = 45;
        int pieceTempo;
        int calculPieces = 0;

        //variable pour calcul  du nombre de pieces par valeur de pièce
        int piece20C = 0, piece10C = 0, piece5C = 0, piece = 0;
        int totalRecu;

//Boucle pour atteindre le montant souhaité         
    do {
        Scanner pieces = new Scanner(System.in); //Scanner pour entrer une pièce
        do {
            System.out.println("Ajouter uniquement des pieces de 5c, 10c, 20c");
            pieceTempo = pieces.nextInt();
        } while (pieceTempo != 5 && pieceTempo != 10 && pieceTempo != 20);
        calculPieces += pieceTempo;
        System.out.println(calculPieces);

        switch (pieceTempo){
            case 5 :
                piece5C++;
                piece = piece + piece5C;
                System.out.println("Piece de 5c ajoutée " +piece5C);
                break;

            case 10 :
                ++piece10C;
                piece = piece + piece10C;
                System.out.println("Piece de 10c ajoutée " +piece10C);
                break;
            case 20 :
                ++piece20C;
                piece = piece + piece20C;
                System.out.println("Piece de 20c ajoutée " +piece20C);
                break;
        }
        totalRecu = (piece20C*20) + (piece10C*10) + (piece5C*5);
    } while (calculPieces < sommePourCafe);

//Résultat final
        System.out.println("Comptage pièces: ");
        System.out.println("5 centimes : " + piece5C);
        System.out.println("10 centimes : " + piece10C);
        System.out.println("20 centimes : " + piece20C);
        System.out.println("Total reçu : " + totalRecu);
        System.out.println("Préparation de votre café, bonne dégustation");
    }
}
