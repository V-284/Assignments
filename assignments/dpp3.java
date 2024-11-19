import java.util.*;

class dpp3{
    
    void f (){
        
        int a;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter Age");
        try{
             a=sc.nextInt();
            if(a<18)
            throw new InvalidAgeException();
        
    }
    catch(InvalidAgeException e){
    System.out.println("TOO YOUNG");return;}
    
    System.out.println(a);
}

}




class InvalidAgeException extends Exception{
    
    InvalidAgeException(String msg){
        super(msg);
    }
    
    InvalidAgeException(){
        super("Invalid AGE");
    }
}