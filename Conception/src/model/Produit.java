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
public class Produit {
    
    private String id;
    private String libelle;
    private String description;
    private double prixDuJour;
    
    
    Produit(String id,String libelle, String description, double prixDuJour){
        this.libelle = libelle;
        this.description = description;
        this.id = id;
        this.prixDuJour = prixDuJour;
    }
    
    
    public String getLibelle(){
        return this.libelle;
    }
    
    public void setLibelle(String libelle) {
    	this.libelle = libelle;
    }

    public String getDescription(){
        return this.description;
    }

    public void setDescription(String description) {
    	this.description = description;
    }

    public String getId(){
        return this.id;
    }

    public void setId(String id) {
    	this.id = id;
    }

    public double getPrixDuJour(){
        return this.prixDuJour;
    }

    public void setPrixDuJour(double prixDuJour) {
    	this.prixDuJour = prixDuJour;
    }    
}
