package packproiektua;

import java.util.Iterator;

public class Banketxea extends Egoera{
	
	private char[][] matrizea;
	private int idEgoera;
	private ListaGordelekuak listagor;
	
	public Banketxea(String pDeskribapena, ListaAkzioa pLista){
		super(pDeskribapena, pLista);
		this.matrizea = new char[20][20];
		this.idEgoera=3;
	}
	
	public ListaGordelekuak gordelekuakSortu(){
		ListaGordelekuak lista = new ListaGordelekuak().getNireListaGordelekuak();
		//gehitu
		return lista;
	}
	
	public void eszenatokiaInprimatu(){
		for (int i=0;i<20;i++) {
			  for (int j=0;j<20;j++) {
				  if(i==0 || i==19){
					  matrizea[i][j]='+';
				  }
				  else if(j==0 || j==19){
					  matrizea[i][j]='+';
				  }
				  else{
					  matrizea[i][j]='-';
				  }
			  }
		}
		for (int i=0;i<20;i++) {
			  for (int j=0;j<20;j++) {
				  System.out.print(matrizea[i][j]+" ");
			  }
			  System.out.println();
		}
	}
	public void gordelekuakInprimatu(ListaGordelekuak lista1){
		int x = 0;
		int y = 0;
		Gordelekua gordelekua = null;
		Iterator<Gordelekua> itr = lista1.getIteradorea();
		while(itr.hasNext()){
			gordelekua = itr.next();
			x = gordelekua.getX();
			y = gordelekua.getY();
		}
	}
}
