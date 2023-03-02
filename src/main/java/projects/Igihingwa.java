/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projects;

public class Igihingwa {


    
    String name;
    String id;
    long quantity;
    String location;

   public Igihingwa(String name, String id, long quantity, String location) {
      this.name = name;
      this.id = id;
      this.quantity = quantity;
      this.location = location;
   }

   public String getName() {
      return name;
   }

   public String getId() {
      return id;
   }

   public long getQuantity() {
      return quantity;
   }

   public String getLocation() {
      return location;
   }
    public String toString() {
        return "Igihingwa: " + name + ", Id: " + id + ", Ingano: " + quantity+", Aho giherereye: "+location;
    }

    String setName(String name) {
        return name;
    }

    int setQuantity(int quantity) {
        return quantity;
    }
}
