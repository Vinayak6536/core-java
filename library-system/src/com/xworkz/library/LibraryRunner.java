package com.xworkz.library;

import com.xworkz.library.bookdetails.Book;
import com.xworkz.library.library.Library;

public class LibraryRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");
        Book book=new Book();
        book.setBookId(1);
        book.setBookName("Java");
        book.setNoOfPages(100);
        book.setAuthorName("Herbert Schidt");
        book.setPrice(300.00);
        book.setLanguage("Eng");

        Library library=new Library();
        boolean information=library.createLibraryDetails(book);
        if(information){
            library.getLibraryInfo();
        }

        System.out.println("Main Ended");
    }
}
