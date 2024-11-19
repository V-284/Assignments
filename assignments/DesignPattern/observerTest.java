package DesignPattern;
import java.util.*;

class observerTest{
    
    void f (){
        publisher x=new publisher();
            x.add(new observer1());
            x.add(new observer2());
            x.add(new observer3());
            x.broadcast();
        }
    }
    



interface notified{
    void notified(String a);
}

class observer1 implements notified{
    
  public  void notified(String a){
        System.out.println("Hey Observer 1 + " +a);
    }
}

class observer2 implements notified{
    
   public void notified(String a){
        System.out.println("Hey Observer 2 + " +a);
    }
}

class observer3 implements notified{
    
    
   public void notified(String a){
        System.out.println("Hey Observer 3+ " +a);
    }
}
class observer4 implements notified{
    
    public void notified(String a){
        System.out.println("Hey Observer 1 + " +a);
    }
}

class publisher{

    List<notified> list=new ArrayList();

    void add(notified x){
        list.add(x);
    }
    void delete(notified x){
        list.remove(x);
    }
    
    void broadcast(){
        for(notified n: list)
    n.notified("INDIA WON THE MATCH");
    }
}
           


