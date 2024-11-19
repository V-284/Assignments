import java.util.*;

class dpp7{
    
    void f(){
        Scanner sc=new Scanner(System.in);
        
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        
        System.out.println(a>b?(a>c?a:c):(b>c)?b:c);
    
    }
}