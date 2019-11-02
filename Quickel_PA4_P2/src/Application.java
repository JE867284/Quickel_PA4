import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;

public class Application {

	public static void main(String[] args) throws IOException{
		
		DuplicateCounter count = new DuplicateCounter();
		DuplicateCounter write = new DuplicateCounter();
		FileInputStream fileByteStream = null; // File input stream
	    Scanner inFS = null;                   // Scanner object
	    String word;
	    ArrayList<String> textFile = new ArrayList<String>();
	    
	      
	    // Try to open file
	    
	    fileByteStream = new FileInputStream("problem2.txt");
	    inFS = new Scanner(fileByteStream);
	    
	    while (inFS.hasNext()) {
	    word = inFS.next();
	    textFile.add(word);
	    
	    }
	    
	    write.write(count.count(textFile));
	    fileByteStream.close(); 

	}

}
