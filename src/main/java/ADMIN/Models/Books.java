/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ADMIN.Models;

import java.util.Scanner;

public class Books {
    private int id;
    private String name;
    private String author;
    private String language;
    private String price;
    private String date;

    //constructer
    public Books(){


}

    public Books(int id, String name, String author, String language, String price, String date) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.language = language;
        this.price = price;
        this.date = date;
    }
    //them
    public Books input(Scanner sc){
        System.out.println("Enter Book id: ");
        int id = sc.nextInt();
        sc.nextLine();
        //
        System.out.println("Enter Book name: ");
        String name = sc.nextLine();
        //
        System.out.println("Enter author:");
        String author = sc.nextLine();
        //
        System.out.println("Enter Language:");
        String language = sc.nextLine();
        //
        System.out.println("Enter price: ");
        String price = sc.nextLine();
        //
        System.out.println("Enter Date: ");
        String date = sc.nextLine();

        return new Books(id, name, author, language, price, date);
    }

    public void edit(Scanner sc){
        System.err.println("Enter new name: ");
        this.name = sc.nextLine();
        System.out.println("Enter new author:");
        this.author = sc.nextLine();
        System.out.println("Enter new language:");
        this.language = sc.nextLine();
        System.out.println("enter new price:");
        this.price = sc.nextLine();
        System.err.println("Enter new date:");
        this.date= sc.nextLine();

    }
//getter setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    //toString

    @Override
    public String toString() {
        return "Books{" + "id=" + id + ", name=" + name + ", author=" + author + ", language=" + language + ", price=" + price + ", date=" + date + '}';
    }

}
