package packproiektua;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FitxeroakIrakurri {
	
	public static void fitxeroaErakutsi(String pFitxeroa) throws FileNotFoundException, IOException{
		String katea;
		FileReader f=new FileReader(pFitxeroa);
		BufferedReader b=new BufferedReader(f);
		while((katea=b.readLine())!=null){
			System.out.println(katea);
		}
		b.close;
	}
}
