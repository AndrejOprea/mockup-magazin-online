package ro.mycodescool.controller;

import org.junit.jupiter.api.Test;
import ro.mycodescool.model.Orders;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ControllerOrdersTest {

    @Test
    void test_addOrder(){

        ControllerOrders controllerOrders = new ControllerOrders();
        Orders o = new Orders(6,100,"1ststreet","2ndstreet","m@m.com",
                LocalDate.of(2021,11,01),true);
        controllerOrders.addOrder(o);

    }

    @Test
    void test_orderExists(){


        ControllerOrders controllerOrders = new ControllerOrders();
        boolean statement1 = controllerOrders.orderExists(7);
        boolean statement2 = controllerOrders.orderExists(12);

        assertEquals(true,statement1);
        assertEquals(false,statement2);
    }

    @Test
    void test_seeDelivered(){

        ControllerOrders controllerOrders = new ControllerOrders();

        int x = controllerOrders.seeAllDeliveredOrders().size();

        assertEquals(3,x);
    }

    @Test
    void test_seeOrdersBetweenDates(){

        ControllerOrders controllerOrders = new ControllerOrders();

        LocalDate l1 = LocalDate.of(2021,01,01);
        LocalDate l2 = LocalDate.of(2022,02,01);

        int x = controllerOrders.seeOrdersBetween2Dates(l1,l2).size();

        assertEquals(3,x);
    }





}