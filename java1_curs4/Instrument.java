package java1_curs4;

public interface Instrument{
    //int x;
    int x=10;
    // public static final int x = 10; => static e implicit, nu mai trebuie pus
    public void play(); // abstract este pus automat, este redundant sa il pun in interfata
    //void play() {}
    default void mConcreta() {} //J8
    static void mStatica() {}//J8
    private void mPrivata() {}//J9
    
    
}
    
