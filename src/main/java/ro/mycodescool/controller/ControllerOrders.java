package ro.mycodescool.controller;

import ro.mycodescool.model.ComparatorOrdersId;
import ro.mycodescool.model.Orders;
import ro.mycodescool.repository.OrdersRepository;

import java.time.LocalDate;
import java.util.*;

public class ControllerOrders {

    OrdersRepository ordersRepository;


    public ControllerOrders(){

        ordersRepository = new OrdersRepository();
        ordersRepository.ordersList();
    }


//    public  Map<String, List<String>> clientOrders(int id){
//
//        List<String>myList = new ArrayList<>();
//        Map<String, List<String>> myMap = new HashMap<>();
//
//        for(int i=0; i<ordersRepository.getList().size(); i=i+4){
//
//            if(ordersRepository.getList().get(i).equals(String.valueOf(id))){
//
////                System.out.println(ordersRepository.getList().get(i));
////                System.out.println(ordersRepository.getList().get(i+1));
////                System.out.println(ordersRepository.getList().get(i+2));
////                System.out.println(ordersRepository.getList().get(i+3));
//                if(myMap.containsKey(ordersRepository.getList().get(i+1))){
//
//                   myList.add(String.valueOf(ordersRepository.getList().get(i+3)));
//                   myMap.put(String.valueOf(ordersRepository.getList().get(i+1)),myList);
//
//                }else{
//
//                    myList.add(String.valueOf(ordersRepository.getList().get(i)));
//                    myList.add(String.valueOf(ordersRepository.getList().get(i+2)));
//                    myList.add(String.valueOf(ordersRepository.getList().get(i+3)));
//                    myMap.put(String.valueOf(ordersRepository.getList().get(i+1)),myList);
//                }
//
//            }
//        }
//        return myMap;
//    }

    public void addOrder (Orders o){

        ordersRepository.insertOrders(o);

    }

    public void deleteOrder(int id){

        ordersRepository.deleteOrders(id);
    }

       public void updateAmount(int id, int newAmount){

            ordersRepository.updateAmount(id, newAmount);

       }

       public void updateShipAdrs(int id ,String newAdrs){


            ordersRepository.updateSA(id,newAdrs);
       }

       public void updateOrderAdrs(int id, String newOrderAdrs){


            ordersRepository.updateOA(id,newOrderAdrs);
       }

       public void updateMail(int id, String newMAil){


            ordersRepository.updateMail(id,newMAil);
       }

       public void updateDate(int id, String newDate){

            ordersRepository.updatedate(id, newDate);

       }

       public void updateStatus(int id, boolean newStatus){


            ordersRepository.updateStatus(id, newStatus);
       }



    public boolean orderExists(int id){

        Collections.sort(ordersRepository.ordersList(), new ComparatorOrdersId());

        int x = Collections.binarySearch(ordersRepository.ordersList(),new Orders(id,5,
                3,"4","5","6", LocalDate.now(),false),new ComparatorOrdersId());

        return x > 0;

    }

    public List<Orders> seeAllDeliveredOrders(){

        List<Orders> myList = new ArrayList<>();
        Iterator<Orders> it = ordersRepository.ordersList().iterator();

        while(it.hasNext()){

            Orders o = it.next();
            if(o.isOrder_status()==true){

                myList.add(o);
            }
        }
        return myList;
    }

    public List<Orders> seeOrdersBetween2Dates(LocalDate ld1, LocalDate ld2){

        List<Orders>myList = new ArrayList<>();

        Iterator<Orders>it = ordersRepository.ordersList().iterator();

        while(it.hasNext()){

            Orders o = it.next();

            if(o.getOrder_date().isEqual(ld1)||o.getOrder_date().isAfter(ld1)
                    && o.getOrder_date().isBefore(ld2)||o.getOrder_date().isEqual(ld2)){

                myList.add(o);
            }
        }
        return myList;
    }










}
