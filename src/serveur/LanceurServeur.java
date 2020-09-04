
package serveur;

import java.net.MalformedURLException;
import java.rmi.Naming;
//import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;


public class LanceurServeur {
    public static void main(String []args) throws MalformedURLException, RemoteException{
        java.rmi.registry.LocateRegistry.createRegistry(1099);
        System.out.println("Mise en place du Security Manager ...");
       // System.setSecurityManager(new RMISecurityManager());
        CompteServeur cptServ=new CompteServeur();
        cptServ.setSolde(300000.00);
        System.out.println("Enregistrement du serveur ...");
        Naming.rebind("rmi://localhost/refCompte", cptServ);
    }
}
