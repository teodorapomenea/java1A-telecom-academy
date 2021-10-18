public class Cerc extends Punct {
    double raza;//adaugare de atribut
    //int x;//ascundere de atribut
    String x;//ascundere de atribut
    
    public Cerc(){
        this(6.5);
    }
    
    public Cerc(double raza) {
        super(3,4);// prima instr. din constructor
        this.raza = raza;
        this.x = "cerc";
        super.x = 10;
        this.y= 5;
    }
    public double calcArie(){
        return 3.14*this.raza*this.raza;//adaugare comportament
    }
    public double calcLungime() {
        return 2*3.14*this.raza;
    }
    
}

    