package view;

import java.util.Scanner;
import service.ContactService;
import model.Contact;
import service.Validator;

public class UpdateView {
    ContactService contactService = new ContactService();
    Scanner sc = new Scanner(System.in);

    public void updateView(){

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
            System.out.println("Nhap nhom:");
            String group = sc.nextLine();
            System.out.println("Nhap ho ten");
            String name = sc.nextLine();
            System.out.println("Nhap gioi tinh");
            String gender = sc.nextLine();
            System.out.println("Nhap dia chi");
            String address = sc.nextLine();
            System.out.println("Nhap ngay sinh");
            String dateOfBirth = sc.nextLine();
            while(!isEmail) {
                System.out.println("Nhap Email:");
                email = sc.nextLine();
                if (!Validator.validateEmail(email)) {
                    System.out.println("email phai co dinh dang EmailName@email.com");
                } else {
                    isEmail = true;
                }
            }

            contactService.updateContact(phone, group, name, gender, address, dateOfBirth, email);

            System.out.println("Cap nhat danh ba thanh cong!");
        }else{
            System.out.println("Khong tinm thay so dien thoai da nhap");
        }
    }
}
