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
		int parametroa=Teklatua.getNireTeklatua().irakurriZenb();
		Akzioa a=null;
		Iterator<Akzioa>itr=this.getIteradorea();
		while(itr.hasNext()&&lag>0){
			a=itr.next();
			a.setIdent(parametroa);
			lag--;
		}
		return a;
	}
	
	private void akzioaGehitu(Akzioa pAkzioa){
		this.lista.add(pAkzioa);
	}
	
	public ListaAkzioa listaAkzioakAukeratu(Egoera pEgoera){
		ListaAkzioa l=new ListaAkzioa();
		Akzioa a=null;
		if(pEgoera instanceof Hilerria){
			a=new Akzioa("Ehorzlearekin hitz egin",1);
			l.akzioaGehitu(a);
			a=new Akzioa("Apaizarekin hitz egin",1);
			l.akzioaGehitu(a);
			a=new Akzioa("Elizan sartu",1);
			l.akzioaGehitu(a);
		}
		else{
			if(pEgoera instanceof Saloia){
				a=new Akzioa("Tabernariarekin hitz egin",1);
				l.akzioaGehitu(a);
				a=new Akzioa("Prostitutarekin hitz egin",1);
				l.akzioaGehitu(a);
				a=new Akzioa("Gizon zaharrarekin",1);
				l.akzioaGehitu(a);
				a=new Akzioa("Kutxagogorrera hurbildu",1);
				l.akzioaGehitu(a);
			}
			else{ //Banketxea
				a=new Akzioa("Tiro egin",3);
				l.akzioaGehitu(a);
				a=new Akzioa("Pitia erabili",4);
				l.akzioaGehitu(a);
				a=new Akzioa("Kapela erabili",4);
				l.akzioaGehitu(a);
				a=new Akzioa("Likorea erabili",4);
				l.akzioaGehitu(a);
				a=new Akzioa("Mugitu",2);
				l.akzioaGehitu(a);
			}
		}
		return l;
	}
}