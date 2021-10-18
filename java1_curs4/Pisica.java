 

//encapsulare
public class Pisica{
    private String  nume;
    private int varsta;
    private boolean alive;
    
    public String getNume() { 
       return this.nume; 
    }
    public void setNume(String nume){
        this.nume = nume;    
    }
    public int getVarsta(){
        return this.varsta;   
    }
     public void setVarsta(int Varsta){
        if(varsta>0)
        this.varsta = varsta;    
    }
    public boolean isAlive(){
         return this.alive;   
    }
    public void setAlive(boolean alive){
         this.alive= alive;   
    }
    
}