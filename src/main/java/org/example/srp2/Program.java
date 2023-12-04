package org.example.srp2;

public class Program {

    /**
     * TODO: Переработать структуру приложения Order, приложение должно соответствовать
     *  принципу SRP
     * @param args
     */

    public static void main(String[] args) {
        Order order = new Order();
        SaveToFile.saveToJson(order);
    }
}
