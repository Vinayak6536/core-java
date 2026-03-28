package com.xworkz.libraryapp;

import com.xworkz.libraryapp.book.Book;
import com.xworkz.libraryapp.library.Library;

public class LibraryRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");
        Book book=new Book();
        book.setBookId(1);
        book.setBookName("Manasugalu");
        book.setBookAuthor("Darshan");
        book.setBookPrice(200.0);

        Book bookOne=new Book();
        bookOne.setBookId(13);
        bookOne.setBookName("Karnatak veera");
        bookOne.setBookAuthor("Bharat");
        bookOne.setBookPrice(170.0);

        Book bookTwo = new Book();
        bookTwo.setBookId(2);
        bookTwo.setBookName("Karunada");
        bookTwo.setBookAuthor("Puneeth");
        bookTwo.setBookPrice(180.0);

        Book bookThree = new Book();
        bookThree.setBookId(3);
        bookThree.setBookName("Kannada Siri");
        bookThree.setBookAuthor("Ramesh");
        bookThree.setBookPrice(150.0);

        Book bookFour = new Book();
        bookFour.setBookId(4);
        bookFour.setBookName("Hosa Belaku");
        bookFour.setBookAuthor("Suresh");
        bookFour.setBookPrice(220.0);

        Book bookFive = new Book();
        bookFive.setBookId(5);
        bookFive.setBookName("Moodala Mane");
        bookFive.setBookAuthor("Umesh");
        bookFive.setBookPrice(175.0);

        Book bookSix = new Book();
        bookSix.setBookId(6);
        bookSix.setBookName("Naada Geethe");
        bookSix.setBookAuthor("Anil");
        bookSix.setBookPrice(210.0);

        Book bookSeven = new Book();
        bookSeven.setBookId(7);
        bookSeven.setBookName("Bhavageethe");
        bookSeven.setBookAuthor("Ganesh");
        bookSeven.setBookPrice(190.0);

        Book bookEight = new Book();
        bookEight.setBookId(8);
        bookEight.setBookName("Prema Kavya");
        bookEight.setBookAuthor("Vijay");
        bookEight.setBookPrice(160.0);

        Book bookNine = new Book();
        bookNine.setBookId(9);
        bookNine.setBookName("Shiva Leele");
        bookNine.setBookAuthor("Ravi");
        bookNine.setBookPrice(230.0);

        Book bookTen = new Book();
        bookTen.setBookId(10);
        bookTen.setBookName("Sankranthi");
        bookTen.setBookAuthor("Kumar");
        bookTen.setBookPrice(195.0);

        Book bookEleven = new Book();
        bookEleven.setBookId(11);
        bookEleven.setBookName("Mallige");
        bookEleven.setBookAuthor("Harsha");
        bookEleven.setBookPrice(170.0);

        Book bookTwelve = new Book();
        bookTwelve.setBookId(12);
        bookTwelve.setBookName("Chandana");
        bookTwelve.setBookAuthor("Raghav");
        bookTwelve.setBookPrice(185.0);

        Book bookThirteen = new Book();
        bookThirteen.setBookId(13);
        bookThirteen.setBookName("Jeevana Saaga");
        bookThirteen.setBookAuthor("Madhav");
        bookThirteen.setBookPrice(205.0);

        Book bookFourteen = new Book();
        bookFourteen.setBookId(14);
        bookFourteen.setBookName("Beladingala Bale");
        bookFourteen.setBookAuthor("Shankar");
        bookFourteen.setBookPrice(215.0);

        Library library=new Library();
        library.addLibrary(book);
        library.addLibrary(bookOne);
        library.addLibrary(bookTwo);
        library.addLibrary(bookThree);
        library.addLibrary(bookFour);
        library.addLibrary(bookFive);
        library.addLibrary(bookSix);
        library.addLibrary(bookSeven);
        library.addLibrary(bookEight);
        library.addLibrary(bookNine);
        library.addLibrary(bookTen);
        library.addLibrary(bookEleven);
        library.addLibrary(bookTwelve);
        library.addLibrary(bookThirteen);
        library.addLibrary(bookFourteen);

        library.getBookdetails();

        System.out.println("Main Ended");

    }
}
