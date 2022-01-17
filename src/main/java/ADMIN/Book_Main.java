/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ADMIN;
import ADMIN.Models.Books;
import ADMIN.Bookdao.BookDataService;
import ADMIN.Bookdao.BookManager;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Book_Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)throws IOException {
        BookDataService service = new BookDataService();
        List<Books> book = service.read("./resources/Book-input.txt");
        String choose = null;
        boolean exit = false;
        BookManager bookmanager = new BookManager("./resources/Book-input.txt");

        showMenu();
        while (true) {
            choose = scanner.nextLine();
            switch(choose){
                case"1":
            System.out.println("Add a new book");
            bookmanager.addBook(scanner);
            break;
                case"2":
            System.out.println("Delete a book");
            bookmanager.deleteBook(scanner);
            break;
                case"3":
            System.out.println("Sort by book title");
            bookmanager.sortByName();
            break;
                case"4":
            System.out.println("Sort by ID ");
            bookmanager.sortById();
            break;
                case"5":
            System.out.println("Filter by author name ");
            bookmanager.findByAuthor(choose);
            break;
                case"6":
            System.out.println("Filter by price  ");
            bookmanager.findById(0);
            break;
                case"7":
            System.out.println("All books  ");
            bookmanager.show();
            break;
                case"8":
            System.out.println("edit books  ");
            bookmanager.editBook(scanner);
            break;
                case"0":
            System.out.println("exited!");
                exit = true;
                break;
                default:
                System.out.println("invalid! please choose action in below menu:");
                break;
            }
            if (exit) {
                break;

        }
            showMenu();
   }

}
    public static void showMenu(){
        System.out.println("+-----------Menu------------+");
        System.out.println("|1. Add a new book          |");
        System.out.println("|2. Delete a book           |");
        System.out.println("|3. Sort by book title      |");
        System.out.println("|4. Sort by ID              |");
        System.out.println("|5. Filter by author name   |");
        System.out.println("|6. Filter by price         |");
        System.out.println("|7. All books               |");
        System.out.println("|8. edit book               |");
        System.out.println("|0. Exit                    |");
        System.out.println("+-Please Chose: ------------+");


    }

}
