package ro.mycodescool;

import ro.mycodescool.controller.ControllerOrders;
import ro.mycodescool.controller.ControllerProducts;
import ro.mycodescool.model.Products;
import ro.mycodescool.repository.OdRepo;
import ro.mycodescool.repository.OrdersRepository;
import ro.mycodescool.repository.ProductsRepository;

import java.time.LocalDate;

public class Application {

    public static void main(String[] args) {

        ControllerOrders controllerOrders = new ControllerOrders();

        LocalDate l1 = LocalDate.of(2021,01,01);
        LocalDate l2 = LocalDate.of(2022,02,01);

        System.out.println(controllerOrders.seeOrdersBetween2Dates(l1,l2));





    }
}
