public class C1{
    public void m(){
     class C2{
      // clasa locala context non-static 
      //daca era in metoda statica atunci era in context static
      // fiind local -> nu am voie sa o pun in mod de acces
      public void metodaLuiC(){
        System.out.println("ok");
        
      }
     }
      C2 c2 = new C2();
      c2.metodaLuiC();
      //doar aici pot sa fac asta
    }

}
