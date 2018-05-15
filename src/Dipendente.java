
public abstract class Dipendente 
{

	private String nominativo;
	private char sesso;
	private String indirizzo;
	
	
	public Dipendente (String nominativo, char sesso, String indirizzo)
	{
		this.nominativo=nominativo;
		setSesso(sesso);
		this.indirizzo =indirizzo;
		
	}
	
	public Dipendente (Dipendente d)
	{
		this.nominativo=d.getNominativo();
		setSesso(d.getSesso());
		this.indirizzo=d.getIndirizzo();
	}
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}


	public String getNominativo() 
	{
		return nominativo;
	}


	public void setNominativo(String nominativo) 
	{
		this.nominativo = nominativo;
	}


	public char getSesso() 
	{
		return sesso;
	}


	public void setSesso(char sesso) 
	{
		if (sesso=='F')
			this.sesso = sesso;
		else
			this.sesso='M';
	}


	public String getIndirizzo() 
	{
		return indirizzo;
	}


	public void setIndirizzo(String indirizzo)
	{
		this.indirizzo = indirizzo;
	}

}
