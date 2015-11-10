/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

/**
 *
 * @author Fabrice
 */
public class CommandesManager {

    public Panier creePanier() {
        return new Panier();
         
    }
    public LignePanier creerLignePanier(Produit leProduit){
        LignePanier lignePanier = new LignePanier(leProduit);
        return lignePanier;
    }
    public void ajouterLigne(Panier lePanier, LignePanier laLignePanier){
        laLignePanier.ajouterAPanier(lePanier);
        
    }
}
