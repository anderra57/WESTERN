package packproiektua;

public class Jokoa {
	private Egoera egungoEgoera;
	private Pertsonaia egungoPertsonaia;
	
	public Jokoa(Egoera pEgungoEgoera, Pertsonaia pEgungoPertsona){
		this.egungoEgoera=pEgungoEgoera;
		this.egungoPertsonaia=pEgungoPertsona;
	}
	
	public void partidaJokatu(){
		ListaAkzioa l1 =new ListaAkzioa();
		l1.listaAkzioakSortu(1);
		ListaEgoerak legoera =ListaEgoerak.getNireListaEgoerak();
		legoera.hasieratuEgoerak();
	}
	
	private void hasieratuEgoerak(){
		ListaEgoerak le=ListaEgoerak.getNireListaEgoerak();
		le.hasieratuEgoerak();
	}
}
