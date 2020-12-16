package fr.diginamic.banque.entites;

public class Debit extends Operation {
    public Debit(String date, float amount){
        super(date, amount);
    }

    public String afficherType(){
        return "Débit";
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Debit{");
        sb.append("date=").append(date);
        sb.append(", amount=").append(amount);
        sb.append('}');
        return sb.toString();
    }
}
