public class ExEnum{
     public static void main(String [] args) {
         Coffee c1 = Coffee.BIG;
         switch(c1) {
            case BIG: 
            case EXTRA_LARGE:
                                System.out.println("Client iubitor de cafea!");
                                break;
            case MEDIUM: System.out.println("Bautor ocazional!");
                        break;
            case SMALL:  System.out.println("Prima degustare!");
        }
        for(Coffee c : Coffee.values()) {
             System.out.println(c+ " " + c.ordinal()+ " " + c.name());
        
        }
        c1.afisareQty();
    }
    
}