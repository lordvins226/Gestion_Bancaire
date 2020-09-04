
package serveur;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class CompteServeur extends UnicastRemoteObject implements Compte {
    private double solde;
    private int numcompte;
    private int telephone;
    private String adresse;
    private String nomclient;

    
    public CompteServeur() throws RemoteException {
    }
    
    
    public void debiter(double montant) throws RemoteException {
        solde-=montant;
    }
		
    public void crediter(double montant) throws RemoteException {
        solde+=montant;
    }
		
    public double lire_solde() throws RemoteException {
        return solde;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
    
    public int getNumcompte() {
        return numcompte;
    }

    public void setNumcompte(int numcompte) {
        this.numcompte = numcompte;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getNomclient() {
        return nomclient;
    }

    public void setNomclient(String nomclient) {
        this.nomclient = nomclient;
    }


}
