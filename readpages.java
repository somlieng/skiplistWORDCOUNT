import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;


public class readpages {
	
	readurl read;
	double totaltime;
	public skiplist global = new skiplist();
	String [] names;
	int totalwordcount=0;
	int bookamount=0;
	int index=0;

	/******************************* Read multiple URLs *************************************/
	
	public void pages (String pages) throws IOException{
        
        URL url = new URL (pages);
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        String address;
        skiplist book = new skiplist();
        skiplist[] collections = new skiplist[100];
        names = new String[100];
        int colnum=0;
        
        while((address = reader.readLine()) !=null){
        	
        	bookamount++;
            System.out.println("Reading And Processing Please Wait");
            read = new readurl();
            book = read.read(address); //make individual skip list
            names[colnum]=address;
            collections[colnum]=book; // add into array of skip lists
            colnum++;
            
            combine(global,book); //combine into joint list
            
            totalwordcount+=read.total();
            
        }
         
        reader.close();
         
        for(int i = 0;i<bookamount;i++){
        	findmax(global,collections[i]);
        }
        
         int uniqure = global.size();
         
        // System.out.println();
         System.out.println("Total Words: "+totalwordcount);
         System.out.println("Total number of Distinct Words: "+uniqure);
         
    }
	
	
	/******************************* Read URL for Book, Produce Joint SkipList*************************************/
	
	public void combine(skiplist global, skiplist book){
		
		skiplistnode addthis = book.bottom();
		
		while(addthis.right.word!=addthis.positIn)
		{
			global.insert(addthis.word, addthis.freq);
			addthis = addthis.right;
		}
	}

	/******************************* Find Max Frequency of Unique Word per File *************************************/
    
    public void findmax(skiplist global, skiplist book){
		
		skiplistnode addthis = book.bottom();
		skiplistnode maxfreq = new skiplistnode("",0);
		
		while(addthis.right.word!=addthis.positIn)
		{
			if(addthis.freq>maxfreq.freq && global.find(addthis.word).freq==book.find(addthis.word).freq){
				maxfreq=addthis;
				addthis = addthis.right;
			}else{
				addthis = addthis.right;
			}
		}
		
		if(maxfreq.freq==0){
			System.out.format("%20s","NONE");
			System.out.format("%8d",0);
			System.out.format(" %2s",names[index]);
		}
		System.out.format("%20s",maxfreq.word);
		System.out.format("%8d",maxfreq.freq);
		System.out.format(" %2s",names[index]);
		index++;
		System.out.println("\n");
	}
	
}
