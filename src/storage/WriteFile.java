package storage;

import model.Product;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import static controller.ProductManager.productList;
public class WriteFile {
    public static void writeFileProduct(String File) {
        try {
            java.io.File file = new File("FileProduct.csv");
            if (!file.exists()) {
                file.createNewFile();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            for (Product product : productList) {
                bufferedWriter.write(product.getProductId() + "," + product.getNameProduct() + "," + product.getPriceProduct() + "," + product.getAmount() + "," + product.getDescribe() + "\n");
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
