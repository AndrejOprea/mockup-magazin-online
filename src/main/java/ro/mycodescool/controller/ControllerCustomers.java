package ro.mycodescool.controller;
import ro.mycodescool.model.Customers;
import ro.mycodescool.repository.CustomersRepository;

public class ControllerCustomers {

    CustomersRepository customersRepository;

    public ControllerCustomers(){

        customersRepository = new CustomersRepository();
    }
//nu merge
    public void add(Customers c){

        customersRepository.insertCustomers(c);

    }

    public void deleteCustomer(int id){

        customersRepository.deleteCustomer(id);

    }




}
