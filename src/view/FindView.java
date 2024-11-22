package view;

import java.util.Scanner;
import service.ContactService;
import service.Validator;

public class FindView {

    ContactService contactService = new ContactService();
    Scanner sc = new Scanner(System.in);

    public void findview(){

        boolean isPhone = false;
        boolean isEmail = false;
        String phone = "";
        String email = "";

        while(!isPhone) {
            System.out.println("Nhap so dt:");
            phone = sc.nextLine();
            if (!Validator.validatePhone(phone)) {
                System.out.println("So dien thoai co 10 chu so, va bat dau bang so 0");
            } else {
                isPhone = true;
            }
        }

        if(contactService.findContactByPhone(phone)){
            contactService.displayContactAfterFind(phone);
        }else{
            System.out.println("Khong tim thay");
        }
    }
}
