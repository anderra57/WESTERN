package packproiektua;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Saloia extends Egoera{
	
	private char[][] matrizea;
	private int idEgoera;
	private static Saloia nireSaloia = null;
	private ListaAkzioa lista;
	
	private Saloia(String pDeskribapena){
		super(pDeskribapena);
		this.matrizea = new char[20][20];
		this.idEgoera=1;
	}
	public static Saloia getNireSaloia(){
		if(nireSaloia==null){
			nireSaloia = new Saloia("Saloia");
		}
		return nireSaloia;
	}
	public ListaAkzioa getLista(){
		return this.lista.listaAkzioakSortu(1);
		
	}
	
	
	public void eszenatokiaHasieratu() throws FileNotFoundException, IOException{
		this.matrizea=FitxeroakIrakurri.mapaIrakurri("./proiektua/fitxategiak/Saloia2/Saloia.txt");
		this.pertsonaiakHasieratu();
	}
	
	public void eszenatokiaInprimatu(){
		
		for (int i=0;i<20;i++) {
			  for (int j=0;j<20;j++) {
				  System.out.print(this.matrizea[i][j]+" ");
			  }
			  System.out.println();
		}
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
        matrizea[14][3]='T';
        matrizea[2][14]='P';
        matrizea[7][6]='G';
    }
	
	public void kutxaAgertu(){
		matrizea[1][1]='K';
	}
	
}
