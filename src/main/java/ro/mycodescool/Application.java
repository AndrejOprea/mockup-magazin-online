package ro.mycodescool;

import ro.mycodescool.controller.ControllerProducts;
import ro.mycodescool.model.Products;
import ro.mycodescool.repository.OrdersRepository;
import ro.mycodescool.repository.ProductsRepository;

import java.time.LocalDate;

public class Application {

    public static void main(String[] args) {

        OrdersRepository ordersRepository = new OrdersRepository();

       for(int i=0; i<ordersRepository.getList().size(); i++){

           System.out.println(ordersRepository.getList().get(i));


       }





    }
}
