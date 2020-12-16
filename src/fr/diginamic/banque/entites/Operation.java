package fr.diginamic.banque.entites;

public abstract class Operation {
    protected String date;
    protected float amount;

    public Operation(String date, float amount){
        this.date = date;
        this.amount = amount;
    }

    public float getAmount(){
        return this.amount;
    }

    public abstract String afficherType();
}
