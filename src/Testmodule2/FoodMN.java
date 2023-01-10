package Testmodule2;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class FoodMN {
    ArrayList<Food> list = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public FoodMN() {
        list=read("D:\\module2\\untitled\\src\\Testmodule2\\Food");
        list.add(new Apple(1, "tàu", 20000, 1000, "blue", 1));
        list.add(new Apple(2, "tây", 35000, 800, "red", 2));
        list.add(new Banana(3, "úc", 15000, 950, "yelow", 1));
        list.add(new Banana(4, "pháp", 23000, 300, "green", 3));
        list.add(new Orange(5, "úc", 50000, 2000, "orange", "60%"));
        list.add(new Orange(6, "pháp", 35000, 1400, "green", "67%"));
    }

    public void display1() {
        for (int i = 0; i < list.size() - 1; i++) {
            if (i < 5) {
                System.out.println(list.get(i));
            }
        }
    }

    public void display2() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public void displayLast() {
        for (int i = 5; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public void add(Scanner scanner) {
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            index++;
        }
        String name;
        int price = 0;
        int quantity = 0;
        String color;
        String sweet;
        int weight = 0;
        int size = 0;
        int choice;
        do {
            System.out.println("Mời bạn chọn loại sản phẩm mới muốn thêm ");
            System.out.println("1.Thêm cam");
            System.out.println("2.Thêm táo");
            System.out.println("3.Thêm chuối");
            System.out.println("4.Thoát");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    boolean flag = true;
                    Orange orange;
                    System.out.println("Mời bạn nhập tên sản phẩm muốn thêm");
                    name = scanner.nextLine();
                    while (flag) {
                        try {
                            System.out.println("Mời bạn nhập giá sản phẩm muốn thêm");
                            price = Integer.parseInt(scanner.nextLine());
                            flag = false;
                        } catch (NumberFormatException e) {
                            System.out.println(" nhập lại ");
                        }
                    }
                    flag = true;
                    while (flag) {
                        try {
                            System.out.println("Mời bạn nhập số lượng sản phẩm muốn thêm");
                            quantity = Integer.parseInt(scanner.nextLine());
                            flag = false;
                        } catch (NumberFormatException e) {
                            System.out.println(" nhập lại ");
                        }
                    }
                    System.out.println("Mời bạn nhập màu sắc sản phẩm muốn thêm");
                    color = scanner.nextLine();
                    System.out.println("Mời bạn nhập độ chín của cam");
                    sweet = scanner.nextLine();
                    orange = new Orange(index+1, name, price, quantity, color, sweet);
                    list.add(orange);
                    break;
                case 2:
                    boolean flag1 = true;
                    Apple apple;
                    System.out.println("Mời bạn nhập tên sản phẩm muốn thêm");
                    name = scanner.nextLine();
                    while (flag1) {
                        try {
                            System.out.println("Mời bạn nhập giá sản phẩm muốn thêm");
                            price = Integer.parseInt(scanner.nextLine());
                            flag1 = false;
                        } catch (NumberFormatException e) {
                            System.out.println(" nhập lại ");
                        }
                    }
                    flag1 = true;
                    while (flag1) {
                        try {
                            System.out.println("Mời bạn nhập số lượng sản phẩm muốn thêm");
                            quantity = Integer.parseInt(scanner.nextLine());
                            flag1 = false;
                        } catch (NumberFormatException e) {
                            System.out.println(" nhập lại ");
                        }
                    }
                    flag1 = true;
                    System.out.println("Mời bạn nhập màu sắc sản phẩm muốn thêm");
                    color = scanner.nextLine();
                    while (flag1) {
                        try {
                            System.out.println("Mời bạn nhập cân nặng của táo ");
                            weight = Integer.parseInt(scanner.nextLine());
                            flag1 = false;
                        } catch (NumberFormatException e) {
                            System.out.println("nhập lại");
                        }
                    }
                    apple = new Apple(index+1, name, price, quantity, color, weight);
                    list.add(apple);
                    break;
                case 3:
                    boolean flag2 = true;
                    Banana banana;
                    System.out.println("Mời bạn nhập tên sản phẩm muốn thêm");
                    name = scanner.nextLine();
                    while (flag2) {
                        try {
                            System.out.println("Mời bạn nhập giá sản phẩm muốn thêm");
                            price = Integer.parseInt(scanner.nextLine());
                            flag2 = false;
                        } catch (NumberFormatException e) {
                            System.out.println(" nhập lại ");
                        }
                    }
                    flag2 = true;
                    while (flag2) {
                        try {
                            System.out.println("Mời bạn nhập số lượng sản phẩm muốn thêm");
                            quantity = Integer.parseInt(scanner.nextLine());
                            flag2 = false;
                        } catch (NumberFormatException e) {
                            System.out.println(" nhập lại ");
                        }
                    }
                    flag2 = true;
                    System.out.println("Mời bạn nhập màu sắc sản phẩm muốn thêm");
                    color = scanner.nextLine();
                    while (flag2) {
                        try {
                            System.out.println("Mời bạn nhập độ lớn của chuối");
                            size = Integer.parseInt(scanner.nextLine());
                            flag2 = false;
                        } catch (NumberFormatException e) {
                            System.out.println("nhập lại");
                        }
                    }
                    banana = new Banana(index+1, name, price, quantity, color, size);
                    list.add(banana);
                    break;
            }
        } while (choice != 4);
    }

    public void fixById(Scanner scanner) {
        String name;
        int price = 0;
        int quantity = 0;
        String color;
        String sweet ;
        int weight = 0;
        int size = 0;
        int id = 0;
        boolean flag1 = true;
        boolean flag2 = true;
        boolean flag3 = true;
        boolean check = true;
        while (check)
            try {
                System.out.println("Mời bạn nhập id để tìm sản phẩm muốn sửa");
                id = Integer.parseInt(scanner.nextLine());
                check = false;
            } catch (NumberFormatException e) {
                System.out.println("Nhập lại");
            }
        for (Food p : list) {
            if (id == p.getId()) {
                if (p instanceof Apple) {
                    System.out.println("Mời bạn nhập tên sản phẩm muốn sửa");
                    name = scanner.nextLine();
                    while (flag1) {
                        try {
                            System.out.println("Mời bạn nhập giá sản phẩm muốn sửa ");
                            price = Integer.parseInt(scanner.nextLine());
                            flag1 = false;
                        } catch (NumberFormatException e) {
                            System.out.println(" nhập lại ");
                        }
                    }
                    flag1 = true;
                    while (flag1) {
                        try {
                            System.out.println("Mời bạn nhập số lượng sản phẩm muốn sửa ");
                            quantity = Integer.parseInt(scanner.nextLine());
                            flag1 = false;
                        } catch (NumberFormatException e) {
                            System.out.println(" nhập lại ");
                        }
                    }
                    flag1 = true;
                    System.out.println("Mời bạn nhập màu sắc sản phẩm muốn sửa ");
                    color = scanner.nextLine();
                    while (flag1) {
                        try {
                            System.out.println("Mời bạn nhập cân nặng của táo ");
                            weight = Integer.parseInt(scanner.nextLine());
                            flag1 = false;
                        } catch (NumberFormatException e) {
                            System.out.println("nhập lại");
                        }
                    }
                    p.setName(name);
                    p.setPrice(price);
                    p.setQuantity(quantity);
                    p.setColor(color);
                    ((Apple) p).setWeight(weight);
                } else if (p instanceof Banana) {
                    System.out.println("Mời bạn nhập tên sản phẩm muốn sửa");
                    name = scanner.nextLine();
                    while (flag2) {
                        try {
                            System.out.println("Mời bạn nhập giá sản phẩm muốn sửa ");
                            price = Integer.parseInt(scanner.nextLine());
                            flag2 = false;
                        } catch (NumberFormatException e) {
                            System.out.println(" nhập lại ");
                        }
                    }
                    flag2 = true;
                    while (flag2) {
                        try {
                            System.out.println("Mời bạn nhập số lượng sản phẩm muốn sửa ");
                            quantity = Integer.parseInt(scanner.nextLine());
                            flag2 = false;
                        } catch (NumberFormatException e) {
                            System.out.println(" nhập lại ");
                        }
                    }
                    flag2 = true;
                    System.out.println("Mời bạn nhập màu sắc sản phẩm muốn sửa ");
                    color = scanner.nextLine();
                    while (flag2) {
                        try {
                            System.out.println("Mời bạn nhập cân nặng của táo ");
                            weight = Integer.parseInt(scanner.nextLine());
                            flag2 = false;
                        } catch (NumberFormatException e) {
                            System.out.println("nhập lại");
                        }
                    }
                    flag2 = true;
                    while (flag2) {
                        try {
                            System.out.println("Mời bạn nhập độ lớn  ");
                            size = Integer.parseInt(scanner.nextLine());
                            flag2 = false;
                        } catch (NumberFormatException e) {
                            System.out.println("nhập lại");
                        }
                    }
                    p.setName(name);
                    p.setPrice(price);
                    p.setQuantity(quantity);
                    p.setColor(color);
                    ((Banana) p).setSize(size);
                } else if (p instanceof Orange) {
                    System.out.println("Mời bạn nhập tên sản phẩm muốn sửa");
                    name = scanner.nextLine();
                    while (flag3) {
                        try {
                            System.out.println("Mời bạn nhập giá sản phẩm muốn sửa ");
                            price = Integer.parseInt(scanner.nextLine());
                            flag3 = false;
                        } catch (NumberFormatException e) {
                            System.out.println(" nhập lại ");
                        }
                    }
                    flag3 = true;
                    while (flag3) {
                        try {
                            System.out.println("Mời bạn nhập số lượng sản phẩm muốn sửa ");
                            quantity = Integer.parseInt(scanner.nextLine());
                            flag3 = false;
                        } catch (NumberFormatException e) {
                            System.out.println(" nhập lại ");
                        }
                    }
                    System.out.println("Mời bạn nhập màu sắc sản phẩm muốn sửa ");
                    color = scanner.nextLine();
                    System.out.println("Mời bạn nhập cân nặng  ");
                    sweet = scanner.nextLine();
                    p.setName(name);
                    p.setPrice(price);
                    p.setQuantity(quantity);
                    p.setColor(color);
                    ((Orange) p).setSweet(sweet);
                }
            }
        }
    }

    public void deleteById(Scanner scanner) {
        int id = 0;
        boolean check = true;
        while (check) {
            try {
                System.out.println("Mời bạn nhập id sản phẩm bạn muốn tìm để xóa");
                id = Integer.parseInt(scanner.nextLine());
                check = false;
            } catch (NumberFormatException e) {
                System.out.println("Nhap lại");
            }
        }
        check = true;
        for (int i = 0; i < list.size(); i++) {
            if (id <= list.size()) {
                check = false;
            }
        }
        for (Food p : list) {
            if (id == p.getId()) {
                list.remove(p);
                break;
            }
        }
    }

    public void sort() {
        System.out.println("List product by up price: ");
        list.sort(new Comparator<Food>() {
            @Override
            public int compare(Food o1, Food o2) {
                return o1.getPrice() > o2.getPrice() ? 1 : -1;
            }
        });
        display2();

    }

    public void displayByPrice() {
        int max = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPrice() > max) {
                max = list.get(i).getPrice();
            }
        }
        System.out.println(max);
    }
    public void writeCsv (ArrayList<Food> list, String path) {
        try {
            FileWriter fileWriter = new FileWriter(path);
            BufferedWriter bw = new BufferedWriter(fileWriter);
            for (Food product : list) {
                bw.write(product.toString());
                bw.newLine();
            }
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public ArrayList<Food> read(String path){
        ArrayList<Food> list = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(path);
            BufferedReader br = new BufferedReader(fileReader);
            String line = "";
            while ((line=br.readLine())!=null){
                String [] txt = line.split(";");
                int id = Integer.parseInt(txt[0]);
                String name = txt[1];
                int price = Integer.parseInt(scanner.nextLine());
                int quantity = Integer.parseInt(txt[3]);
                String color=txt[4];
                list.add(new Food(id,name,price,quantity,color));
            }
            br.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
        return list;
    }
}
