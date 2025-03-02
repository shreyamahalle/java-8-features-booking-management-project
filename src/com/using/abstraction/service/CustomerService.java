package com.using.abstraction.service;
import com.using.abstraction.model.Customer;
import com.using.abstraction.repository.CustomerRepository;
import java.util.*;

public class CustomerService {
    private CustomerRepository customerRepository = new CustomerRepository();
    private static Map<Integer ,Customer> customers = new HashMap<>();
    private Scanner sc = new Scanner(System.in);

    void printCustomer(Customer customer){

        System.out.println(customer);
    }

    public void createCustomer () {
        Customer customer = new Customer();
        customerRepository.createCustomer(customer);
        customerRepository.displayCustomers(customer);
        customerRepository.displayCustomerToBeClosed(1);
        try {
            System.out.println("Please enter id:");
            int id = Integer.parseInt(sc.nextLine());

            System.out.println("Please enter name:");
            String name = sc.nextLine();

            System.out.println("Please enter city:");
            String city = sc.nextLine();

            System.out.println("Please enter mobile number:");
            int mobileNo = Integer.parseInt(sc.nextLine());

            System.out.println("Please enter age:");
            int age = Integer.parseInt(sc.nextLine());

            customer.setId(id);
            customer.setAge(age);
            customer.setCity(city);
            customer.setName(name);
            customer.setMobileNo(mobileNo);
            customers.put(1, customer);

        }catch (Exception e){
            System.out.println("Invalid input type correct data");
        }
    }
    public void displayCustomers(){
       try {
            Set<Map.Entry<Integer, Customer>> entrySet = customers.entrySet();

            for (Map.Entry<Integer, Customer> customerEntry : entrySet) {
                System.out.println("Customer Info: " + customers);
            }

           } catch (Exception e) {
           System.out.println("Error occurred");
           }
        }
    }
