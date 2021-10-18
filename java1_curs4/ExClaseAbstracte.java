package java1_curs4;

public class ExClaseAbstracte{
    public static void main(String [] args) {
       // Forma f = new Forma(); => nu pot sa instantiez direct
        Forma f1 = new Dreptunghi();
        System.out.println(f1.getArie());
        
        Forma [] forme = new Forma[5];
        forme[0] = new  Dreptunghi();
        forme[1] = new Patrat();
        forme[2] = new String();

    }

}