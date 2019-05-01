package packproiektua;

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
		return this.lista.listaAkzioakSortu(nireSaloia);
		
	}
	
	
	public void eszenatokiaHasieratu(){
		for (int i=0;i<20;i++) {
			  for (int j=0;j<20;j++) {
				  if(i==0 || i==19){
					  this.matrizea[i][j]='+';
				  }
				  else if(j==0 || j==19){
					 this. matrizea[i][j]='+';
				  }
				  else{
					  this.matrizea[i][j]='-';
				  }
			  }
		}
	}
	public void eszenatokiaInprimatu(){
		
		for (int i=0;i<20;i++) {
			  for (int j=0;j<20;j++) {
				  System.out.print(this.matrizea[i][j]+" ");
			  }
			  System.out.println();
		}
	}
	public void setPertsonaiaMatrizean(int rx, int ry){
		matrizea[rx][ry]='#';
	}
	
}
