/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.Car;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class CarProvider {
    public Car createCar(){
        Scanner scanner = new Scanner(System.in);
        Car car = new Car();
        System.out.println("Марка: ");
        car.setMarka(scanner.nextLine());
        System.out.println("Модель: ");
        car.setModel(scanner.nextLine());
        System.out.println("Год выпуска: ");
        car.setYear(new Integer(scanner.nextLine()));
        System.out.println("Стоимость: ");
        car.setPrice(new Integer(scanner.nextLine()));
        System.out.println("Количество экземпляров: ");
        car.setQuantity(Integer.parseInt(scanner.nextLine()));
        return car;
    }
}