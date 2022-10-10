/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv21library;

import entity.Book;
import entity.History;
import entity.Reader;
import java.util.Scanner;

/**
 *
 * @author Melnikov
 */
public class App {
    public void run(){
        Scanner scanner = new Scanner(System.in);
        boolean repeat = true;
        do{
            System.out.println("Функции приложения:");
            System.out.println("0. Закрыть приложение");
            System.out.println("1. Добавить книгу");
            System.out.println("2. Добавить читателя");
            System.out.println("3. Выдать книгу");
            System.out.println("4. Вернуть книгу");
            System.out.println("5. Список книг");
            System.out.println("6. Список авторов");
            System.out.print("Выберите номер функции: ");
            int task = scanner.nextInt();
            scanner.nextLine();
            switch (task) {
                case 0:
                    repeat = false;
                    break;
                case 1:
                    System.out.println("1. Добавить книгу");
                    Book book = new Book();
                    
                    break;
                case 2:
                    System.out.println("2. Добавить читателя");
                    Reader reader = new Reader();
                    break;
                case 3:
                    System.out.println("3. Выдать книгу");
                    History history = new History();
                    break;
                case 4:
                    System.out.println("4. Вернуть книгу");
                    
                    break;
                case 5:
                    System.out.println("5. Список книг");
                    break;
                case 6:
                    System.out.println("6. Список авторов");
                    
                    break;
                default:
                    System.out.println("Выберите номер функции из списка!");
            }
        }while(repeat);
        System.out.println("Пока!");
    }
}
