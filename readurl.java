import java.io.*;
import java.net.URL;
 
public class readurl {
     
    public int totalwords; // total words
    public skiplist list = new skiplist();

    /******************************* Read URL for Book, Produce Individual Skip List*************************************/
 
    public skiplist read(String address) throws IOException{
        //String
            
            URL url = new URL (address);
            BufferedReader read = new BufferedReader(new InputStreamReader(url.openStream()));
            String sent;
             
            while((sent = read.readLine()) !=null){
                String words[]=sent.split(" ");
                for(int i = 0;i<words.length;i++){
                    if(words[i].length()>0){
                        String word;
                        word = words[i].toLowerCase().replaceAll("[^a-zA-Z ]", "");
                        list.insert(word, 1);
                        totalwords++;
                    }
                }
            }
             
            read.close();
            
            
           //int height = list.height;
          //System.out.println("The height of the skip list is: "+height);
            
//            int total = total();
//            int uniqure = list.size();
//          
//            System.out.println("Total Words in this book : "+total);
//            System.out.println("Number of Distinct Words in this book: "+uniqure);
         
            System.out.println();
            
            return list;
            
    }
     
    /******************************* Print SkipList for Book *************************************/
     
    public void printbook(){
        list.printskiplist();
    }
     
    /******************************* Get Total Words *************************************/
     
    public int total(){
        return totalwords;
    }
     
	    
     
}