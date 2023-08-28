package org.example.project;


import org.example.project.orders.OrderA;
import org.example.project.orders.OrderB;

public class MainRunner {
    public static void main(String[] args) {
        String orderA = OrderA.getOrder();
        String orderB = OrderB.getOrder();

        printOrder(orderA);
        printOrder(orderB);


    }

    public static void printOrder(String order){
        System.out.println(order);
    }
}
