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
    private String pseudo;
    private String motDePasse;
    private Client leClient;
    
    
    EcranAccueil(){
        
        EcranAccueil ecranAccueil = sessionPasserCmde.traiterConnexion();
    }
    
    public void seConnecter(){
        
        this.leClient = sessionPasserCmde.traiterIdentification(this.pseudo, this.motDePasse);
        this.leClient.getNom();
        this.leClient.getPrenom();
    }
    
}
