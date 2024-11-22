package view;

import java.util.Scanner;
import service.ContactService;
import service.Validator;
import model.Contact;

public class AddView {
    ContactService contactService = new ContactService();
    Scanner sc = new Scanner(System.in);

    public void addview() {

        boolean isPhone = false;
        boolean isEmail = false;
        String phone = "";
        String email = "";

        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println("Them Danh ba");
        System.out.println("-----------------------------------------");
        System.out.println();

        while(!isPhone){
            System.out.println("Nhap so dt:");
            phone = sc.nextLine();
            if(!Validator.validatePhone(phone)){
                System.out.println("So dien thoai co 10 chu so, va bat dau bang so 0");
            }else{
                isPhone = true;
            }
        }

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
        while(!isEmail){
            System.out.println("Nhap Email:");
            email = sc.nextLine();
            if(!Validator.validateEmail(email)){
                System.out.println("email phai co dinh dang EmailName@email.com");
            }else{
                isEmail = true;
            }
        }

        Contact contact = new Contact(phone, group, name, gender, address, dateOfBirth, email);

        contactService.addContact(contact);

        System.out.println("Them danh ba thanh cong!");
    }
}
