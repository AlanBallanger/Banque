package fr.diginamic.banque.entites;

public class Credit extends Operation {
    public Credit(String date, float amount){
        super(date, amount);
    }

    public String afficherType(){
        return "Crédit";
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Credit{");
        sb.append("date=").append(date);
        sb.append(", amount=").append(amount);
        sb.append('}');
        return sb.toString();
    }
}
