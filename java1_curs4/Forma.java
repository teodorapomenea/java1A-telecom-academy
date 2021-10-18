package java1_curs4;

public abstract class Forma{
    String nume;
    int l=4;
    public  void AfisareNume(){
        System.out.println(nume); //metoda concreta
    }
    public abstract double getArie();
}