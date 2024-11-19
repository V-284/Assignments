import java.util.*;

class dpp2{
   
        void f(){
         int a;
    int b;
        Scanner sc= new Scanner(System.in);
        
        
        
        try{
        System.out.println("Enter Dividend");    
        a=sc.nextInt();
        System.out.println("Enter Divisor");
         b=sc.nextInt();}
        catch(InputMismatchException e){
     System.out.println("Enter Integer Only");
     return;
    }       
    
        try{
            
           if(b==0)
           throw new ArithmeticException();
            System.out.println((float)a/b);
            
        }
        catch(ArithmeticException e){
            System.out.println("You Cannnot Divide "+ a+" number by 0");
        }
    }
}