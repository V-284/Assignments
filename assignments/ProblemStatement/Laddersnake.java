package ProblemStatement;
import java.util.Scanner;
import java.util.*;

class Laddersnake{
 
    
    
    
    void play(){
    Scanner sc=new Scanner(System.in);
    Random x=new Random();
    
    HashMap<Integer,Integer>hm=new HashMap();
    hm.put(5,20);
    hm.put(12,22);
    hm.put(9,70);
    hm.put(26,10);
    hm.put(97,30);
    hm.put(93,69);
    hm.put(36,80);
    hm.put(25,44);
    hm.put(78,29);
    int score=0;
    System.out.println("Welcome To Snake Game");
    System.out.println("You are At 0");
    int a;
    while(score!=100){
    System.out.println("Type Roll to Roll A Dice");
    sc.nextLine();
    a=x.nextInt(1,6);
    System.out.println("Hey You Got "+ a);
    if(a>(100-score))
    {System.out.println("Awww, Try Again");
        continue;}    
    score=score+a;
    if(hm.containsKey(score)){
        if(score>hm.get(score)){
        System.out.println("OOPs, Bitten By Snake!!!!!!!!");
        score=hm.get(score);}
        else{
        System.out.println("WOW, Got a Ladder!!!!!!");
        score=hm.get(score);
    }
    }
    System.out.println(" Now you are at "+score);
        
    
}
System.out.println("You WON THE MATCH");

}}