package ro.mycodescool.repository;

import org.junit.jupiter.api.Test;
import ro.mycodescool.model.OrderDetails;

import static org.junit.jupiter.api.Assertions.*;

class OdRepoTest {

    @Test
    void test_insertOD(){

        OdRepo odRepo = new OdRepo();

        OrderDetails orderDetails = new OrderDetails(8,6,10,10);

        odRepo.insert_od(orderDetails);


    }

    @Test
    void test_deleteOD(){

        OdRepo odRepo = new OdRepo();

        odRepo.delete_od(10);
    }

    @Test
    void test_updateOrderId(){

        OdRepo odRepo = new OdRepo();

        odRepo.update_OrderId(7,7);
    }

    @Test
    void test_updatePID(){

        OdRepo odRepo = new OdRepo();

        odRepo.updatePID(5,6);

    }

    @Test
    void test_updatePrice(){

        OdRepo odRepo = new OdRepo();
        odRepo.updatePrice(5,350);

    }

    @Test
    void test_updateQty(){

        OdRepo odRepo = new OdRepo();

        odRepo.updateQty(5,10);

    }

}