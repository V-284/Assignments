package LogicalPrograms;


class rectangletest{
    
    void f(){
    rectangle x=new rectangle(5,6);
    x.area();
    x.perimeter();
}    
}
class rectangle{

    
    int length;
    int width;
    
    rectangle(int x,int y){
        length =x;
       width=y;
        
    }
    
    void perimeter(){
        System.out.println(2*(length+width));
    }
    void area(){
        System.out.println(length*width);
    }
}
