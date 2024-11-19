package Generics;
import java.util.*;

class maximum{
    
    void f(int a,int b,int c){
        
        
        ArrayList<Integer> al=new ArrayList();
        al.add(a);
        al.add(b);
        al.add(c);
        
        al.sort((l,m)->m-l);
        System.out.println(al.get(0));
        
    }
}