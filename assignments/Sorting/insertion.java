package Sorting;
import java.util.*;
class insertion{
    
    void f (int a[]){
        
        
        int j,temp;
        for(int i=1;i<a.length;i++){
            j=i-1;
            temp=a[i];
            if(a[i]<a[j]){
                
                while(j!=-1 && temp<a[j]){
                    a[j+1]=a[j];
                    j--;
                }
                a[j+1]=temp;
                
            
            }
            
        }
        System.out.println(Arrays.toString(a));
    }
}
