package ro.mycodescool;

import ro.mycodescool.model.Products;
import ro.mycodescool.repository.ProductsRepository;

import java.time.LocalDate;

public class Application {

    public static void main(String[] args) {

        ProductsRepository pr = new ProductsRepository();

        LocalDate localDate = LocalDate.of(2021,12,22);

        Products p1 = new Products("myproduct",2345,34,"celMaiBunProdus","categoria1",localDate,8900);

        pr.insertProducts(p1);

    }
}
