/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ADMIN.Bookdao;

import ADMIN.Models.Books;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BookManager {
    private List<Books> list;
    private final String pathFileToInput;
    private BookDataService service;

    public BookManager(String pathFileToInput) {
        this.pathFileToInput = pathFileToInput;
        this.service = new BookDataService();

        try {
            this.list = service.read(pathFileToInput);
        } catch (IOException ex) {
        ex.printStackTrace();
        }
    }

    public void sortByName(){
        Collections.sort(
        list,
         (s1, s2)->s1.getName().compareTo(s2.getName())
         );
    }
 public void sortById(){
     Collections.sort(
     list,
         (s1,s2)->Integer.compare(s1.getId(), s2.getId())
         );
 }

 public Books findById( int id){
     for( Books s: list){
         if(s.getId() == id){
         return s;
         }
     }
     return null;
 }
 //tìm sách bằng tên
 public Books  findByAuthor( String author){
     for ( Books s: list){
         if(s.getAuthor().equals(author)){
              return s;
         }
     }
         return null;
     }
 public void addBook(Scanner sc){
     list.add(new Books().input(sc));
 }
 public void editBook(Scanner sc){
     System.out.println("Enter id:");
     int id = sc.nextInt();
     sc.nextLine();
     Books book = findById(id);
     book.edit(sc);

 }
 public void deleteBook( Scanner sc){
     System.out.println("Enter ib book:");
     int id = sc.nextInt();
     sc.nextLine();
     Books book = findById(id);
     list.remove(book);

 }
 public void show() {
        for (Books book : list ) {
          System.out.println(book.getId()+book.getName()+book.getAuthor()+book.getLanguage()+book.getPrice()+book.getDate()) ;
}


 }
}