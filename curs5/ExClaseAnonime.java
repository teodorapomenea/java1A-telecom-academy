
public class ExClaseAnonime
{
   public static void main (String [] args){
    Angajat a1 = new Angajat(2500,2,"Mihai");
    Angajat a2 = new Angajat(2500,8,"Adrian");
    Angajat a3 = new Angajat(2500,1,"Ana"){
      @Override
      public double calculeazaSalariu() {
           return 5000; 
      }
     };
    System.out.println(a1.calculeazaSalariu());
    System.out.println(a2.calculeazaSalariu());
    System.out.println(a3.calculeazaSalariu());
    
    Instrument i = new Instrument(){
        @Override
        public void play(){
        
        }
    
    };
     Instrument i2 = () -> {};
    }
}
