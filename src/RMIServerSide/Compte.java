package RMIServerSide;

public interface Compte {

	String nom ();
	
	double solde ();
	
 void deposer (double montant);
 
 void retirer(double montant);
	
}
