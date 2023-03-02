
package projects;

public class Umusaruro {
   
   private int id;
   private String umuhinzi;
   private int quantity;
   private String date;

   public Umusaruro(int id, String umuhinzi, int quantity, String date) {
      this.id = id;
      this.umuhinzi = umuhinzi;
      this.quantity = quantity;
      this.date = date;
   }

public int getId(){
return id;}
public String getUmuhinzi(){
return umuhinzi;
}

   public long getQuantity() {
      return quantity;
   }

   public String getDate() {
      return date;
   }
   public String toString(){
   return "Igihingwa : "+id+"Umuhinzi : "+umuhinzi+" Umusaruro Mbumbe : "+quantity+" Italiki : "+date;}


    String setDate(String date) {
        return date;
    }

    void setType(String umuhinzi) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    int setQuantity(int quantity) {
        return quantity;
    }

    String getIgihingwa() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}