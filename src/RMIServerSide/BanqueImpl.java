package RMIServerSide;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Hashtable;

public class BanqueImpl extends  UnicastRemoteObject implements Banque {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//champs
	
	private Hashtable _comptes = null;

	
	// Constructeurs
	
	public  BanqueImpl() throws RemoteException {
		super();
		
		_comptes= new Hashtable<>();
		
	}

	
	// Méthodes de l'interface
	@Override
	public boolean existe(String nom) {
		
		return  ((Compte)_comptes.get(nom) !=null);
	}

	@Override
	public void ouvrir(String nom) {
		
		_comptes.put(nom, new CompteImpl(nom));
	
		
	}

	@Override
	public double solde(String compte) {
		
		return  ((Compte)_comptes.get(compte)).solde();
	}

	@Override
	public void deposer(String compte, double montant) {
	
		((Compte)_comptes.get(compte)).deposer(montant);
		
	}

	@Override
	public void retirer(String compte, double montant) {
		
		((Compte)_comptes.get(compte)).retirer(montant);
		
	}

	@Override
	public void transferer(String compte1, String compte2, double montant) {
	
		((Compte)_comptes.get(compte1)).retirer(montant);
		((Compte)_comptes.get(compte2)).retirer(montant);
		
	}

}
