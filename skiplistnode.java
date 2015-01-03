public class skiplistnode {
     
    //<type extends Comparable<? super type>> implements Comparable <skiplistnode<type>>
    public static String minusIn = "--"; // negative infinity
    public static String positIn = "++"; //positive infinity
     
    public String word; //word to be inserted
    //type
    //Comparable
    public Integer freq; // frequency of word
     
    public skiplistnode up;//links upward
    public skiplistnode down; //links downward
    public skiplistnode left; //links left
    public skiplistnode right; //links right
     
    //code from old doubly linked list lab
    //skip list implemented similar to a key-value map
    //which was suggested in Prof. Koomen's instructions
     
    public skiplistnode(String word2, Integer value){
        word = word2;
        freq = value; 
        right=null;
        up=null;
        down=null;
        left=null;
    }
     
    public Integer findfreq(){
        return freq;
    }
     
    public String getword()
    {
        return word;
    }
     
    public String toString(){
        return ""+word+"|"+freq;
    }
     
    public interface Comparator <dinosaurs>{
            int compare (dinosaurs lhs, dinosaurs rhs);
    }       
}
