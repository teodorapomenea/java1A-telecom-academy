package java1_curs4;

public class ExInstanceof {
    public static void main(String [] args) {
    Punct p1 = new Punct (0,1);
    Punct p2 = new Cerc();
    Punct p3 = new Cilindru();
    
    p2.x=2;
    p2.y=4;
    //p2.raza=3;
    //p2.calcArie();
    Cerc c1 = (Cerc)p2;
    c1.raza = 9;
    //Cerc c2= (Cerc)p1; => ClassCastException
    //String s= "EROARE";
    //Cerc c3 = (Cerc)s; => eroare de compilare
    //Cilindru c = (Cilindru) p2; => ClassCastException
    
    if(p2 instanceof Cilindru) {
        System.out.println("Este un cilindru");
    }
     if(p2 instanceof Cerc) {
        System.out.println("Este un cerc");
    }
     if((Cerc)null instanceof Punct) {
        System.out.println("fals");
    }
    }
}