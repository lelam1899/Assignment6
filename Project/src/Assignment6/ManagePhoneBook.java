package Assignment6;

import java.util.Scanner;

public class ManagePhoneBook {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();
        while (true) {
            System.out.println("\nSelect: ");
            System.out.println("1. Insert Phone");
            System.out.println("2. Remove Phone");
            System.out.println("3. Update Phone");
            System.out.println("4. Search Phone");
            System.out.println("5. Sort");
            System.out.println("6. Show all Phone");

            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1: {
                    System.out.println("Name: ");
                    String name = scanner.nextLine();

                    System.out.println("Phone: ");
                    String phone = scanner.nextLine();
                    phoneBook.insertPhone(name, phone);
                    break;
                }
                case 2: {
                    System.out.println("Name: ");
                    String name = scanner.nextLine();
                    phoneBook.removePhone(name);
                    break;
                }
                case  3: {
                    System.out.println("Name: ");
                    String name = scanner.nextLine();
                    System.out.println("Phone: ");
                    String phone = scanner.nextLine();
                    phoneBook.updatePhone(name, phone);
                    break;
                }
                case 4: {
                    System.out.println("Name: ");
                    String name = scanner.nextLine();
                    phoneBook.searchPhone(name);
                    break;
                }
                case 5: {
                    phoneBook.sort();
                    System.out.println("Phone Listis sorted");
                    break;
                }
                case 6: {
                    System.out.println("Display all Phone");
                    phoneBook.showAllPhone();
                    break;
                }
                default:
                    return;
            }

        }



    }

}
