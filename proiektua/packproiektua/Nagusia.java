package packproiektua;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Nagusia {
	
	private char[][] hasmatrix= new char[20][20];
	
	
    public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException, BalioEzEgokia{
/*
 * 
 * 		JOKOAREN BALIOAK HASIERATU
 *     	
 */
    	
    	/*
    	
    	ListaEtsaiak l=new ListaEtsaiak();
    	l.etsaiakSortu();
    	l.etsaiakInprimatu();
    	Teklatua.getNireTeklatua().emanEnter();
    	
    	*/
    	
    	
    	
    	int preX;
    	int preY;
    	ListaAkzioa listaAkz = new ListaAkzioa();
    	Saloia saloia = Saloia.getNireSaloia();
    	Hilerria hilerria = Hilerria.getNireHilerria();
    	Banketxea banketxea = Banketxea.getNireBanketxea();
    	Inbentarioa inb = Inbentarioa.getNireInbentarioa();
    	saloia.jokoaHasieratu();           
    	Protagonista p = Protagonista.getNireProtagonista(); 
/*
 * 
 * 		SALOIA
 * 
 */		//SALOIKO BALIOAK HASIERATU
    	///*
    	/*saloia.eszenatokiaHasieratu();
    	p.hasierakoPosizioa(1);
    	ListaAkzioa listaAkzS=listaAkz.listaAkzioakSortu(1);
    	
    	//SALOIA EGOERA    
    	while(!listaAkz.bukatutaSaloia()){
    	saloia.eszenatokiaInprimatu();
    	preX=p.getX();
    	preY=p.getY();
    	listaAkzS.akzioaAukeratuEtaBurutu(1);
    	Teklatua.getNireTeklatua().emanEnter();
    	saloia.deletePertsonaiaMatrizetik(preX, preY);
    	saloia.setPertsonaiaMatrizean();
    	}
    	
    	//EGOERAZ ALDATU
    	saloia.eszenatokiaBukatu();
    	Teklatua.getNireTeklatua().emanEnter();    	//
/*
 * 
 * 		HILERRIA
 *     	
 */
    	///*
    	
    	/* hilerria.eszenatokiaHasieratu();
    	 
    	p.hasierakoPosizioa(2);
    	ListaAkzioa listaAkzH=listaAkz.listaAkzioakSortu(2);
    	
        
    	while(!listaAkz.bukatutaHilerria()){
    	hilerria.eszenatokiaInprimatu();
    	preX=p.getX();
    	preY=p.getY();
    	listaAkzH.akzioaAukeratuEtaBurutu(2);
    	Teklatua.getNireTeklatua().emanEnter();
    	hilerria.deletePertsonaiaMatrizetik(preX, preY);
    	hilerria.setPertsonaiaMatrizean();
    	}
    	
    	hilerria.eszenatokiaBukatu();
    	Teklatua.getNireTeklatua().emanEnter();
    	
   	//*/
    	//BANKETXEA//
    	
    	ListaGordelekuak l1 = ListaGordelekuak.getNireListaGordelekuak();
    	//Banketxearen balioak hasieratu//
    	banketxea.eszenatokiaHasieratu();
    	p.hasierakoPosizioa(3);
    	ListaAkzioa listaAkzB=listaAkz.listaAkzioakSortu(3);
    	l1.gordelekuakSortu();
    	banketxea.gordelekuakInprimatu(l1);
    	inb.inbentarioaSortu();
    	ListaEtsaiak listae = new ListaEtsaiak();
    	listae.etsaiakSortu();
    	banketxea.sartuEtsaiakBanketxean(listae);
    	
        
    	while(!listaAkz.bukatutaBanketxea()){
    		banketxea.eszenatokiaInprimatu();
    		preX=p.getX();
    		preY=p.getY();
    		System.out.println("+++++ ETSAIEN TXANDA +++++");
 
    		listae.eraso();
    		System.out.println("Etsaien erasoaren ondoren, zure bizitza "+ p.getPv() +" da");
    		System.out.println();
    		System.out.println("+++++ ZURE TXANDA +++++");
    		listae.etsaienBizitzaInprimatu();
    		System.out.println(" ");
    		listaAkzB.akzioaAukeratuEtaBurutu(3);
    		if(!listaAkzB.getMugitu1()){
    			Teklatua.getNireTeklatua().emanEnter();
    		}
    		listaAkzB.setMugitu1(false);
    		banketxea.deletePertsonaiaMatrizetik(preX, preY);
    		banketxea.setPertsonaiaMatrizean();
    		if((listae.etsaiaGuztiakHilda()) || (p.getPv()<=0)){
    			//listaAkz.pasatuBanketxetikAmaierara();
    		}
    	}
    	if(p.getPv()>0){
    		FitxeroakIrakurri.fitxeroaErakutsi("Amaiera.txt");
    		Teklatua.getNireTeklatua().emanEnter();
    		banketxea.eszenatokiaBukatuOndo();
        	Teklatua.getNireTeklatua().emanEnter();
    	}
    	else if(listae.etsaiaGuztiakHilda()){
    		banketxea.eszenatokiaBukatuTxarto();
        	Teklatua.getNireTeklatua().emanEnter();
		}
    	
    
    	
    }
}

