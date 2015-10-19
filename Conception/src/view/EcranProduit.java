/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JPanel;
import model.Produit;

/**
 *
 * @author Fabrice
 */
public class EcranProduit extends JPanel{

	Produit prd;

	public EcranProduit() {
		this.prd = prd;
	}

	public void infosProduit(){
	    String idPrd = this.prd.getId();
	    String libelle = this.prd.getLibelle();
	    String description = this.prd.getDescription();
	    double prix = this.prd.getPrixDuJour();
	}
}
