package client;

import java.net.MalformedURLException;
import java.rmi.*;
import serveur.Compte;

public class Client 
{
    public static void main (String args[]) throws MalformedURLException, RemoteException, NotBoundException
	{
             Remote r = Naming.lookup("rmi://localhost/refCompte"); 
             if (r instanceof Compte){
                System.out.println("Le solde du compte est : "+((Compte) r).lire_solde());
                ((Compte) r).debiter(1000.0);
                System.out.println("Le solde du compte est : "+((Compte) r).lire_solde());
                ((Compte) r).crediter(500.0);
                System.out.println("Le solde du compte est : "+((Compte) r).lire_solde());        
	}
}

}