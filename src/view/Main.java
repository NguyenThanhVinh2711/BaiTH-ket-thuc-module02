package view;

import controller.ProductManager;
import storage.ReadFile;
import storage.WriteFile;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManager productManager = new ProductManager();
        int choice;
        do {

            System.out.println("---- CHƯƠNG TRÌNH QUẢN LÝ SẢN PHẨM ----");
            System.out.println("1.Xem danh sách");
            System.out.println("2.Thêm mới");
            System.out.println("3.Sửa sản phẩm.");
            System.out.println("4.Xóa sản phẩm.");
            System.out.println("5.Sắp xếp.");
            System.out.println("6.Tìm sản phẩm có giá cao nhất.");
            System.out.println("7.Đọc từ file");
            System.out.println("8.Ghi vo file");
            System.out.println("0.Thoát.");
            System.out.println("--------------------------------------");
            System.out.print("Chọn chức năng: ");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    productManager.displayListProduct();
                    break;
                case 2:
                    ProductManager.addProduct();
                    break;
                case 3:
                    productManager.editProduct();
                    break;
                case 4:
                    ProductManager.deleteProduct();
                    break;
                case 5:
                    productManager.sortProductByPrice();
                    break;
                case 6:
                    productManager.searchMaxPrice();
                    break;
                case 7:
                    ReadFile.readFileProductList();
                    break;
                case 8:
                    WriteFile.writeFileProduct("FileProduct.csv");
                    break;
                case 0:
                    System.exit(0);
            }
        }while (true);
    }
}
