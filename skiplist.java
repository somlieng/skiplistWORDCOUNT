
import java.util.*;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
 
/*I used (this web site) to help me to understand how a skip list work. Thus there will be some
 * similarities between my code to the one on this web site. I only used this web site as a
 * reference in the construction of my code
 * 
 * The skip list uses a map interface, which was suggested in Professor Koomen's instructions*/
 
public class skiplist {
 
    //<type extends Comparable<? super type>>
    public skiplistnode head; //first element in list
    public skiplistnode tail; //last element in list 
     
    public int total; // # of total unique words
    public int totalwords = 0;
    public int height; // how tall is that particular element is
     
    public Random cointoss; //simulates 50/50 chance of coin toss
                            //used to determine if a new level 
                            //will be created or not
     
    /******************************* Get Total Words *************************************/
     
    public int total(){
        return totalwords;
    }
     
    
    /******************************* Get Height *************************************/
    
    public int height(){
        return height;
    }
    /******************** Create an Empty Skip List in Constructor ***************************/
     
    public skiplist (){
         
        total = 0; //no elements in element
        height = 0; //no height 
        cointoss = new Random(); //Initialize random variable
         
        skiplistnode positive, negative;
         
        positive = new skiplistnode (skiplistnode.positIn,null); //create positive infinity, null keys for map
        negative = new skiplistnode (skiplistnode.minusIn,null); // create negative infinity, null keys for map
         
        // initialize head & tail
         
                head = negative;
                tail = positive;
         
        // now we will link the negative and positive infinity objects together
         
        negative.right = positive;
        positive.left = negative;
         
     
    }
     
    //Comparable
     
    /********************************* Create Find Method ***********************************/
     
    public skiplistnode find (String chocolate){
             
            skiplistnode start = head; //create new node that starts as the head of list
             
            while(true){
            while( start.right.word.compareTo(chocolate)<=0 && start.right.word !=skiplistnode.positIn){
                start = start.right;
                //go to the most right possible without becoming positive infinity and without the value 
                //of link to be more than what we are looking for
            } 
                if(start.down!=null){ //go down as much as possible, if null means that you are at the bottom
                    start = start.down;
                }
                else{
                    break;
                }
            }
            return start; //return the word, if word, if not the word right before it alphabetically
        }
     
    /******************************* Random Number Generator *************************************/
         
    public int randomize(int min, int max) { //returns either 1 or 0
     
    int random = cointoss.nextInt((max - min) + 1) + min;
     
    return random;
    }
     
    /******************************* Create Insert Method *************************************/
     
    public <type> Integer insert(String word, Integer key){
     
        skiplistnode newword,findword;
         
        findword = find(word);
         
        int num; //this number is either 1 or 0 that will decide whether or not it will 
                    //increase the height of the element in the link
         
        int currentheight = 0;//current height of a column
         
        if(word.equals(findword.getword()))
        {
            //if word is already in the list, increase the frequency of word
            Integer prevfreq = findword.freq;
            findword.freq=findword.freq+key;
            return(prevfreq);
        }
         
            newword = new skiplistnode(word, key);
             
            newword.left = findword;//makes the new data the tail
            newword.right = findword.right;
            findword.right.left = newword;
            findword.right = newword; //add new data at the last spot
         
        // make randomization to make the height of the element
         
        while((num = randomize(0,1))!=0){
             
            if(currentheight >= height) //make sure we don't create beyond height of all layers
            {
                newLayer();
            }
             
            while (findword.up==null)
            { //go left until find an element with an UP function
                findword=findword.left;
            }
             
            findword=findword.up;
             
        skiplistnode newlayerelement = new skiplistnode(word,null); //add new element to go on top of old column
         
        newlayerelement.left = findword;//makes the new data the tail
        newlayerelement.right = findword.right;
        newlayerelement.down = newword;
         
        findword.right.left = newlayerelement;
        findword.right = newlayerelement; //add new data at the last spot
         
        newword.up=newlayerelement;
         
        newword=newlayerelement;
         
        currentheight++;
             
        }
         
        total++;
        return (null);
     
    }
     
     
    /******************************* Returns total number of unique elements  *************************************/
     
    public int size(){
        return total;
    }
     
    /******************************* Returns if element is found in list  *************************************/
     
    public <type>boolean lookup(Object candy) {
        skiplistnode findThis = head;
         
        while(findThis !=null){
            if(findThis.word == candy){
            return true;
            }
            findThis = findThis.right;
        }
         
        return false;
    }
    
    /********************************* Head go to Very Bottom and Go to the Right ***********************************/
    
    public skiplistnode bottom (){
        
        skiplistnode start = head; //create new node that starts as the head of list
        
            while( start.down!=null)
            {
            	start=start.down;
            }
            
            start = start.right;
       
        return start;
    }
     
    /*********************************************** Delete Method  ************************************************/
     
    public <type>void delete(Object candy) {
        //deletes elements from linked lists
                skiplistnode deleteThis = head ;
                 
                if (lookup(candy)==true){
                    while(deleteThis!=null){
                        if(deleteThis.word == candy){
                            head = deleteThis.right;
                            total--;
                            break;
                        }
                        else if(deleteThis.right.word == candy){
                            deleteThis.right = deleteThis.right.right;
                            total--;
                            break;
                        }
                        deleteThis = deleteThis.right;
                    }
                     
                }   
                 
                else{
                    System.out.println("Can not delete "+candy+" because it is not found in the list");
                }
    }
     
    /******************************* Check if Layer is Null  *************************************/
     
    public boolean isEmpty() {
        //finds if list is empty
        if(total == 0){
            return true;
        }
        else return false;
    }
             
    /******************************* Create New Layer *************************************/
     
    public void newLayer()
    {
        height++;
         
        skiplistnode positive = new skiplistnode (skiplistnode.positIn,null); //create positive infinity
        skiplistnode negative = new skiplistnode (skiplistnode.minusIn,null); // create negative infinity   
         
        // now we will link the negative and positive infinity objects together
         
                negative.right = positive;
                positive.left = negative;
                 
                negative.down=head;
                positive.down=tail;
                 
                // initialize head & tail
                 
                head.up = negative;
                tail.up = positive;
                 
                head = negative;
                tail = positive;
         
         
    }
     
    /*******************************  Print Skip List  *************************************/
     
    //starting from the bottom now we're here
    public String columns(skiplistnode bottom){
        String printThis ="";
         
        while(bottom !=null){
            printThis += bottom.word+" ";
            bottom = bottom.up;
        }
         
        return printThis;
    }
     
     
    public void printskiplist(){
        skiplistnode here = head;
        String printthis = "";
         
        while(here.down!=null){
            here=here.down;
        }
        while(here!=null){
            printthis = columns(here);
            System.out.println(printthis);
            here=here.right;
        }
    }
     
   
}