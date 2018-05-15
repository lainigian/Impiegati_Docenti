
public class Impiegato extends Dipendente
{

	private String ufficio;
	
	public Impiegato(String nominativo, char sesso, String indirizzo, String ufficio)
	{
		super( nominativo,  sesso,  indirizzo);
		this.setUfficio(ufficio);
	}
	
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}



	public String getUfficio() {
		return ufficio;
	}



	public void setUfficio(String ufficio) {
		this.ufficio = ufficio;
	}
	
	

}
