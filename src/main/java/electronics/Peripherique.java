package electronics;


/**
 * D�crivez votre classe Peripherique ici.
 *
 * @author (votre nom)
 * @version (un num�ro de version ou une date)
 */
public class Peripherique
{
    // variables d'instance - remplacez l'exemple qui suit par le v�tre
    private String type; 
    private Ordinateur ordi;
    
    

    public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Ordinateur getOrdi() {
		return ordi;
	}

	public void setOrdi(Ordinateur ordi) {
		this.ordi = ordi;
	}

	/**
     * Constructeur d'objets de classe Peripherique
     */
    public Peripherique(String type)
    {
        // initialisation des variables d'instance
        this.type = type;
    }

    /**
     * Un exemple de m�thode - remplacez ce commentaire par le v�tre
     *
     * @param  y   le param�tre de la m�thode
     * @return     la somme de x et de y
     */
    public String sampleMethod()
    {
        // Ins�rez votre code ici
        return this.type +" de "+this.ordi.sampleMethod();
        
 
    }
    
    public static void main(String[] args) {
    	Ordinateur mac = new Ordinateur("Desktop", "Apple");
    	Peripherique epson = new Peripherique("Imprimante");
    	Peripherique logitec = new Peripherique("Souris");
    	
    	mac.addPeripherique(epson);
    	mac.addPeripherique(logitec);
    	
    	System.out.println(mac.sampleMethod());
    	System.out.println(epson.sampleMethod());
    	System.out.println(logitec.sampleMethod());
    	
    }

	@Override
	public boolean equals(Object obj) {
		 if (obj instanceof Peripherique) {
			 Peripherique p= (Peripherique)obj;
		        return p.getType().equals(this.type);
		    }
		    return false; 
		
	}
    
    
}

