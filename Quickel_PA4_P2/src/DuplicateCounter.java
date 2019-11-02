import java.util.ArrayList;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class DuplicateCounter {

	public ArrayList<String> count(ArrayList<String> dataFile) throws IOException {
		
			String wordcount;
			
			ArrayList<String> uniqueWords = new ArrayList<String>();
			
			for(int i = 0; i < dataFile.size(); i++) {
				int wordCounter = 1;
	            for(int j = i + 1; j < dataFile.size(); j++) {
	                if(dataFile.get(i).equals(dataFile.get(j))){
	                	dataFile.remove(j);
	                    j--;
	                    wordCounter++;
	                }
	                
	            }
	            wordcount = dataFile.get(i).concat(" " + String.valueOf(wordCounter));
	            uniqueWords.add(wordcount);
	            
	            
	        }
			
			
			
			
	         return uniqueWords;
	         
	       
	      

	}
	
	
	public ArrayList<String> write (ArrayList<String> outputFile) throws IOException {
		
		FileOutputStream fileByteStream = null; // File output stream
	    PrintWriter outFS = null;
	    
	    fileByteStream = new FileOutputStream("unique_word_counts.txt");
	    outFS = new PrintWriter(fileByteStream);
	    
	    for(int i = 0; i < outputFile.size(); i++) {
	    	outFS.println(outputFile.get(i));
	    }
	    outFS.flush();
	    
	    
	    fileByteStream.close();
	      
	      
		return outputFile;
		
	}
		

}
