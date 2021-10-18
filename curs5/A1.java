public class A1{ //clasa top-level
    int x;
    private static int y;
    
    public class A2{
        //clasa A2 este o classa inner non-statica pt clasa A1
        //clasa A1 este clasa outer pt clasa A2
        //clasa A2 poate fi si ea outer daca are in int declarata alta clasa
        int x;
        int z;
        public void m1() {
            this.x = 5;
            A1.this.x = 10; // daca vreau sa accesez un atribut cu acelasi nume din outer 
                            // o sa folosesc sintaxa Outer.this.atribut
            
        }
    }
    
    public void acceseazaZonaDinA2(){
       // z=9;
       // am o instanta de A2 => pot sa accesez
    }
    
    
    public static class A3{
        //clasa A 3 este clasa inner statica pentru class A1
        //clasa A1 este clasa outer pt clasa A3
            public void m2() {
                y = 10;
                // x = 5; => x este non-static, deci nu il pot folosi in inner static
           
            }
    
    }
}