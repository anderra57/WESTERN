package packproiektua;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public abstract class Egoera {
	protected char[][] matrizea;
	private String deskribapena;
	protected ListaAkzioa lista;
	protected int idEgoera;
	private static Egoera nireEgoera = null;
	protected ListaGordelekuak lista1;
	
	public Egoera(String pDeskribapena){
		this.deskribapena = pDeskribapena;
		this.lista= new ListaAkzioa();
		this.lista1=ListaGordelekuak.getNireListaGordelekuak();
	}
	
	

	public void egoeraInprimatu(){
		System.out.println(this.deskribapena);
	}
	/*
	public void ezsenatokiaInprimatu(Egoera pEgoera) throws FileNotFoundException, IOException{
		if(pEgoera instanceof Hilerria){
			FitxeroakIrakurri.fitxeroaErakutsi("Hilerria");
		}
		else{
			if(pEgoera instanceof Saloia){
				FitxeroakIrakurri.fitxeroaErakutsi("Saloia");
			}
			else{
				FitxeroakIrakurri.fitxeroaErakutsi("Banketxea");
			}
		}
	}*/
	
	public int egungoEgoeraLortu(){
		return this.idEgoera;
	}
	
	/*
	public void printeatuEgoerarenAukerak() throws FileNotFoundException, IOException{
		ListaAkzioa l= new ListaAkzioa();
		if(this.idEgoera==1){
			l.listaAkzioakSortu(nireEgoera);
		}
		else{
			if(this.idEgoera==2){
				l.listaAkzioakSortu(nireEgoera);
			}
			else{
				if(this.idEgoera==3){
					l.listaAkzioakSortu(nireEgoera);
				}
			}
		}
		l.akzioaAukeratuEtaBurutu(this.idEgoera);
	}

	*/
	
	public void hasieratu(){
		this.lista.clear();
		ListaAkzioa l= new ListaAkzioa();
		l.listaAkzioakSortu(idEgoera);
		this.lista=l;
	}
	

}