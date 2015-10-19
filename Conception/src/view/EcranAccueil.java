/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.SessionPasserCommande;
import javax.swing.JPanel;
import model.Client;
/**
 *
 * @author Fabrice
 */
public class EcranAccueil extends JPanel{
    
    
    private SessionPasserCommande sessionPasserCmde;
    private EcranAccueil ecranAccueil;
    private String id;
    private Client leClient;
    
    
    EcranAccueil(){
        EcranAccueil ecranAccueil = sessionPasserCmde.traiterConnexion();
    }
    
    public void seConnecter(){
        this.leClient = sessionPasserCmde.traiterIdentification(this.id);
        this.leClient.getNom();
        this.leClient.getPrenom();
        this.leClient.getAdresseDeLivraison();
        this.leClient.getAdresseDeFacturation();
    }
    
}
