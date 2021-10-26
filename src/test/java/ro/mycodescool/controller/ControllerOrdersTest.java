package ro.mycodescool.controller;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ControllerOrdersTest {



    @Test
    void test_clientOrders(){

        ControllerOrders controllerOrders = new ControllerOrders();

        for(Map.Entry<String, List<String>> map : controllerOrders.clientOrders(5).entrySet()){

            System.out.println(map.getKey() + "......" + map.getValue());
        }


    }

}