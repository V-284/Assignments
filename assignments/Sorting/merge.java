package Sorting;
import java.util.*;
class merge{
    
    void f (int a[]){
        
        
        int l=0,h=a.length-1;
        
        mergesort(a,l,h);
        System.out.println(Arrays.toString(a));
    }
        
        
    
    void mergesort(int a[],int low,int high)    {
        
        
        int mid;
        if(low<high){
         mid=low+(high-low)/2;    
            
            mergesort(a,low,mid);
            mergesort(a,mid+1,high);
            merge(a,low,mid,high);
            
        }
        
    }
    void merge(int a[],int low,int mid,int high){
        int i=low,j=mid+1,k=high;
        int temp[]=new int[a.length];int c=low;
        while(i<=mid && j<=high){
            if(a[i]<=a[j])
                temp[c++]=a[i++];
            else
            temp[c++]=a[j++];
            }
            while(i<=mid)
            temp[c++]=a[i++];
            while(j<=high)
            temp[c++]=a[j++]; 
            for(i=low;i<=high;i++)
            a[i]=temp[i];
        }
        
        
        
    
    
    
}
