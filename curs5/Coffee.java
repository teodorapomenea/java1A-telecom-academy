public enum Coffee{
   SMALL,MEDIUM(235),BIG,EXTRA_LARGE;
   
   private int qty;
   
    Coffee() {
    
    }
    
    Coffee(int qty){
        this.qty = qty;
    }
   
    public void afisareQty() {
    System.out.println(qty);
    }
}
