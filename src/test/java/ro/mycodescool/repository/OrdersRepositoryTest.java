package ro.mycodescool.repository;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import ro.mycodescool.model.Orders;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class OrdersRepositoryTest {


    @Test
    void test_insert(){

        OrdersRepository ordersRepository = new OrdersRepository();

        Orders o1 = new Orders(4,20,"10DowningStreet","10DowningStreet","o@order.com", LocalDate.of(2021,04,12));

        ordersRepository.insertOrders(o1);



    }

    @Test
    void test_stergere(){

        OrdersRepository ordersRepository = new OrdersRepository();

        ordersRepository.deleteOrders(4);



    }





}