package ro.mycodescool.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControllerOrdersTest {



    @Test
    void test_clientOrders(){

        ControllerOrders controllerOrders = new ControllerOrders();

        controllerOrders.clientOrders(5);


    }

}