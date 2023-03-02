
package projects;

/**
 *
 * @author AS
 */
public class Umuhinzi {

   private String name;
   private String id;
   private String phoneNumber;
   private String location;

   public Umuhinzi(String name, String id, String location, String phoneNumber) {
      this.name = name;
      this.id = id;
      this.location = location;
      this.phoneNumber= phoneNumber;
   }

   public String getName() {
      return name;
   }

   public String getId() {
      return id;
   }

   public String getLocation() {
      return location;
   }
   public String toString(){
   return "Umuhinzi : " +name+" Id : "+id+" Location : "+location;
   }

    String setName(String name) {
        return name;
    }

    String setPhoneNumber(String phoneNumber) {
        return phoneNumber;
    }
   
}



