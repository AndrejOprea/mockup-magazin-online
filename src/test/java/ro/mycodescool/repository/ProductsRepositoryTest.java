package ro.mycodescool.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ro.mycodescool.model.Products;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ProductsRepositoryTest {



    @Test
    void test_deInserat(){

        ProductsRepository productsRepository = new ProductsRepository();

        LocalDate localDate = LocalDate.of(2021,12,22);

        Products p1 = new Products("myproduct",2345,34,"celMaiBunProdus","categoria1",localDate,8900);

        productsRepository.insertProducts(p1);

    }

    @Test
    void test_delete(){

        ProductsRepository productsRepository = new ProductsRepository();
        productsRepository.deleteProduct(7);

    }

    @Test
    void test_updateName(){

        ProductsRepository productsRepository = new ProductsRepository();
        productsRepository.updateName(6,"myproduct");

    }

    @Test
    void test_updatePrice(){
        ProductsRepository productsRepository = new ProductsRepository();
        productsRepository.updatePrice(5,100000);

    }

    @Test
    void test_updateWeight(){

        ProductsRepository productsRepository = new ProductsRepository();
        productsRepository.updateWeight(5,4455);


    }

    @Test
    void test_updateDesc(){

        ProductsRepository productsRepository = new ProductsRepository();
        productsRepository.updateDescription(5,"o noua descriere");

    }

    @Test
    void test_updateCat(){

        ProductsRepository productsRepository = new ProductsRepository();
        productsRepository.updateCat(5,"categoria 3");


    }

    @Test
    void test_updateDate(){

        ProductsRepository productsRepository = new ProductsRepository();


    }






}