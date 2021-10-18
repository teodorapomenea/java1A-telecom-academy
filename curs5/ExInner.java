public class ExInner{
    public static void main (String...args) {
        A1.A3 a3 = new A1.A3();
        //A1.A2 a2 = new A1.A2();
        //A2 are ca scop sa serveasca unei instante a clasei A1
        A1 a1 = new A1();
        A1.A2 a2 = a1.new A2(); // instanta a2 a clasei inner non-statice apartine 
                                //instantei a1 a clasei outer
        System.out.println(a1.x);
        a2.m1();
        System.out.println(a1.x);
        // se comporta a2, dar se modifica a1
    }
}