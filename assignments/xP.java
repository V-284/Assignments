class xP

{
    
    void f(){
        
        try{
            System.out.println(3/0);
        }
        catch(ArithmeticException e){
            
            System.out.println("off");
        }
        System.out.println("hello");
    }
}