package Sorting;
import java.util.*;
class quick{
    
    void f (int a[]){
        
        quicksort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
}

void quicksort(int a[],int low,int high){
    
    int p;
    if(low<high){
        
    p=partition(a,low,high);
    
    quicksort(a,low,p-1);
    quicksort(a,p+1,high);
    
    }
}
int partition(int a[],int low,int high){
    
    int k=low;int temp;
    for(int i=low+1;i<=high;i++){
        
        if(a[i]<a[low]){
            temp=a[k+1];
            a[k+1]=a[i];
            a[i]=temp;
            k=k+1;
            ;
            
        }
    }
    temp=a[low];
    a[low]=a[k];
    a[k]=temp;
    
    return k;
    
    
    
    
}
}
