package DataStructures;



class LinkedListtest{
    
    
    
    void f (){
        
        LinkedList x=new LinkedList();
        x.node=56;
        x.next=new LinkedList();
        x.next.node=60;
        x.next.next=new LinkedList();
        x.next.next.node=70;
        x.next.next.next=new LinkedList();
    }
    
}
class LinkedList{
    
    int node;
    LinkedList next;
    
}