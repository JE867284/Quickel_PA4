import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;

public class Application {

	public static void main(String[] args) throws IOException{
		
		DuplicateRemover remove = new DuplicateRemover();
		DuplicateRemover write = new DuplicateRemover();
		FileInputStream fileByteStream = null; 
	    Scanner inFS = null;                   
	    String word;
	    ArrayList<String> uniqueWords = new ArrayList<String>();
	      
	    
	    
	    fileByteStream = new FileInputStream("problem1.txt");
	    inFS = new Scanner(fileByteStream);
	    
	    while (inFS.hasNext()) {
	    word = inFS.next();
	    uniqueWords.add(word);
	    
	    }
	    
	    remove.remove(uniqueWords);
	    
	    write.write(uniqueWords);
	    
	    fileByteStream.close(); 

	}

}
