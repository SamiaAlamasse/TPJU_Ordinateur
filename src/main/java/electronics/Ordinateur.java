package electronics;

import java.util.ArrayList;

/**
 * D�crivez votre classe Ordinateur ici.
 *
 * @author (votre nom)
 * @version (un num�ro de version ou une date)
 */
public class Ordinateur
{
	public String type;
	public String brand;
	public ArrayList<Peripherique> peripheriques;

	public String getType(){
        return this.type;
    }
    
    public void setType(String type){
        this.type = type;
    }
    
    public String getBrand(){
        return this.brand;
    }
    
    public void setBrand(String brand){
        this.brand = brand;
    }
    
    public ArrayList<Peripherique> getPeripheriques() {
		return peripheriques;
	}

	public void setPeripheriques(ArrayList<Peripherique> peripheriques) {
		this.peripheriques = peripheriques;
	}

    /**
     * Constructeur d'objets de classe Ordinateur
     */
    public Ordinateur(String type, String brand)
    {
        // initialisation des variables d'instance
        this.type = type;
        this.brand = brand;
        this.peripheriques = new ArrayList<Peripherique>();
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
    	String peripheriques = "\nPeripheriques : \n";
    	for(Peripherique p : this.peripheriques) {
    		peripheriques = peripheriques+p.getType()+"\n";
    	}
        return type + " " + brand + peripheriques;
    }
    
    public void addPeripherique(Peripherique p) {
    	p.setOrdi(this);
    	this.peripheriques.add(p);
    }

	@Override
	public boolean equals(Object obj) {
	
		 if (obj instanceof Ordinateur) {
		        Ordinateur ordi= (Ordinateur)obj;
		         return ordi.getType().equals(this.type) && ordi.getBrand().equals(this.brand) 
		        		 && ordi.getPeripheriques().equals(this.peripheriques);
		          
		    }
		    return false;
		
	}
    
    
}
