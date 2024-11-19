package LogicalPrograms;
import java.util.*;

class random{

    
    void f (int n){
        
        Random x=new Random();
        int count=0;
        while(true){   
           int y= x.nextInt(100);
           System.out.println(y);
           if(y==n)break;
        count++;
    }        System.out.println("fina+"+ count);
        
    }
}
