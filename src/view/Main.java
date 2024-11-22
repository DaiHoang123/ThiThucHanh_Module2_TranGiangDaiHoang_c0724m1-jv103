package view;

import service.ContactService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContactService contactService = new ContactService();
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("===== QUẢN LÝ DANH BẠ =====");
            System.out.println("1. Xem danh sách");
            System.out.println("2. Thêm mới");
            System.out.println("3. Cập nhật");
            System.out.println("4. Xóa");
            System.out.println("5. Tìm kiếm");
            System.out.println("6. Đọc từ file");
            System.out.println("7. Lưu vào file");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");

            int choice = Integer.parseInt(sc.nextLine());

            try {
                switch (choice) {
                    case 1 -> contactService.displayAllContact();
                    case 2 -> {
                        AddView addView = new AddView();
                        addView.addview();
                    }
                    case 3 -> {
                        UpdateView updateView = new UpdateView();
                        updateView.updateView();
                    }
                    case 4 -> {
                        DeleteView deleteView = new DeleteView();
                        deleteView.deleteview();
                    }
                    case 5 -> {
                        FindView findView = new FindView();
                        findView.findview();
                    }
                    case 6 -> System.out.println("Doc tu file");
                    case 7 -> System.out.println("Luu tu file");
                    case 0 -> {
                        System.out.println("Hen gap lai");
                        System.exit(0);
                    }
                    default -> System.out.println("Khong co chuc nang nay");
                }
            }catch(NumberFormatException e){
                System.out.println("Nhap sai dinh dang, chi duoc nhap so nguyen!");
            }
        }
    }
}