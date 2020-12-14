package fr.diginamic.banque.entites;

public class Compte {
    int id;
    float purse;

    public Compte (int id, int purse) {
        this.id = id;
        this.purse = purse;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Compte{");
        sb.append("id=").append(id);
        sb.append(", purse=").append(purse);
        sb.append('}');
        return sb.toString();
    }
}
