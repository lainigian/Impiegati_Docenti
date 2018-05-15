
public class MainClass 
{

	public static void main(String[] args) 
	{
		Dipendente dip1,dip2;
		
		Dipendente[] elencoDipendenti=new Dipendente[3];
		
		
		if (Math.random()<0.5)
		{
			elencoDipendenti[0]= new Docente("Rossi Luciano",'M',"Via dei mille","Supplente","Matematica");
			elencoDipendenti[1]=new Docente("Neri Maria",'F',"Via del mare","Supplente","Informatica");
			elencoDipendenti[2]=new Docente("Peppe Tillo",'M',"Via di sotto","ITP","Informatica");
		}
		else	
		{
			elencoDipendenti[0]= new Impiegato("Rossi Mario",'M',"Via dei mille","Segreteria didattica");
			elencoDipendenti[1]=new Impiegato("Neri Lina",'F',"Via del mare","Segreteria");
			elencoDipendenti[2]=new Impiegato("Peppe Franna",'M',"Via di sotto","ATA");
		}
		
		for (int i = 0; i < elencoDipendenti.length; i++) 
		{
			if (elencoDipendenti[i] instanceof Docente)
				System.out.println(elencoDipendenti[i].getNominativo()+" "+((Docente)elencoDipendenti[i]).getDisciplina());
				System.out.println(elencoDipendenti[i].getNominativo());
		}		

	}

}

