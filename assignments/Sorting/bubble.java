package Sorting;
import java.util.*;

class bubble{
    
    void f (int a[]){
        
        int temp;
        for(int i=a.length-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;}
                }
                
            }
            System.out.println(Arrays.toString(a));
        
    }
}
