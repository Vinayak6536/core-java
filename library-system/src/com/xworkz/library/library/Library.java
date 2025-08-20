package com.xworkz.library.library;

import com.xworkz.library.bookdetails.Book;
import com.xworkz.library.validation.BookValidation;

public class Library {
    Book book;
    BookValidation bookValidation;
    public boolean createLibraryDetails(Book book){
        boolean isDetailsValid=false;
        BookValidation bookValidation=new BookValidation();
        boolean valid=bookValidation.createBookValidator(book);
        if(valid){
            this.book=book;
            isDetailsValid=true;
        }
        return isDetailsValid;
    }

    public void getLibraryInfo(){
        System.out.println("Book Id:"+book.getBookId());
        System.out.println("Book Name:"+book.getBookName());
        System.out.println("No Of Pages:"+book.getNoOfPages());
        System.out.println("Author Name"+book.getAuthorName());
        System.out.println("Book Price"+book.getPrice());
        System.out.println("Book Language:"+book.getLanguage());
    }

}
