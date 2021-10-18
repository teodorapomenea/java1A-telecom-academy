public class ExPolimorfism{
    public static void main(String[] args){
        Reptila r1 = new Reptila();
        Crocodil c1 = new Crocodil();
        
        Reptila a = new Crocodil();//polimorfism
        //Reptila=forma
        //a = referinta de tipul de date al clasei superioare si arata catre o instanta de Crocodil
        //Crocodil = instanta efectiva care se creeaza in memorie; ia forma de Reptila
        
        
      
       // a.lungimeCoada = 2;// POT SA ACCESEZ DOAR CARACTERISTICILE CARE EXISTA SI IN FORMA
        
       System.out.println(a.temperaturaCorp);// se ia valoarea din forma(Reptila) pentru atribute (si hiding fields)
       a.spuneDenumire(); // se apeleaza suprascrierea din instanta efectiva(Crocodil) 
                         //-> in cazul metodelor -> Crocodil
       
       System.out.println(a.greutate);
    
    }

}