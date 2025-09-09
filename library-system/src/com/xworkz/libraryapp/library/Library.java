package com.xworkz.libraryapp.library;

import com.xworkz.libraryapp.book.Book;

public class Library {

    Book[] books=new Book[15];
    int index;

    public boolean addLibrary(Book book){
        boolean isValid=false;
        if(book !=null){
            books[index++]=book;
            isValid=true;
        }
        else {
            System.out.println("Invalid Details");
        }
        return isValid;
    }

    public void getBookdetails(){
        for (Book bookOne:books) {
            System.out.println("Book Id Is:" + bookOne.getBookId());
            System.out.println("Book Name Is:" + bookOne.getBookName());
            System.out.println("Book Author Name Is:" + bookOne.getBookAuthor());
            System.out.println("Book Price Is:" + bookOne.getBookPrice());
            System.out.println();
        }
    }
}
