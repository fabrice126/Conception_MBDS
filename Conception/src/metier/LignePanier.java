/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

/**
 *
 * @author Yoann
 */
public class LignePanier {
    
    private String id;
    private Produit produit;

    public LignePanier(String id, Produit produit) {
        this.id = id;
        this.produit = produit;
    }
    
    public LignePanier(Produit produit) {
        this.produit = produit;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }
    public void ajouterAPanier(Panier lePanier){
        
    }
}
