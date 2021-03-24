//Talal Ghafoor CSC 301
package symboltable; 

import algs4.BSTEssential;
import algs4.StdIn;
import algs4.StdOut;

public class TranslateCodonToAA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BSTEssential<String, String> codonTranslator = new BSTEssential<>();
		StdIn.fromFile("data/codontranslation.txt");
		
		while(!StdIn.isEmpty()){
			String line = StdIn.readLine();
			String[] fields = line.split("\\s+");
			String codon = fields[0];
			String aminoAbbrev = fields[1];
			codonTranslator.put(codon, aminoAbbrev);
		}
		
		StdIn.fromFile("data/SARSCoV2-S-gene-CA.txt");
		String protein = StdIn.readLine();
		int count = 0;
		for(int i = 0; i<protein.length(); i+=3) {
			String var = protein.substring(i,i+3);
			StdOut.println(codonTranslator.get(var));
			count ++;
		}
		StdOut.println(count);
		
	}

}
