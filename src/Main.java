import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main{
	
	public Main(){
		
	}
	
	public static void main(String[] args) throws FileNotFoundException{
		
		Scanner sc = new Scanner(new File("lisp.txt"));
		
		int charCount = 0;
		while(sc.hasNextLine()){
			charCount += sc.nextLine().length();
		} sc.close();
		
		sc = new Scanner(new File("lisp.txt"));
		int tokenCount = 0;
		while(sc.hasNextLine()){
			tokenCount += sc.nextLine().split(" ").length;
		} sc.close();
		
		System.out.println("Total Characters: " + charCount);
		System.out.println("Total String Tokens: " + tokenCount);
		
	}
	
}