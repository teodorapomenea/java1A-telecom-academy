package curs5;

public class ExLambda
{
    public static void main(String [] args){
        Predicat p1 = (x) -> x>3;
        Predicat p2 = x -> x>6;// pot sa omit parantezele pt un singur parametru fara tip
        Predicat p3 = (int x) -> x>7;
        Predicat p4 = x -> {return x>4; };
        Predicat p5 = x -> {boolean b=true;            
                            return x>=6 && x<=10; 
                           };
        Predicat p6 = (x) -> false;
        
        Functie f1 = (x,y) -> 45;
        Functie f2 = (int x,int y) -> x+y;
        Functie f3 = (x,y) -> {x=x+3; y=y+6; return x*y;};
        
        metoda((x,y)-> x+y,30,10);
        metoda((x,y)->x*y,30,10);
        metoda(f1,30,10);
        metoda(f1=(x,y)->x/y,30,10);
    }
    
    
    public static void metoda(Functie f, int a, int b) {
        System.out.println(f.operatie(a,b)); // merge pt orice interfata functionala data ca param
        
    } 
}
