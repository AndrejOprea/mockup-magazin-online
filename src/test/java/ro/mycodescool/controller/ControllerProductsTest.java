package ro.mycodescool.controller;

import org.junit.jupiter.api.Test;
import ro.mycodescool.model.Products;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ControllerProductsTest {

    @Test
    void test_add(){

        ControllerProducts controllerProducts = new ControllerProducts();
        LocalDate localDate = LocalDate.of(2020,02,02);
        Products p = new Products("produs1",100,525,"produsul1","categoria 2",localDate,3780);
        controllerProducts.addProduct(p);

    }

    @Test
    void test_delete(){

        ControllerProducts controllerProducts = new ControllerProducts();
        controllerProducts.deleteProducts(8);


    }

    @Test
    void test_updateName(){

        ControllerProducts controllerProducts = new ControllerProducts();
        controllerProducts.updatePName(2,"betterName");
    }

    @Test
    void test_productExist(){

        ControllerProducts controllerProducts = new ControllerProducts();
       boolean statement = controllerProducts.productExist("myproduct");

       assertEquals(true,statement);

    }

    @Test
    void test_seeZeroStock(){

        ControllerProducts controllerProducts = new ControllerProducts();

        controllerProducts.seeZeroStock();




    }

}