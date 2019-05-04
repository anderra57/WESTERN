package packproiektua;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class ListaEtsaiak {
	
	private ArrayList<Etsaia> lista;
	
	public ListaEtsaiak(){
		this.lista = new ArrayList<Etsaia>();
	}
	public Iterator<Etsaia> getIteradorea(){
		return this.lista.iterator();
	}
	public void etsaiaGehitu(Etsaia pEtsaia){
		this.lista.add(pEtsaia);
	}
	public Etsaia etsaiaBilatuIzenez(String pIzena){
		Iterator<Etsaia> itr=this.getIteradorea();
		Etsaia e=null;
		boolean aurkitua = false;
		while(itr.hasNext() && !aurkitua){
			e=itr.next();
			if(e.getIzena()==pIzena){
				aurkitua = true;
			}
		}
		return e;
	}
	
	public void etsaienBizitzaInprimatu(){
		Iterator<Etsaia> itr=this.getIteradorea();
		Etsaia e=null;
		while(itr.hasNext()){
			e=itr.next();
			System.out.println(e.getIzena() + " etsaiaren bizitza "+e.getPv() +" da");
			
		}
	} 
	
	public boolean badago(Etsaia pEtsaia)throws BalioEzEgokia{
		Iterator<Etsaia> itr=this.getIteradorea();
		Etsaia e=null;
		boolean aurkitua = false;
		while(itr.hasNext() && !aurkitua){
			e=itr.next();
			if(e == pEtsaia){
				aurkitua = true;
			}
		}
		if(!aurkitua){
			throw new BalioEzEgokia();
		}
		return aurkitua;
		
	}
	
	public void etsaiakInprimatu(){
		Iterator<Etsaia> itr=this.getIteradorea();
		Etsaia e=null;
		while(itr.hasNext()){
			e=itr.next();
			System.out.println(e.getIzena() + " etsaia");
			
		}
	}
	
	public boolean etsaiaGuztiakHilda(){
		Iterator<Etsaia> itr=this.getIteradorea();
		Etsaia e=null;
		boolean guztiak = true;
		while(itr.hasNext() && guztiak){
			e=itr.next();
			if(!e.hilda()){
				guztiak = false;
			}	
		}
		return guztiak;
	}
	
	public void etsaiakSortu(){
		int etskont = 1;
		ListaPertsonaiak pertson=ListaPertsonaiak.nireListaPertsonaiak();
		Banketxea banketxe = Banketxea.getNireBanketxea();
		while (etskont<=7){
			Random rnd=new Random();
			int rx=rnd.nextInt(16)+2;
			int ry=rnd.nextInt(16)+2;
			if(!ListaGordelekuak.getNireListaGordelekuak().okupatutaDago(rx,ry) && !pertson.okupatutaDago(rx,ry)){
				if(etskont==1){
					Etsaia eA = new Etsaia("A",rx,ry);
					this.etsaiaGehitu(eA);
				}
				else if(etskont==2){
					Etsaia eB = new Etsaia("B",rx,ry);
					this.etsaiaGehitu(eB);
				}
				else if(etskont==3){
					Etsaia eC = new Etsaia("C",rx,ry);
					this.etsaiaGehitu(eC);
				}
				else if(etskont==4){
					Etsaia eD = new Etsaia("D",rx,ry);
					this.etsaiaGehitu(eD);
				}
				else if(etskont==5){
					Etsaia eE = new Etsaia("E",rx,ry);
					this.etsaiaGehitu(eE);
				}
				else if(etskont==6){
					Etsaia eF = new Etsaia("F",rx,ry);
					this.etsaiaGehitu(eF);
				}
				else if(etskont==7){
					Etsaia eG = new Etsaia("G",rx,ry);
					this.etsaiaGehitu(eG);
				}
				
				banketxe.setEtsaiakMatrizean(rx, ry);
				etskont=etskont+1;		
			}
			
		}
	}
	
}
