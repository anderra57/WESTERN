package packproiektua;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaAkzioa{

	private ArrayList<Akzioa> lista;
	private Protagonista prota1;
	
	
	public ListaAkzioa(){
		this.lista = new ArrayList<Akzioa>();
	}
	
	private Iterator<Akzioa> getIteradorea(){
		return this.lista.iterator();
	}
	
	public void printeatuAkzioa(){
		Akzioa akzioa = null;
		Iterator<Akzioa> itr = this.getIteradorea();
		while(itr.hasNext()){
			akzioa = itr.next();
			akzioa.akzioaInprimatu();
		}
	}
	public Akzioa akzioaAukeratu(){
		int lag=Teklatua.getNireTeklatua().irakurriZenb();
		Akzioa a=null;
		a.setIdent(lag);
		Iterator<Akzioa>itr=this.getIteradorea();
		while(itr.hasNext()&&lag>0){
			a=itr.next();
			lag--;
		}
		return a;
	}
	
	public void akzioaGehitu(Akzioa pAkzioa){
		this.lista.add(pAkzioa);
	}
	
}
