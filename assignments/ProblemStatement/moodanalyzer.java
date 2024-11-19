package ProblemStatement;
import java.util.*;

class moodanalyzer{

    
    
    void f (String a){
        
        HashSet<String> hs=new HashSet();
        a=a+" ";
        
        int j=0;
        for(int i=0;i<a.length();i++){
            
            if(a.charAt(i)==' '){
            hs.add(a.substring(j,i));
            j=i+1;
        }
    }
        if(hs.contains("sad"))
        System.out.println("SAD");
        else if(hs.contains("happy"))
        System.out.println("HAPPY");
        else
        System.out.println("BE HAPPY");
            
        }
    }

