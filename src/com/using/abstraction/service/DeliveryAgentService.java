package com.using.abstraction.service;
import com.using.abstraction.model.DeliveryAgent;
import com.using.abstraction.repository.DeliveryAgentRepository;
import java.util.*;

public class DeliveryAgentService {
    private DeliveryAgentRepository deliveryAgentRepository = new DeliveryAgentRepository();
    private static Map<Integer , DeliveryAgent> deliveryAgents = new HashMap<>();
    private Scanner sc = new Scanner(System.in);

    void printCustomer(DeliveryAgent deliveryAgent){

        System.out.println(deliveryAgent);
    }
    public DeliveryAgent createDeliveryAgent(){

        DeliveryAgent deliveryAgent = new DeliveryAgent();
        deliveryAgentRepository.createDeliveryAgent(deliveryAgent);
        deliveryAgentRepository.displayDeliveryAgent(deliveryAgent);
        deliveryAgentRepository.displayDeliveryAgentToBeClosed(1);
        try {

            System.out.println("Please enter id");
            int id = Integer.parseInt(sc.nextLine());

            System.out.println("Please enter name");
            String name = sc.nextLine();

            System.out.println("Please enter city");
            String city = sc.nextLine();

            System.out.println("Please enter mobileNo");
            int mobileNo = Integer.parseInt(sc.nextLine());

            deliveryAgent.setId(id);
            deliveryAgent.setName(name);
            deliveryAgent.setCity(city);
            deliveryAgent.setMobileNo(mobileNo);
            deliveryAgents.put(1, deliveryAgent);
        }catch (Exception e){
                System.out.println("Invalid input type correct data");
            }
        return deliveryAgent;
    }

    public void displayDeliveryAgent(){

        try {

        Set<Map.Entry<Integer,DeliveryAgent>> entrySet = deliveryAgents.entrySet();
        for(Map.Entry<Integer,DeliveryAgent>customerEntry : entrySet){
            System.out.println("Customer Info: " + deliveryAgents );
          }

        }catch (Exception e){
            System.out.println("Invalid input type correct data");
        }
//        for(DeliveryAgent deliveryAgent : deliveryAgents){
//            System.out.println("Customer Info: " + deliveryAgent);
//        }
    }
}


