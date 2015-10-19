/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Fabrice
 */
public class Client {
    
    private String nom;
    private String prenom;
    private String id;
    private String adresseDeLivraison;
    private String adresseDeFacturation;
    
    
    Client(String nom,String prenom, String id, String adresseDeLivraison, String adresseDeFacturation){
        this.nom = nom;
        this.prenom = prenom;
        this.id = id;
        this.adresseDeLivraison = adresseDeLivraison;
        this.adresseDeFacturation = adresseDeFacturation;
    }
    
    
    public String getNom(){
        return this.nom;
    }
    
    public String getPrenom(){
        return this.prenom;
    }

    public String getId(){
        return this.id;
    }

    public String getAdresseDeLivraison(){
        return this.adresseDeLivraison;
    }

    public String getAdresseDeFacturation() {
        return this.adresseDeFacturation;
    }
    
    
}
