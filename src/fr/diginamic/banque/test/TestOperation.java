package fr.diginamic.banque.test;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Operation;

public class TestOperation {
    public static void main(String[] args) {
        Debit d1 = new Debit("1 janvier", 50);
        Debit d2 = new Debit("5 janvier", 20);
        Credit cr1 = new Credit("3 janvier", 80);
        Credit cr2 = new Credit("7 janvier", 10);

        Operation[] tabOperation = new Operation[4];
        tabOperation[0] = d1;
        tabOperation[1] = d2;
        tabOperation[2] = cr1;
        tabOperation[3] = cr2;

        float total = 0;
        for  (int i = 0; i < 4; i++) {
            if (tabOperation[i].equals(d1) || tabOperation[i].equals(d2)) {
                total = total - tabOperation[i].getAmount();
            }
            else{
                total = total + tabOperation[i].getAmount();
            }
            System.out.println(tabOperation[i].afficherType());
            System.out.println(tabOperation[i].toString());
        }
        System.out.println("Total solde sur le compte : " + total + " €");
    }
}
