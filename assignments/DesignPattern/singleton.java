package DesignPattern;

class singleton{
    
    
    static singleton object;
    
    
    private singleton(){}
    
    
    static singleton create(){
        if(object==null)
        object= new singleton();
        return object;
        
        
    }
    void f (){
    System.out.println(object);}
}
