package packproiektua;

public class Saloia extends Egoera{
	
	private char[][] matrizea;
	
	public Saloia(String pDeskribapena){
		this.matrizea = new char[20][20];
		super(pDeskribapena);
		this.idEgoera=1;
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
}
