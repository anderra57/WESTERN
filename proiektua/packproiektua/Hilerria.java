package packproiektua;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Hilerria extends Egoera{
	
	private char[][] matrizea;
	private int idEgoera;
	private static Hilerria nireHilerria = null;
	private ListaAkzioa lista;
	
	private Hilerria(String pDeskribapena){
		super(pDeskribapena);
		this.idEgoera=2;
		this.matrizea = new char[20][20];
	}
	public static Hilerria getNireHilerria(){
		if(nireHilerria==null){
			nireHilerria = new Hilerria("Hilerria");
		}
		return nireHilerria;
	}
	public ListaAkzioa getLista(){
		return this.lista.listaAkzioakSortu(2);
		
	}
	
	public void eszenatokiaHasieratu() throws FileNotFoundException, IOException{
		this.matrizea=FitxeroakIrakurri.mapaIrakurri("Hilerria/Hilerria.txt");
		this.pertsonaiakHasieratu();
	}
	
	public void eszenatokiaBukatu() throws FileNotFoundException, IOException{
		this.matrizea=FitxeroakIrakurri.mapaIrakurri("Hilerria/Hilerria_Bukatuta.txt");
		System.out.println();
		System.out.println();
		for (int i=0;i<20;i++) {
			  for (int j=0;j<20;j++) {
				  System.out.print(this.matrizea[i][j]+" ");
			  }
			  System.out.println();
		}
		System.out.println();
		System.out.println();
	}
	
	public void eszenatokiaInprimatu(){
		System.out.println();
		System.out.println();
		for (int i=0;i<20;i++) {
			  for (int j=0;j<20;j++) {
				  System.out.print(this.matrizea[i][j]+" ");
			  }
			  System.out.println();
		}
		System.out.println();
		System.out.println();
	}
	
	public void setPertsonaiaMatrizean(){
		Protagonista p = Protagonista.getNireProtagonista();
		int x= p.getX();
		int y=p.getY();
		matrizea[x][y]='#';
	}
	
	public void deletePertsonaiaMatrizetik(int pX, int pY){
		matrizea[pX][pY]=' ';
	}
	public char matrizekoBalioa(int x, int y){
		return matrizea[x][y];
	}
	
	private void pertsonaiakHasieratu(){
		
        matrizea[6][13]='^';
        matrizea[7][13]='^';
        matrizea[8][13]='^';
        matrizea[8][16]='A';
        matrizea[7][3]='E';
        
    }
	

}
