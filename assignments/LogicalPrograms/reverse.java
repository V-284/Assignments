package LogicalPrograms;

class reverse{

    void f (int r){
        
        int rev=0;
        while(r!=0){
            int x=r%10;
            rev=rev*10+x;
            r=r/10;
        }
        System.out.println(rev);
    }
}
