/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Client;
import model.ClientsManager;
import view.EcranAccueil;

/**
 *
 * @author Fabrice
 */
public class SessionPasserCommande {
    private String ecranCourant;
    private int nbErreurs;
    private EcranAccueil ecranAccueil;
    private Client leClient;
    private ClientsManager clientManager;
    
    public EcranAccueil traiterConnexion(){ return ecranAccueil;}
    
    public Client traiterIdentification(String pseudo, String motDePasse){
        this.leClient = clientManager.rechercherClientParPseudo(pseudo,motDePasse);
        return this.leClient;
    }
    

    
    public int getDelaiInscription(){
        return 0;
    }

    public Client traiterIdentification(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
