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
    public void remplir(int volume) {
        if (volume > 0) {
            this.quantite += volume;
            if (this.quantite > this.contenance) {
                this.quantite = this.contenance;
            }
        }
    }

    public void boire(int volume){
        if (volume > 0) {
            this.quantite -= volume;
            if (this.quantite < 0) {
                this.quantite = 0;
            }
        }
    }

}
