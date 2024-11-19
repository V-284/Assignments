package Sorting;
import java.util.*;

class selection{
    
    
    void f (int a[]){
        
        
        int max;int temp;
        
        for(int i=0;i<a.length;i++){
            max=i;
            for(int j=i+1;j<a.length-1;j++){
                
                if(a[j]<a[max])
                max=j;
                
            }
            temp=a[max];
            a[max]=a[i];
            a[i]=temp;
        }
        System.out.println(Arrays.toString(a));
    }
}
