import java.util.*;

class dpp1{
    
    void f(){
        
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter Divisor");
        int a=sc.nextInt();
        
        try{
           if(a==0)
           throw new ArithmeticException();
            System.out.println(100f/a);
            
        }
        catch(ArithmeticException e){
            System.out.println("You Cannnot Divide 100 number by 0");
        }
    }
}