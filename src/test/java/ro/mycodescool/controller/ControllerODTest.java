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
        OrderDetails od = new OrderDetails(2,3,4,5,6);
        controllerOD.addOD(od);
    }

    @Test
    void test_updateOID(){

        ControllerOD controllerOD = new ControllerOD();
        controllerOD.updateOID(11,7);


    }

    @Test
    void test_updatePID(){

        ControllerOD controllerOD = new ControllerOD();
        controllerOD.updateProdID(11,6);
    }

    @Test
    void test_updatePrice(){

        ControllerOD controllerOD = new ControllerOD();
        controllerOD.updatePrice(11,10);
    }

    @Test
    void test_updateQty(){

        ControllerOD controllerOD = new ControllerOD();
        controllerOD.updateQty(11,100);
    }

}