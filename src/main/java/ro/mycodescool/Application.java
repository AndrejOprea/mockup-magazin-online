package ro.mycodescool;

import ro.mycodescool.controller.ControllerOD;
import ro.mycodescool.controller.ControllerOrders;
import ro.mycodescool.controller.ControllerProducts;
import ro.mycodescool.model.Customers;
import ro.mycodescool.model.OrderDetails;
import ro.mycodescool.model.Products;
import ro.mycodescool.repository.CustomersRepository;
import ro.mycodescool.repository.OdRepo;
import ro.mycodescool.repository.OrdersRepository;
import ro.mycodescool.repository.ProductsRepository;

import java.time.LocalDate;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        CustomersRepository cs = new CustomersRepository();

        for(Customers c : cs.getAllCustomers()){

            System.out.println(c);
        }



    }
}
