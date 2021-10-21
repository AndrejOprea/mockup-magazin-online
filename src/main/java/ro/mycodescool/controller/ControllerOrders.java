package ro.mycodescool.controller;

import ro.mycodescool.repository.OrdersRepository;

import java.util.*;

public class ControllerOrders {

    OrdersRepository ordersRepository;


    public ControllerOrders(){

        ordersRepository = new OrdersRepository();
    }


    public Map<String,List<String>> clientOrders(int id){

        List<String>myList = new ArrayList<>();

        Map<String, List<String>> myMap = new HashMap<>();

        for(int i=0; i<ordersRepository.getList().size(); i=i+4){

            if(ordersRepository.getList().get(i).equals(String.valueOf(id))){

                System.out.println(ordersRepository.getList().get(i));
                System.out.println(ordersRepository.getList().get(i+1));
                System.out.println(ordersRepository.getList().get(i+2));
                System.out.println(ordersRepository.getList().get(i+3));

                myList.add(String.valueOf(ordersRepository.getList().get(i+1)));
                myList.add(String.valueOf(ordersRepository.getList().get(i+2)));
                myMap.put(String.valueOf(ordersRepository.getList().get(i+2)),myList);

            }
        }
        return myMap;
    }



}
