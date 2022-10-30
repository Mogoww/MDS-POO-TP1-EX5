public class Bouteille {

    // attributs
    private int quantite;
    private boolean estOuverte;

    // constructeur
    public Bouteille(int quantite){
        this.quantite = quantite;
        this.estOuverte = false;
    }

    // méthodes
    public void ouvrir(){
        this.estOuverte = true;
    }

    public void fermer(){
        this.estOuverte = false;
    }

    public void verserDans(Verre verre, int volume){
        if (this.estOuverte){
            this.quantite -= volume;
            verre.remplir(volume);
        }
    }
}
