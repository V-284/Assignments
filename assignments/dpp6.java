import java.util.*;

class dpp6{
    
    void f(){
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter Radius");
        float f=sc.nextFloat();
        
        System.out.println("Area= "+ (Math.PI*f*f));
        System.out.println("Circumference= "+ (Math.PI*2*f));
    }
}