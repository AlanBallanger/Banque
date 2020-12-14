package fr.diginamic.banque.test;
import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {
    public static void main(String[] args) {
        Compte picsou = new Compte(1, 100);
        System.out.println(picsou.toString());
        CompteTaux cresus = new CompteTaux(2, 100, 5);
        System.out.println(cresus.toString());

        Compte toto = new Compte(3, 9999);
        CompteTaux titi = new CompteTaux(4, 959595, 50);

        Compte[] tabCompte = new Compte[2];
        tabCompte[0] = toto;
        tabCompte[1] = titi;

        for  (int i = 0; i < 2; i++) {
            System.out.println(tabCompte[i]);
        }
    }
}