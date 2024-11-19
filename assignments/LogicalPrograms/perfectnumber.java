package LogicalPrograms;

class perfectnumber{
    
    void f (int a){
        
        int sum=0;
        for(int i=1;i<=(a/2);i++)
            if(a%i==0)
            sum=sum+i;
        
        if(sum==a)
        System.out.println("yes");
        else
        System.out.println("no");
    }
    }
