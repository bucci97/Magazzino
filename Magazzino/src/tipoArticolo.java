

public class tipoArticolo {
	double prezzo;
	String desc="";
	String nomArt="";
	
	public tipoArticolo(String nomArt,String desc,double prezzo){
		this.prezzo=prezzo;
		this.nomArt=nomArt;
		this.desc=desc;
	}
	
	public String toString() {
		String stringa=nomArt+";"+desc+";"+prezzo;
		return stringa;
		
	}
	
}
