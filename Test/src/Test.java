//import java.io.FileReader;
//import java.io.BufferedReader;
import java.util.*;

//import java.util.StringTokenizer;
 
public class Test {
	private HashMap<Integer,ArrayList<Integer>> Domino = new HashMap<Integer,ArrayList<Integer>>(); 
    

	public static void main(String[] args) {
		/*
		System.out.println("YES");
		ArrayList<ArrayList<ArrayList<Integer>>> list= new ArrayList<ArrayList<ArrayList<
				Integer>>>();
		ArrayList<ArrayList<Integer>> Crea= new ArrayList<ArrayList<
				Integer>>();
		ArrayList<Integer> Domi= new ArrayList<
				Integer>();
		Domi.add(0);
		Domi.add(0);
		for (int k=0; k<5;k++) {
				Crea.add(Domi);
			}
		for (int i=0; i<5;i++) {
			list.add(Crea);
		}*/

		
		
		
		
		/*

		FileReader monFichier = null;
		BufferedReader tampon = null;

		try {
		monFichier = new FileReader("C:\\Users\\ERNEST\\Desktop\\dominos.csv");
		tampon = new BufferedReader(monFichier);
		tampon.readLine();

		while (true) {
		// Lit une ligne de test.csv
		String ligne = tampon.readLine();
		// V�rifie la fin de fichier
		if (ligne == null)
		break;
		System.out.println(ligne);
		
		} // Fin du while
		} catch (IOException exception) {
		exception.printStackTrace();
		} finally {
		try {
		tampon.close();
		monFichier.close();
		} catch(IOException exception1) {
		exception1.printStackTrace();
		}
		}
		} // Fin de main 
		*/
	
		
		
		
		/*
	    String ligne = null;
	 
	  
	    // FileInputStream fis = new FileInputStream(datas);
	    try {
	 
	        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ERNEST\\Desktop\\dominos.csv"));
	 
	       
	        StringTokenizer st=new StringTokenizer( ",");
	        
	        while ((br.readLine())!=null ) { 
	        	ligne=br.readLine();
				String[] splitted=ligne.split("\\|");
				for (int i=0;i<splitted.length;i++)
					System.out.println(splitted[0]);
				
			}
	 
	        System.out.println(st.countTokens());
	        br.close();
	 
	    }
	    catch (Exception e){
	    e.printStackTrace();
	    }
	    }
	    */
		HashMap<Integer,Integer> Domi = new HashMap<Integer,Integer>(); 
		ArrayList<Integer> pioche= new ArrayList<
				Integer>();
		Domi.put(1,5);
		Domi.put(2,6);
		Domi.put(3,4);
		Domi.put(4,7);
		Domi.put(6,9);
		Domi.put(7,15);
		Domi.put(10,7);
		Domi.put(15,9);
		Random rdn= new Random();
		int a=0;
		int compteur=0;
		int domiPioche=0;
		int L=0; 
		for(int i=0; i<5;i++) {
			Collection<Integer> key=Domi.keySet();
	        L=key.size();
	        do {
			a=rdn.nextInt(L);
	        }while(a==0);
			Iterator<Integer> it=key.iterator();
			compteur=0;
			
			while(compteur<a) {
				compteur++;
				domiPioche=it.next();
			}
			pioche.add(domiPioche);
			Domi.remove(domiPioche);
		}
		System.out.println(pioche);
		System.out.println(Domi);
		
}}

	