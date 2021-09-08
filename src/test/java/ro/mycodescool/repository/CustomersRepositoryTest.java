package ro.mycodescool.repository;

import org.junit.jupiter.api.Test;
import ro.mycodescool.model.Customers;

import static org.junit.jupiter.api.Assertions.*;

class CustomersRepositoryTest {

    @Test
    void test_insertCustomer(){

        CustomersRepository customersRepository = new CustomersRepository();
        Customers c1 = new Customers("Andrei@andrei.com","myPass","Andrei","22Street","22Street","US","07895543286");
        customersRepository.insertCustomers(c1);
    }

    @Test
    void test_deleteCustomer(){

        CustomersRepository customersRepository = new CustomersRepository();
        customersRepository.deleteCustomer(4);
    }

    @Test
    void test_updateMail(){

        CustomersRepository customersRepository = new CustomersRepository();
        customersRepository.updateEmail(5,"newMail");

    }

    @Test
    void test_updatePass(){

        CustomersRepository customersRepository = new CustomersRepository();
        customersRepository.updatePass(5,"newPass");

    }

    @Test
    void test_updateName(){

        CustomersRepository customersRepository = new CustomersRepository();
        customersRepository.updateName(5,"newName");
    }

    @Test
    void test_updateBillAdrs(){

        CustomersRepository customersRepository = new CustomersRepository();
        customersRepository.updateBillAddress(5,"newBillAdrs");
    }

    @Test
    void test_updateShipAdrs(){

        CustomersRepository customersRepository = new CustomersRepository();
        customersRepository.updateShipAdrs(5,"newShipAdrs");
    }

    @Test
    void test_updateCountry(){

        CustomersRepository customersRepository = new CustomersRepository();
        customersRepository.updateCountry(5,"newCountry");
    }

    @Test
    void test_updatePhone(){

        CustomersRepository customersRepository = new CustomersRepository();
        customersRepository.updatePhone(5,"000000000");

    }



}