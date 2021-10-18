public class Cilindru extends Cerc{
    double h;
    @Override
    public double calcArie() {
     // 2*Aria cercului + L*h
     return 2*super.calcArie() + super.calcLungime() * this.h;
    }
}

    
