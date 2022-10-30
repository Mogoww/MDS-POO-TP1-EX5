public class Verre {

    // Attributs
    private int contenance;
    private int quantite;

    // constructeur
    public Verre(int contenance) {
        this.contenance = contenance;
        this.quantite = 0;
    }

    // Méthodes
    public void remplir(int quantite) {
        if (quantite > 0) {
            this.quantite += quantite;
            if (this.quantite > this.contenance) {
                this.quantite = this.contenance;
            }
        }
    }

}
