package ro.mycodescool.view;

import ro.mycodescool.controller.ControllerCustomers;
import ro.mycodescool.controller.ControllerOrders;
import ro.mycodescool.controller.ControllerProducts;

public class ViewOrders {

    ControllerOrders controllerOrders;
    ControllerProducts controllerProducts;

    ControllerCustomers controllerCustomers;

    public ViewOrders(){

        controllerOrders = new ControllerOrders();
        controllerProducts = new ControllerProducts();
        controllerCustomers = new ControllerCustomers();
    }


}
