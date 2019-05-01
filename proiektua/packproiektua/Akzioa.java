package packproiektua;

public class Akzioa {
	private String izena;
	private int ident;
	
	public Akzioa(String pIzena,int pIdent){
		this.izena = pIzena;
		this.ident=pIdent;
	}
	public void akzioaBurutu(){
		int lag=Teklatua.getNireTeklatua().irakurriZenb();
		Boolean giltza=false; //Apaizarekin hitz egin eta gero true bihurtuko da
		Protagonista p=Protagonista.getNireProtagonista("Sd");
		if(this.ident==1){
			System.out.println("Tabernariarengana hurbildu zara eta berarekin hitz egiten zailatu zara...");
			if(dialogoaBurutu()){
				fitxeroaErakutsi("Tabernaria_T");
			}
			else{
				fitxeroaErakutsi("Tabernaria_F");
			}
		}
		else{
			if(this.ident==2){
				System.out.println("Prostitutarengana hurbildu zara eta berarekin hitz egiten zailatu zara...");
				if(dialogoaBurutu()){
					fitxeroaErakutsi("Prostituta_T");
				}
				else{
					fitxeroaErakutsi("Prostituta_F");
				}
			}
			else{
				System.out.println("Gizon zaharrarenga hurbidu zara...");
				if(this.ident==3){
					fitxeroaErakutsi("GizonZaharra");
				}
				else{
					if(this.ident==4){
						System.out.println("Kutxagogorrera hurbildu zara eta irekitzeko gako bat behar duela ikusten duzu...");
						int gakoa=zenbakiaLortu();
						if(gakoa==1830){
							fitxeroaErakutsi("Kutxagogorra");
							ListaEgoerak.getNireListaEgoerak.eguneratuEgoerak(2); //hurrengo egoerara pasatuko da
						}
						else{
							System.out.println("Kutxagogorra irekitzen saiatu zara baina ez da ezer gertatu...");
						}
					}
					else{
						if(this.ident==5){
							System.out.println("Ehorzlearengana hurbildu zara eta berarekin hitz egiten saiatu zara...");
							fitxeroaErakutsi("Ehorzlea");
						}
						else{
							if(this.ident==6){
								System.out.println("Apaizarengana hurbildu zara eta berarekin hitz egiten zailatu zara...");
								fitxeroaErakutsi("Apaiza");
								giltza=true;
							}
							else{
								if(this.ident==7){
									if(giltza){
										fitxeroaErakutsi("Eliza_T");
										ListaEgoerak.getNireListaEgoerak.eguneratuEgoerak(3); //hurrengo egoerara pasatuko da
									}
									else{
										fitxeroaErakutsi("Eliza_F");
									}
								}
								else{
									if(this.ident==8){
										tiroEgin();
									}
									else{
										if(this.ident==9){
											System.out.println("Pitia erabili duzu");
											p.objektuaErabili("Pitia");
										}
										else{
											if(this.ident==10){
												System.out.println("Kapela erabili duzu");
												p.objektuaErabili("Kapela");
											}
											else{
												if(this.ident==11){
													System.out.println("Likorea erabili duzu");
													p.objektuaErabili("Likorea");
												}
												else{
													mugitu();
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
	private boolean dialogoaBurutu(){
		Boolean burutu=false;
		Dadoa d=new Dadoa(6);
		d.bota();
		if(Protagonista.getNireProtagonista("Sd").getCar()+d.getGoikoAldea()>=6) {
			burutu=true;
		}
		return burutu;
	}
	private void tiroEgin(){
		int indarra=Protagonista.getNireProtagonista("Sd").getInd();
		int atq=Protagonista.getNireProtagonista("Sd").getAtq();
	}
	
	public void akzioaInprimatu(){
		System.out.println(this.izena);
	}
	public void setIdent(int pIdentitatea){
		this.ident=pIdentitatea;
	}
	
	private void mugitu(){
		try{
			int lag=noranzkoaLortu();
			Protagonista p=Protagonista.getNireProtagonista("Sd");
			int x=p.xArdatzaLortu();
			int y=p.yArdatzaLortu();
			if(lag==1){
				if(y+1<=20){
					p.posizioazAldatu(x,y+1);
				}
			}
			else{
				if(lag==2){
					if(y-1>=0){
						p.posizioazAldatu(x,y-1);
					}
				}
				else{
					if(lag==3){
						if(x-1>=0){
							p.posizioazAldatu(x-1,y);
						}
					}
					else{
						if(x+1<=20){
							p.posizioazAldatu(x+1,y);
						}
					}
				}
			}
		}
		catch(balioEzEgokia lag){
			System.out.println("Sartu duzun balioa ez da egokia...");
		}
	}
	
	private int zenbakiaLortu(){
		try{
			int lag=Teklatua.getNireTeklatua.irakurriZenb();
			return lag;
		}
		catch(NumberFormatException lag){
			System.out.println("Benetan badakizu zenbakiak nola diren?");
		}
	}
	
	private int noranzkoaLortu() throws balioEzEgokia{
		char lag=Teklatua.getNireTeklatua.irakurriChar();
		int emaitza=0;
		if((lag=='W')||(lag=='w')){
			emaitza=1;
		}
		else{
			if((lag=='S')||(lag=='s')){
				emaitza=2;
			}
			else{
				if((lag=='A')||(lag=='a')){
					emaitza=3;
				}
				else{
					if((lag=='D')||(lag=='d')){
						emaitza=4;
					}
					else {
						throw new balioEzEgokia();
					}
				}
			}
		}
		return emaitza;
	}
}
