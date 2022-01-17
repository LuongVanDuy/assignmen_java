/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ADMIN.Bookdao;

import ADMIN.Models.Books;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

public class BookDataService {
    public List<Books> read(String path)throws IOException{
        List<Books> book = new ArrayList<>();
        Path pathFiletoRead = Paths.get(path);

        List<String> allLine = Files.readAllLines(pathFiletoRead);

        for ( int i = 0; i < allLine.size();++i){
            String line = allLine.get(i);
            String[] data = line.split(",");
            Books bk = new Books(Integer.parseInt(data[0]), data[1], data[2], data[3], data[4],data[5]);
            book.add(bk);
        }
        return book;
    }
    public void write(String path, List<Books>books) throws IOException{
        List<String> list = new ArrayList<>();

        for(int i = 0; i< books.size();++i){
        Books book = books.get(i);
        list.add(book.toString());
        }
        Path pathFiletoWrite = Paths.get(path);

        Files.write(pathFiletoWrite, list);


    }
}



