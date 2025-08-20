package com.xworkz.library.validation;

import com.xworkz.library.bookdetails.Book;

public class BookValidation {
    Book book;
    public boolean createBookValidator(Book book){
        boolean bookIdValid=false;
        boolean bookNameValid=false;
        boolean noOfPagesValid=false;
        boolean authorNameValid=false;
        boolean priceValid=false;
        boolean languageValid=false;
        boolean isValid=false;
        if(book.getBookId()!=0){
            bookIdValid=true;
        }
        else {
            System.out.println("Invalid Book Id");
        }

        if(book.getBookName()!=null && !book.getBookName().isEmpty()){
            bookNameValid=true;
        }
        else {
            System.out.println("Invalid Book Name");
        }

        if(book.getNoOfPages()!=0){
            noOfPagesValid=true;
        }
        else {
            System.out.println("Invalid No Of Pages");
        }

        if(book.getAuthorName()!=null && !book.getAuthorName().isEmpty()){
            authorNameValid=true;
        }
        else {
            System.out.println("Invalid Author Name");
            }

        if(book.getPrice()!=0){
            priceValid=true;
        }
        else {
            System.out.println("Invalid Price");
        }

        if(book.getLanguage()!=null && !book.getLanguage().isEmpty()){
            languageValid=true;
        }
        else {
            System.out.println("Invalid Language");
        }

        if(bookIdValid && bookNameValid && noOfPagesValid && authorNameValid && priceValid && languageValid){
            isValid=true;
        }
        return isValid;
    }
}
