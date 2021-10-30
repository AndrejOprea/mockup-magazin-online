package ro.mycodescool;

import ro.mycodescool.controller.ControllerProducts;
import ro.mycodescool.model.Products;
import ro.mycodescool.repository.OdRepo;
import ro.mycodescool.repository.OrdersRepository;
import ro.mycodescool.repository.ProductsRepository;

import java.time.LocalDate;

public class Application {

    public static void main(String[] args) {

        OdRepo odRepo = new OdRepo();

        for(int i=0; i<odRepo.getListpayments(5).size();i++){

            System.out.println(odRepo.getListpayments(5).get(i));


        }




    }
}
