/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;
import entity.Book;
import entity.History;
import entity.Reader;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Scanner;
/**
 *
 * @author pupil
 */
public class HistoryManager {
    private final Scanner scanner;
    private final ReaderManager readerManager;
    private final BookManager bookManager;

    public HistoryManager() {
        scanner = new Scanner(System.in);
        readerManager = new ReaderManager();
        bookManager = new BookManager();
    }

    public History takeOnBook(Reader[] readers, Book[] books){
        //из списка читателей выбрать номер читателя
        //из списка книг выбрать номер книги
        //инициировать поля History
        //добавить дату выдачи книги
        System.out.println("Список читателей:");
        readerManager.printListReaders(readers);
        System.out.print("Выберите номер читателя из списка:");
        int numberReader = scanner.nextInt(); scanner.nextLine();

        System.out.println("Список книг:");
        bookManager.printListBooks(books);
        System.out.print("Выберите номер книги из списка:");
        int numberBook = scanner.nextInt(); scanner.nextLine();
        History history = new History();
        history.setBook(books[numberBook - 1]);
        history.setReader(readers[numberReader - 1]);
        history.setTakeOnBook(new GregorianCalendar().getTime());
        return history;
    }
    public void printListReadingBooks(History[] histories) {
        SimpleDateFormat sdf =new SimpleDateFormat("dd.MM.yyyy");
        for(int i = 0; i < histories.length; i++) {
            History history = histories[i];
            if(history.getReturnBook() == null)
            System.out.printf("%d. %s. Выдана: %s. Читает: %s %s. Телефон: %s%n"
            ,i+1
            ,history.getBook().getTitle()
            ,sdf.format(history.getTakeOnBook())
            ,history.getReader().getFirstname()
            ,history.getReader().getLastname()
            ,history.getReader().getPhone()
            );
        }
    }

    public History[] returnBook(History[] histories) {
       
        //выбрать номер истории с выданной книги из списка
        //прописать дату возврата в историю
        System.out.println("Список выбранных книг:");
        this.printListReadingBooks(histories);
        System.out.println("Выберите номер возвращаемой книги из списка:");
        int numberHistory = scanner.nextInt();scanner.nextLine();
        histories[numberHistory - 1].setReturnBook(new GregorianCalendar().getTime());
        return histories;
    }
}

