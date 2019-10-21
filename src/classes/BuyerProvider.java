/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.Buyer;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class BuyerProvider {
    public Buyer createBuyer(){
        Scanner scanner = new Scanner(System.in);
        Buyer buyer = new Buyer();
        System.out.println("Имя клиента: ");
        buyer.setName(scanner.nextLine());
        System.out.println("Фамилия клиента: ");
        buyer.setLastname(scanner.nextLine());
        System.out.println("Электронная почта: ");
        buyer.setEmail(scanner.nextLine());
        System.out.println("Количество денег: ");
        buyer.setMoney(Integer.parseInt(scanner.nextLine()));
        return buyer;
        
    }
    
}