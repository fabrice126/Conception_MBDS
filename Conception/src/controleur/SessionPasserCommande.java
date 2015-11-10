package controleur;

import javax.swing.JPanel;

import vue.EcranAccueil;
import metier.Client;
import metier.ClientsManager;
import metier.CommandesManager;
import metier.LignePanier;
import metier.Panier;
import metier.Produit;

public class SessionPasserCommande {

    private JPanel ecranCourant;
    //private int nbErreurs;
    private ClientsManager cm;
    private CommandesManager cmdManager;
    private Produit produit;
    private Panier lePanier;
    private LignePanier laLignePanier;

    public SessionPasserCommande() {
        this.cm = new ClientsManager();
        this.cmdManager = new CommandesManager();
    }

    public JPanel traiterConnexion() {
        return  new EcranAccueil();
    }

    public Client traiterIdentification(String pseudo, String motDePasse) {
        return this.cm.rechercherClientParPseudo(pseudo, motDePasse);
    }
    public void traiterAjoutProduit(Produit leProduit){
        this.produit = leProduit;
        if(this.lePanier == null){
            this.lePanier = this.cmdManager.creePanier();
        }
        this.laLignePanier = this.cmdManager.creerLignePanier(leProduit);
        this.cmdManager.ajouterLigne(lePanier, laLignePanier);
    }
}
