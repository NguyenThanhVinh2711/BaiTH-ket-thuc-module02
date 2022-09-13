package controller;

import model.Product;

import java.util.*;

public class ProductManager {
    public static ArrayList<Product> productList = new ArrayList<>();

    //Them moi san pham
    public static Product creatProduct() {
        Scanner scannerS = new Scanner(System.in);
        Scanner scannerD = new Scanner(System.in);
        Scanner scannerI = new Scanner(System.in);
        System.out.println("Nhập mã sản phẩm thêm mới:");
        String productId = scannerS.nextLine();
        System.out.println("Nhập tên sản phẩm:");
        String nameProduct = scannerS.nextLine();
        System.out.println("Nhập giá của sản phẩm:");
        double priceProduct = scannerD.nextDouble();
        System.out.println("Nhập số lượng sản phẩm:");
        int amount = scannerI.nextInt();
        System.out.println("Nhập mô tả sản phẩm:");
        String describe = scannerS.nextLine();
        return new Product(productId, nameProduct, priceProduct, amount, describe);
    }

    public static void addProduct() {
        Product product1 = creatProduct();
        productList.add(product1);
    }

    //Hien thi danh sach sp
    public void displayListProduct() {
        System.out.println("---Danh sách sản phẩm---");
        for (int i = 0; i < productList.size(); i++) {
            System.out.println(productList.get(i));
        }
        System.out.println("-----------------------");
    }

//

    //Xóa sản phẩm
    public static void deleteProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã sản phẩm cần xóa:");
        String productId = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getProductId().equals(productId)) {
                check = true;
                productList.remove(productId);
                System.out.println("Xóa thành công.");
            }
            if (!check) {
                System.out.println("Không tìm thấy mã sản phẩm.");
            }
        }
    }
    //sắp xếp sp theo thứ tự tăng dần

    public void sortProductByPrice(){
        Comparator<Product> comparator = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) ((double) (o1.getPriceProduct()) - o2.getPriceProduct());
            }
        };
        productList.sort(comparator);
        System.out.println("Danh sách sản phẩm đã được sắp xếp theo thứ tự tăng dần:");
        displayListProduct();
    }

    //Tìm sản phẩm có giá đắt nhất
    public ArrayList<Product> sortProduct() {
        Collections.sort(productList);
        return productList;
    }

    public void searchMaxPrice() {
        ArrayList<Product> productArrayList = sortProduct();
        System.out.println(productArrayList.get((productArrayList.size() - 1)));
    }

    //Sửa sản phẩm
    public void editProduct() {
        Scanner scannerS = new Scanner(System.in);
        Scanner scannerD = new Scanner(System.in);
        Scanner scannerI = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã sản phẩm cần sửa:");
        String productId = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getProductId().equals(productId)) {
                check = true;
                System.out.println("Nhập mã sản phẩm mới:");
                String newProductId = scannerS.nextLine();
                System.out.println("Nhập tên sản phẩm:");
                String newNameProduct = scannerS.nextLine();
                System.out.println("Nhập giá sản phẩm:");
                double newPrice = scannerD.nextDouble();
                System.out.println("Nhập số lượng sản phẩm:");
                int newAmount = scannerI.nextInt();
                System.out.println("Nhập mô tả sản phẩm:");
                String newDescribe = scannerS.nextLine();

                productList.get(i).setProductId(newProductId);
                productList.get(i).setNameProduct(newNameProduct);
                productList.get(i).setPriceProduct(newPrice);
                productList.get(i).setAmount(newAmount);
                productList.get(i).setDescribe(newDescribe);
                System.out.println("Sửa thành công.");
            }
            if (!check) {
                System.out.println("Không tìm thấy mã sản phẩm.");
            }
        }
    }

}
