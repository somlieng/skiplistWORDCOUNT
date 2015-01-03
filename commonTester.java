
import java.io.IOException;
 
 
public class commonTester {
     
     
    public static void main (String [] args) throws IOException{
    	
    	 double start = System.currentTimeMillis();
    	readpages pages = new readpages();
    	
    	pages.pages("http://www.csug.rochester.edu/172/5_skiplists/final-flist.txt");
    	
    	 double end = System.currentTimeMillis();
         double runtime = (end-start)/1000;//in seconds
         
         System.out.println("Total Runtime is: "+ runtime+" seconds");
        
         //http://www.cs.rochester.edu/~koomen/172/projects/5_skiplists/test-flist.txt
    	//http://www.csug.rochester.edu/172/5_skiplists/final-flist.txt
    }
     
}