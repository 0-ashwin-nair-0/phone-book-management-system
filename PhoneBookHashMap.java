import java.util.HashMap;
import java.util.Scanner;

public class PhoneBookHashMap {
    private static boolean isNameValid(String name){
        if(!name.matches("^[a-zA-Z' -]+$")){
            System.out.println("-----------------------------------");
            System.out.println("Invalid name!");
            System.out.println("-----------------------------------");
            return false;
        }
        return true;
    }

    private static boolean isPhoneNumberValid(String phoneNumber){
        if(!phoneNumber.matches("\\+?\\d{1,4}?[-.\\s]?\\(?\\d{1,3}?\\)?[-.\\s]?\\d{1,4}[-.\\s]?\\d{1,9}")){
            System.out.println("-----------------------------------");
            System.out.println("Invalid phone number!");
            System.out.println("-----------------------------------");
            return false;
        }
    return true;
    }

    public static void main(String[]args)
    {
        try {
            Scanner sc = new Scanner(System.in);
            HashMap<String, String> phoneBook = new HashMap<>();
            while (true) {
                System.out.println("-----------------------------------");
                System.out.print("-Menu-\n1.) Press 1 to add an entry in the phone book.\n2.) Press 2 to view all the entries in the phonebook.\n3.) Press 3 to search for the entries with name.\n4.) Press 4 to delete an entry.\n5.) Press any other key to exit.\nEnter your choice: ");
                int userChoice = Integer.parseInt(sc.nextLine());

                if (userChoice == 1) {
                    System.out.println("-----------------------------------");
                    System.out.print("Enter the name: ");
                    String name = sc.nextLine();

                    while(!isNameValid(name)){
                        System.out.println("-----------------------------------");
                        System.out.println("Enter correct name: ");
                        System.out.println("If you want to leave enter exit");
                        name = sc.nextLine();
                        if(name.equalsIgnoreCase("exit")){
                            break;
                        }
                    }
                    if (phoneBook.containsKey(name)) {
                        System.out.println("-----------------------------------");
                        System.out.print("The name already exists!\nDo you want to replace the number? y/n: ");
                        String replaceChoice = sc.nextLine();
                        if (replaceChoice.equalsIgnoreCase("n")) {
                            System.out.println("-----------------------------------");
                            System.out.println("Returning to menu screen");
                            System.out.println("-----------------------------------");
                            continue;
                        }
                    }

                    System.out.print("Enter phone number: ");
                    String phoneNumber = sc.nextLine();
                    if(phoneBook.containsValue(phoneNumber)){
                        System.out.println("-----------------------------------");
                        System.out.println("Phone number exists already!");
                        System.out.println("-----------------------------------");
                    }
                    else if (!phoneBook.containsKey(phoneNumber)) {
                        while (!isPhoneNumberValid(phoneNumber)) {
                            System.out.println("-----------------------------------");
                            System.out.print("Enter correct phone number: ");
                            System.out.print("If you want to leave enter exit");
                            phoneNumber = sc.nextLine();
                            if (phoneNumber.equalsIgnoreCase("exit")) {
                                break;
                            }
                        }
                        phoneBook.put(name, phoneNumber);
                        System.out.println("-----------------------------------");
                        System.out.println("The name and phone number have been saved successfully!");
                        System.out.println("-----------------------------------");
                    }
                } else if (userChoice == 2) {
                    System.out.println("Contact List");
                    if(!phoneBook.isEmpty()) {
                        for (String name : phoneBook.keySet()) {
                            System.out.println("-----------------------------------");
                            System.out.println(name + " : " + phoneBook.get(name));
                        }
                    } else {
                        System.out.println("-----------------------------------");
                        System.out.println("No contact list found");
                        System.out.println("-----------------------------------");

                    }

                } else if (userChoice == 3) {
                    System.out.println("-----------------------------------");
                    System.out.print("Enter the name: ");
                    String findName = sc.nextLine();
                        if(phoneBook.containsKey(findName))
                        {
                            System.out.println("-----------------------------------");
                            System.out.println(findName + ": "+phoneBook.get(findName));
                        }
                        else{
                            System.out.println("-----------------------------------");
                            System.out.println("Not found!");
                    }
                } else if (userChoice == 4) {
                    System.out.println("-----------------------------------");
                    System.out.print("Enter the name: ");
                    String deleteData = sc.nextLine();
                    for(int i = 0; i< phoneBook.size(); i++)
                    {
                        if(phoneBook.containsKey(deleteData)){
                            phoneBook.remove(deleteData);
                            System.out.println("-----------------------------------");
                            System.out.println("Deleted successfully");
                            System.out.println("-----------------------------------");
                        }
                        else{
                            System.out.println("-----------------------------------");
                            System.out.println("Not found");
                            System.out.println("-----------------------------------");
                        }
                    }

                }
                else{
                    System.out.println("-----------------------------------");
                    System.out.println("Closing the phone book");
                    System.out.println("-----------------------------------");
                    break;
                }
            }
        }catch (Exception e)
        {
            System.out.println("Error");
        }
    }

}
