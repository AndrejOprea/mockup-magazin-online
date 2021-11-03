package ro.mycodescool.controller;

import org.junit.jupiter.api.Test;
import ro.mycodescool.model.OrderDetails;

import static org.junit.jupiter.api.Assertions.*;

class ControllerODTest {

    @Test
    void test_seeOrderPrices(){

        ControllerOD od = new ControllerOD();
        int x = od.seeOrderPrices(10,400).size();

        assertEquals(1,x);

    }

    @Test
    void test_seeOrderQty(){


        ControllerOD od = new ControllerOD();

        int x = od.seeOrderQuantities(9,300).size();

        assertEquals(2,x);

    }

    @Test
    void test_add(){


        ControllerOD controllerOD = new ControllerOD();
        OrderDetails od = new OrderDetails()
        controllerOD.addOD();
    }

}