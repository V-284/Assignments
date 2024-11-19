package Collections;
import java.util.HashMap;

class frequency{

    
    void f (String a){
        
        HashMap<Character,Integer>hm=new HashMap();
        
        for(int i=0;i<a.length();i++){
           // if(hm.containsKey(a.charAt(i)))
            hm.put(a.charAt(i),hm.getOrDefault(a.charAt(i),0)+1);
           // System.out.println(hm.toString()+"oo");
        }
          //  else
            //hm.put(a.charAt(i),1);
            System.out.println("final "+hm.toString());
            

        
    }
}
