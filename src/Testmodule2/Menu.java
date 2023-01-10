package Testmodule2;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        FoodMN foodMN = new FoodMN();
        int choice;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Mời bạn nhập lựa chọn");
            System.out.println("1.xem sản phẩm");
            System.out.println("2.Thêm sản phẩm");
            System.out.println("3.sửa sản phẩm");
            System.out.println("4.Xóa sản phẩm");
            System.out.println("5.Sắp xếp theo giá tăng dần");
            System.out.println("6.Hiển thị sản phẩm có giá cao nhất");
            System.out.println("7.Hiển thị tổng danh sách");
            System.out.println("8.Ghi file");
            System.out.println("9.Đọc file ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Hiển thị 5 sản phẩm đầu");
                    foodMN.display1();
                    System.out.println("---------------------");
                    foodMN.displayLast();
                    break;
                case 2:
                    foodMN.add(scanner);
                    foodMN.writeCsv(foodMN.list,"D:\\module2\\untitled\\src\\Testmodule2\\Food");
                    break;
                case 3:
                    foodMN.fixById(scanner);
                    foodMN.writeCsv(foodMN.list,"D:\\module2\\untitled\\src\\Testmodule2\\Food");
                    break;
                case 4:
                    foodMN.deleteById(scanner);
                    foodMN.writeCsv(foodMN.list,"D:\\module2\\untitled\\src\\Testmodule2\\Food");
                    break;
                case 5:
                    foodMN.sort();
                    foodMN.writeCsv(foodMN.list,"D:\\module2\\untitled\\src\\Testmodule2\\Food");
                    break;
                case 6:
                    foodMN.displayByPrice();
                    break;
                case 7:
                    foodMN.display2();
                    break;
            }
        } while (choice != 8);
    }
}
