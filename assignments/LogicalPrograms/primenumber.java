package LogicalPrograms;

class primenumber{

    void f(int a){
        
        int i;
        for( i=2;i<a;i++){
            if(a%i==0)break;
        }
        if(i==a)
        System.out.println("prime number");
        else
        System.out.println("Not Prime Number");
    }
    
}
