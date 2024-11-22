package view;

import java.util.Scanner;
import service.ContactService;


public class DisplayView {
    ContactService contactService = new ContactService();

    public void displayview(){
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------------------------------");
        contactService.displayAllContact();
        System.out.println("-----------------------------------------");
        System.out.println("Enter de tiep tuc");
        sc.nextLine();
    }
}
