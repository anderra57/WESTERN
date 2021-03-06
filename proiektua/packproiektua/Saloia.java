package packproiektua;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Saloia extends Egoera{
	
	private char[][] hasieramatrizea;
	private static Saloia nireSaloia = null;
	
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
		this.matrizea=FitxeroakIrakurri.mapaIrakurri("Saloia/Saloia.txt");
		this.pertsonaiakHasieratu();
	}
	
	public void eszenatokiaBukatu() throws FileNotFoundException, IOException{
		this.matrizea=FitxeroakIrakurri.mapaIrakurri("Saloia/Saloia_Bukatuta.txt");
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
        matrizea[14][4]='T';
        matrizea[3][15]='P';
        matrizea[6][8]='G';
    }
	
	public void kutxaAgertu(){
		matrizea[2][2]='K';
	}
	
    public void jokoaHasieratu() throws FileNotFoundException, IOException{
		this.hasieramatrizea=FitxeroakIrakurri.mapaIrakurri("Hasiera_mx.txt");
		System.out.println();
		System.out.println();
		for (int i=0;i<20;i++) {
			  for (int j=0;j<20;j++) {
				  System.out.print(this.hasieramatrizea[i][j]+" ");
			  }
			  System.out.println();
		}
		System.out.println();
		System.out.println();
		Teklatua.getNireTeklatua().emanEnter();
		System.out.println("Sartu zure izena:");
		String izena=null;
		while (isNullOrEmpty(izena)){
			izena=Teklatua.getNireTeklatua().irakurriString();
			if (isNullOrEmpty(izena)){
				System.out.println("Ezin duzu hutsik utzi. Sartu zure izena:");
			}
		}
		System.out.println();
		FitxeroakIrakurri.fitxeroaErakutsi("Azalpena.txt");
		System.out.println();
		System.out.println("Ah, btw. Kaixo, " + izena + ". Zorte on!");
		Teklatua.getNireTeklatua().emanEnter();
		System.out.println();
		System.out.println();
		for (int i=0;i<20;i++) {
			  for (int j=0;j<20;j++) {
				  System.out.print(this.hasieramatrizea[i][j]+" ");
			  }
			  System.out.println();
		}
		System.out.println();
		System.out.println();
		Teklatua.getNireTeklatua().emanEnter();
		Protagonista.hasieratuProtagonista(izena);
		Protagonista.getNireProtagonista().setIzena(izena);
		FitxeroakIrakurri.fitxeroaErakutsi("aurkezpena.txt");
		Teklatua.getNireTeklatua().emanEnter();
    	
    }
	
    public static boolean isNullOrEmpty(String str) {
        if(str != null && !str.isEmpty())
            return false;
        return true;
    }
}
