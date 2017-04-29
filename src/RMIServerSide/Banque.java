package RMIServerSide;

import java.rmi.Remote;



 interface Banque extends  Remote   {

	/**
	 * 
	 */
	 boolean existe(String nom); 
	 void ouvrir (String nom);
	 
	 double solde(String compte);
	 
	 void deposer(String compte, double montant);
	 
	 void retirer(String compte, double montant);
	 
	 void transferer( String compte1, String compte2, double montant);
 
}
