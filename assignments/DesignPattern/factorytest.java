package DesignPattern;


class factorytest{
    void f(String a){
        
       factory x=new factory();
     x.f(a).toned();
       
        
    }
}

class factory{
    milk milk;
    
    
    milk f (String a){
        
        if(a.equals("cow"))
        milk= new cow();
        else if(a.equals("buffalo"))
        milk=new buffalo();
    
    return milk;}
    
}



interface milk{
    
    void toned();
    void fullcream();
}

class cow implements milk{
    
  public  void toned(){
        System.out.println("HERE IS COW'S TONED MILK");
        }
        
   public void fullcream(){
           System.out.println("HERE IS COW'S FULLCREAM MILK"); 
    
}
}
class buffalo implements milk{
    
  public  void toned(){
        System.out.println("HERE IS BUFFALO'S TONED MILK");
        }
        
   public void fullcream(){
           System.out.println("HERE IS BUFFALO'S FULLCREAM MILK"); 
    
}
}