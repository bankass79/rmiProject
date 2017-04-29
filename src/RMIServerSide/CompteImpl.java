package RMIServerSide;

public class CompteImpl implements Compte {
	
	// champs
	
	private String _nom= null;
	
	
	private double _solde=0.0;
	
	
	
	
	/**
	 * constructeur sans paramètre
	 */
	public CompteImpl() {
		
		_nom= "unknow";
		
		_solde=0.0;
	}

	
	// Constructeur avec un seul paramètre
	
	/**
	 * @param _nom
	 */
	public CompteImpl(String n) {
		
		this();
		
		this._nom = n;
	}



	@Override
	public String nom() {
		
		return  _nom;
	}

	@Override
	public double solde() {
		
		return  _solde;
	}

	@Override
	public void deposer(double montant) {
		
		_solde +=montant;
	}

	@Override
	public void retirer(double montant) {
		
		_solde -=montant;

	}

}
