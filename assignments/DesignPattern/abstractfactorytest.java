package DesignPattern;


class abstractfactorytest{
    
    
    void f (String a,String b){
        
       factory x=new factory();
     x.givefactory(a).givematerial(b).sound();
    
    
    
       
       
       
    }
}
class factory{
    factoryoffactory x;
    factoryoffactory givefactory (String a){
        if(a.equals("tata"))
        x=new tatafactory();
        else if(a.equals("mahindra"))
        x=new mahindrafactory();
        else if(a.equals("hyundai"))
        x=new hyundaifactory();
        return x;
        
    }}
    
    class tatafactory implements factoryoffactory{
        audio j;
    public audio givematerial(String a){
        if(a.equals("altroz"))
        j=new altroz();
       
        else if(a.equals("nexon"))
        j=new altroz();
        return j;
    }
}
       class mahindrafactory implements factoryoffactory{ 
           
           audio s;
   public  audio givematerial(String a){   
        if(a.equals("scorpio"))
        s=new scorpio();
       
        if(a.equals("xuv"))
        s=new xuv();
        return s;}
    }
        
    class hyundaifactory implements factoryoffactory{
            audio b;
   public audio givematerial(String a){
          
      if(a.equals("verna"))
            b=new verna();
        if(a.equals("creta"))
            b=new creta();
            return b;
        }

    }
        
    
    




interface factoryoffactory{
    
   audio givematerial(String a);
}

/**
class tata implements factoryoffactory {
    
   public void carfactory(){}
}
class mahindra implements factoryoffactory{
    
   public void carfactory(){}
}

class hyundai implements factoryoffactory{
   public void carfactory(){}
}
**/

interface audio{
void sound();
}

interface jbl{
    void jblsound();}
    
interface sony{
    void sonysound();}
interface bose{
    void bosesound();}
class altroz implements audio{
    
    public void sound(){
        System.out.println("altroz car JBL SOUND");
    }
}
class nexon implements audio{
    
    public void sound(){
        System.out.println("nexon car JBL SOUND");
    }
}
class scorpio implements audio{
    public void sound(){
        System.out.println("scorpio car SONY SOUND");
    }
}
class xuv implements audio{
    public void sound(){
        System.out.println("xuv car SONY SOUND");
    }}
    
class verna implements audio{
public void sound(){
System.out.println("verna car BOSESOUND");    
}}
class creta implements audio{
    public void sound(){
System.out.println("creta car BOSESOUND");    
}}