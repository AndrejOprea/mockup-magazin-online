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


            Orders o1 = new Orders(7,20,"10DowningStreet","10DowningStreet","o@order.com", LocalDate.of(2021,04,12),true);

            ordersRepository.insertOrders(o1);


    }

    @Test
    void test_stergere(){

        OrdersRepository ordersRepository = new OrdersRepository();

        ordersRepository.deleteOrders(4);



    }

    @Test
    void test_updateAmount(){

        OrdersRepository ordersRepository = new OrdersRepository();

        ordersRepository.updateAmount(3,78);
    }

    @Test
    void test_updateSA(){

        OrdersRepository ordersRepository = new OrdersRepository();
        ordersRepository.updateSA(3,"sunsetblv");
    }

    @Test
    void test_updateOA(){

        OrdersRepository ordersRepository = new OrdersRepository();
        ordersRepository.updateOA(3,"sunsetblv");
    }

    @Test
    void test_updatemail(){

        OrdersRepository ordersRepository = new OrdersRepository();
        ordersRepository.updateMail(3,"a@a.com");
    }

    @Test
    void test_updateDate(){
        OrdersRepository ordersRepository = new OrdersRepository();
        ordersRepository.updatedate(3,"23-09-2023");

    }

    @Test
    void test_updateStatus(){

        OrdersRepository ordersRepository = new OrdersRepository();
        ordersRepository.updateStatus(3,true);

    }









}