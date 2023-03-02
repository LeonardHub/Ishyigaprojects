/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projects;

import java.util.ArrayList;
import java.util.Scanner;

public class GoonlineMuhinzi {

    public static void main(String[] args) {
        
        ArrayList<Igihingwa> Ibihingwa = new ArrayList<>();
        ArrayList<Umuhinzi> Abahinzi = new ArrayList<>();
        ArrayList<Umusaruro> Imisaruro = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.println("URAKAZA NEZA KURI SISITEME YA GOONLINEMUHINZI");
        System.out.println("==============================================");
        boolean running =true;
        while(running){
        System.out.println("Hitamo igikorwa ushaka gukora:");
        System.out.println("1. Reba amakuru ku Gihingwa");
        System.out.println("2. Andika Igihingwa Kindi");
        System.out.println("3. Hindura amakuru ku Gihingwa");
        System.out.println("4. Hanagura Igihingwa");
        System.out.println("5. Reba Umuhinzi");
        System.out.println("6. Andika Umuhinzi Wundi");
        System.out.println("7. Hindura amakuru ku muhinzi");
        System.out.println("8. Hanagura Umuhinzi");
        System.out.println("9. Reba Umusaruro");
        System.out.println("10. Andika Umusaruro");
        System.out.println("11. Hindura amakuru ku Musaruro");
        System.out.println("12. Hanagura Umusaruro");
        System.out.println("0. Sohokamo");
        System.out.println("==============================================");
        System.out.print("Andika Igikorwa: ");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    viewIbihingwa(Ibihingwa);
                    break;
                case 2:
                    addIgihingwa(Ibihingwa, scanner);
                    break;
                case 3:
                    updateIgihingwa(Ibihingwa,scanner);
                case 4:
                    removeIgihingwa(Ibihingwa, scanner);
                    break;
                case 5:
                    viewUmuhinzi(Abahinzi);
                case 6:
                    addUmuhinzi(Abahinzi,scanner);
                case 7:
                    updateUmuhinzi(Abahinzi,scanner);
                case 8:
                    removeUmuhinzi(Abahinzi,scanner);
                case 9:
                    viewUmusaruro(Imisaruro);
                case 10:
                    addUmusaruro(Imisaruro,scanner);
                case 11:
                //    updateUmusaruro(Imisaruro,scanner);
                case 12:
                    removeUmusaruro(Imisaruro,scanner);
                case 0:
                    System.out.println("Wasohotse...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wahisemo umubare utari wo. Hitamo umubare wa nyawo");
                    break;
            }
        }
    }
    public static void viewIbihingwa(ArrayList<Igihingwa> Ibihingwa) {
        if (Ibihingwa.isEmpty()) {//if itarimo ntabwo twamenya niba ntakintu kirimo
            System.out.println("Nta gihingwa kirimo");
        } else {
            for (Igihingwa igihingwa : Ibihingwa) {
                System.out.println(igihingwa);
            }
        }
    }
    public static void addIgihingwa(ArrayList<Igihingwa> Ibihingwa, Scanner scanner) {
        System.out.print("Andika izina ry'Igihingwa: ");
        String name = scanner.next();
        System.out.print("Andika Code iranga Igihingwa: ");
        String id= scanner.next();
        System.out.print("Andika Ingano mu biro (Kg): ");
        int quantity = scanner.nextInt();
        System.out.print("Shyiramo aho Giherereye:");
        String location = scanner.next(); 
        Igihingwa igihingwa = new Igihingwa(name,id,quantity,location);
        Ibihingwa.add(igihingwa);
        System.out.println("Igihingwa cyanditswe neza");
    }
    
    public static void removeIgihingwa(ArrayList<Igihingwa> Ibihingwa, Scanner scanner) {
        System.out.print("Andika Izina ry'Igihingwa: ");
        String name = scanner.next();
        for (int i = 0; i < Ibihingwa.size(); i++) {
            if (Ibihingwa.get(i).getName().equalsIgnoreCase(name)) {//if ni ngombwa mu kumenya niba izina rihura 
                Ibihingwa.remove(i);
                System.out.println("Igihingwa cyakuwemo neza");
                return;
            }
        }
        System.out.println("Icyo gihingwa ntikiboneka ");
    }
    public static void updateIgihingwa(ArrayList<Igihingwa> Ibihingwa, Scanner scanner){
    if (Ibihingwa.isEmpty()) {
        System.out.println("No Igihingwa found.");
        return;
    }

    System.out.print("Enter the id of the Igihingwa to update: ");
    String id = scanner.next();

    // Search for the Igihingwa with the given id
    Igihingwa igihingwaToUpdate = null;
    for (Igihingwa igihingwa : Ibihingwa) {
        if (igihingwa.getId() == null ? id == null : igihingwa.getId().equals(id)) {
            igihingwaToUpdate = igihingwa;
            break;
        } else {
        }
    }

    if (igihingwaToUpdate == null) {
        System.out.println("No Igihingwa found with id " + id);
        return;
    }

    // Prompt the user for the new values and update the Igihingwa object
    System.out.print("Enter the new name for the Igihingwa: ");
    String name = scanner.next();
    System.out.print("Enter the new quantity for the Igihingwa: ");
    int quantity = scanner.nextInt();

    igihingwaToUpdate.setName(name);
    igihingwaToUpdate.setQuantity(quantity);

    System.out.println("Igihingwa updated successfully.");
}
    public static void viewUmuhinzi(ArrayList<Umuhinzi> Abahinzi) {
    if (Abahinzi.isEmpty()) {
        System.out.println("No Umuhinzi found.");
    } else {
        System.out.println("List of Umuhinzi:");
        for (Umuhinzi umuhinzi : Abahinzi) {
            System.out.println(umuhinzi);
        }
    }
}

    public static void addUmuhinzi(ArrayList<Umuhinzi> Abahinzi, Scanner scanner) {
        System.out.print("Andika izina ry'Umuhinzi: ");
        String name = scanner.next();
        System.out.print("Andika Numero y'Irangamuntu: ");
        String id= scanner.next();
        System.out.print("Andika aho aherereye: ");
        String location = scanner.next(); 
        System.out.print("Andika numero ya Telefone");
        String phoneNumber=scanner.next();
        Umuhinzi umuhinzi = new Umuhinzi(name,id,location,phoneNumber);
        Abahinzi.add(umuhinzi);
        System.out.println("Umuhinzi Yanditswe neza");
    }
    
    public static void removeUmuhinzi(ArrayList<Umuhinzi> Abahinzi, Scanner scanner) {
        System.out.print("Andika Izina ry'Umuhinzi: ");
        String name = scanner.next();
        for (int i = 0; i < Abahinzi.size(); i++) {
            if (Abahinzi.get(i).getName().equalsIgnoreCase(name)) {
                Abahinzi.remove(i);
                System.out.println("Umuhinzi Yakuwemo neza");
                return;
            }
        }
        System.out.println( "Umuhinzi ntiyabonetse");
    }
    public static void updateUmuhinzi(ArrayList<Umuhinzi> Abahinzi, Scanner scanner) {
    if (Abahinzi.isEmpty()) {
        System.out.println("No Umuhinzi found.");
        return;
    }

    System.out.print("Enter the id of the Umuhinzi to update: ");
    String id = scanner.next();

    // Search for the Umuhinzi with the given id
    Umuhinzi umuhinziToUpdate = null;
    for (Umuhinzi umuhinzi : Abahinzi) {
        if (umuhinzi.getId() == null ? id == null : umuhinzi.getId().equals(id)) {
            umuhinziToUpdate = umuhinzi;
            break;
        }
    }

    if (umuhinziToUpdate == null) {
        System.out.println("No Umuhinzi found with id " + id);
        return;
    }

    // Prompt the user for the new values and update the Umuhinzi object
    System.out.print("Enter the new name for the Umuhinzi: ");
    String name = scanner.next();
    System.out.print("Enter the new phone number for the Umuhinzi: ");
    String phoneNumber = scanner.next();

    umuhinziToUpdate.setName(name);
    umuhinziToUpdate.setPhoneNumber(phoneNumber);

    System.out.println("Umuhinzi updated successfully.");
}


   private static void viewUmusaruro(ArrayList<Umusaruro> Imisaruro) {
    if (Imisaruro.isEmpty()) {
        System.out.println("No Umusaruro found.");
    } else {
        System.out.println("List of Umusaruro:");
        for (Umusaruro umusaruro : Imisaruro) {
            System.out.println("Igihingwa: " + umusaruro.getIgihingwa());
            System.out.println("Umuhinzi: " + umusaruro.getUmuhinzi());
            System.out.println("Ingano: " + umusaruro.getQuantity());
            System.out.println("Italiki: " + umusaruro.getDate());
            System.out.println("===============================");
        }
    }
}

    private static void addUmusaruro(ArrayList<Umusaruro> Imisaruro, Scanner scanner) {
    System.out.print("Enter the id of the Umusaruro: ");
    int id = scanner.nextInt();
    System.out.print("Enter the type of the Umusaruro: ");
    String umuhinzi = scanner.next();
    System.out.print("Enter the quantity of the Umusaruro: ");
    int quantity = scanner.nextInt();
    System.out.print("Enter the price of the Umusaruro: ");
    String date = scanner.next();
    // Create a new Umusaruro object with the input values
    Umusaruro umusaruro = new Umusaruro(id, umuhinzi, quantity, date);

    // Add the new Umusaruro object to the ArrayList
    Imisaruro.add(umusaruro);

    System.out.println("Umusaruro added successfully.");
}

   /* private static void updateUmusaruro(ArrayList<Umusaruro> Imisaruro, Scanner scanner) {
    System.out.print("Enter the id of the Umusaruro to update: ");
    String id = scanner.next();

    // Search for the Umusaruro object with the given id
    boolean found = false;
    for (Umusaruro umusaruro : Imisaruro) {
        if (umusaruro.getId() == id) {
            found = true;

            System.out.println("Enter the new type of the Umusaruro (or press enter to keep the current value): ");
            String umuhinzi = scanner.nextLine().trim();
            if (!umuhinzi.isEmpty()) {
                umusaruro.setType(umuhinzi);
            }

            System.out.println("Enter the new quantity of the Umusaruro (or press enter to keep the current value): ");
            String quantityStr = scanner.nextLine().trim();
            if (!quantityStr.isEmpty()) {
                int quantity = Integer.parseInt(quantityStr);
                umusaruro.setQuantity(quantity);
            }

            System.out.println("Enter the new price of the Umusaruro (or press enter to keep the current value): ");
            String date = scanner.nextLine().trim();
            if (!date.isEmpty()) {
                umusaruro.setDate(date);
            }

            System.out.println("Umusaruro updated successfully.");
            break;
        }
    }

    if (!found) {
        System.out.println("Umusaruro with id " + id + " not found.");
    }
}*/


    private static void removeUmusaruro(ArrayList<Umusaruro> Imisaruro, Scanner scanner) {
    System.out.print("Enter the id of the Umusaruro to remove: ");
    int id = scanner.nextInt();

    // Search for the Umusaruro object with the given id
    boolean found = false;
    for (int i = 0; i < Imisaruro.size(); i++) {
        if (Imisaruro.get(i).getId() == id) {
            found = true;
            // Remove the Umusaruro object from the ArrayList
            Imisaruro.remove(i);

            System.out.println("Umusaruro removed successfully.");
            break;
        }
    }

    if (!found) {
        System.out.println("Umusaruro with id " + id + " not found.");
    }
}


    

}

