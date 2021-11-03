package ro.mycodescool.controller;

import javafx.util.Pair;
import ro.mycodescool.model.OrderDetails;
import ro.mycodescool.repository.OdRepo;

import java.util.*;

public class ControllerOD {

    OdRepo odRepo;

    public ControllerOD(){

        odRepo = new OdRepo();

    }

    public List<OrderDetails> seeOrderPrices(int min, int max){

        List<OrderDetails> odList = odRepo.getAllOd();
        List<OrderDetails> newList = new ArrayList<>();

        Collections.sort(odList, new Comparator<OrderDetails>() {
            @Override
            public int compare(OrderDetails o1, OrderDetails o2) {
                return Integer.compare(o1.getPrice(),o2.getPrice());
            }
        });

        for(int i=0; i<odList.size();i++){

            if(odList.get(i).getPrice()>=min && odList.get(i).getPrice()<=max){

                newList.add(odList.get(i));

            }

        }
        return newList;

    }

    public List<OrderDetails> seeOrderQuantities(int min, int max){

        List<OrderDetails> list = odRepo.getAllOd();
        List<OrderDetails> newList = new ArrayList<>();

        for(int i=0; i< list.size(); i++){

            if(list.get(i).getQuantity()>=min && list.get(i).getQuantity()<=max){


                newList.add(list.get(i));
            }
        }

        return newList;

    }

    public void addOD(OrderDetails od){

        odRepo.insert_od(od);

    }

    public void deleteOD(int id){

        odRepo.delete_od(id);

    }

    public void updateOID(int id,int newID){

        odRepo.update_OrderId(id,newID);
    }

    public void updateProdID(int id, int newProdID){


        odRepo.updatePID(id,newProdID);
    }

    public void updatePrice(int id, int newPrice){

        odRepo.updatePrice(id, newPrice);

    }

    public void updateQty(int id, int newQty){

        odRepo.updateQty(id, newQty);

    }








}
