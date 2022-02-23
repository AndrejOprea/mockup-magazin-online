package ro.mycodescool.controller;
import ro.mycodescool.model.Customers;
import ro.mycodescool.repository.CustomersRepository;

import java.util.Set;

public class ControllerCustomers {

    CustomersRepository customersRepository;

    public ControllerCustomers(){

        customersRepository = new CustomersRepository();
    }

    public void add(Customers c){

        customersRepository.insertCustomers(c);

    }

    public void deleteCustomer(int id){

        customersRepository.deleteCustomer(id);

    }

    public Set<Customers> reteriveCustomers(){

        CustomersRepository customersRepository = new CustomersRepository();

       return customersRepository.getAllCustomers();

    }

    public void updateMail(int id, String newMail){

        customersRepository.updateEmail(id,newMail);

    }

    public void updatePassword(int id, String newPass){

        customersRepository.updatePass(id, newPass);

    }

    public void updateFullName(int id , String newName){


        customersRepository.updateName(id, newName);
    }

    public void updateBA(int id, String newBA){

        customersRepository.updateBillAddress(id, newBA);
    }

    public void updateSA(int id, String newSA){

        customersRepository.updateShipAdrs(id, newSA);
    }

    public void updateCountry(int id, String newCtry){

        customersRepository.updateCountry(id, newCtry);
    }

    public void updatePhone(int id, String newPhone){

        customersRepository.updatePhone(id, newPhone);
    }




}
