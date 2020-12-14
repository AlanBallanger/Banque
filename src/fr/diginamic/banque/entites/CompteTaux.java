package fr.diginamic.banque.entites;

public class CompteTaux extends Compte{
    int interest;

    public CompteTaux(int id, int purse, int interest) {
        super(id, purse);
        this.interest = interest;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CompteTaux{");
        sb.append("interest=").append(interest);
        sb.append(", id=").append(id);
        sb.append(", purse=").append(purse);
        sb.append('}');
        return sb.toString();
    }
}
