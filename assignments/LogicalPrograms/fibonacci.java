package LogicalPrograms;

class fibonacci{

    

    
    void fibo(){
            int x=0,y=1,sum=0;
            System.out.println(x+"\n"+y);
    for(int i=1;i<=20;i++){
        sum=x+y;
        System.out.println(sum);
        x=y;
        y=sum;
        
    }
    
}}
