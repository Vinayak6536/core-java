package com.xworkz.theatreapp;

import com.xworkz.theatreapp.movie.Movie;
import com.xworkz.theatreapp.theatre.Theatre;

public class TheatreRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");
        Movie movie=new Movie();
        movie.setMovieId(1);
        movie.setMovieName("Rajahuli");
        movie.setHero("Yash");
        movie.setTheatreName("Veeresh Theatre");

        Movie movieOne = new Movie();
        movieOne.setMovieId(10);
        movieOne.setMovieName("Interstellar");
        movieOne.setHero("Matthew McConaughey");
        movieOne.setTheatreName("Galaxy Theatre");

        Movie movieTwo = new Movie();
        movieTwo.setMovieId(2);
        movieTwo.setMovieName("KGF");
        movieTwo.setHero("Yash");
        movieTwo.setTheatreName("Central Cinema");

        Movie movieThree = new Movie();
        movieThree.setMovieId(3);
        movieThree.setMovieName("Bahubali");
        movieThree.setHero("Prabhas");
        movieThree.setTheatreName("Galaxy Theatre");

        Movie movieFour = new Movie();
        movieFour.setMovieId(4);
        movieFour.setMovieName("Dangal");
        movieFour.setHero("Aamir Khan");
        movieFour.setTheatreName("PVR Cinemas");

        Movie movieFive = new Movie();
        movieFive.setMovieId(5);
        movieFive.setMovieName("3 Idiots");
        movieFive.setHero("Aamir Khan");
        movieFive.setTheatreName("INOX");

        Movie movieSix = new Movie();
        movieSix.setMovieId(6);
        movieSix.setMovieName("Spider-Man");
        movieSix.setHero("Tom Holland");
        movieSix.setTheatreName("IMAX");

        Movie movieSeven = new Movie();
        movieSeven.setMovieId(7);
        movieSeven.setMovieName("Avengers");
        movieSeven.setHero("Robert Downey Jr.");
        movieSeven.setTheatreName("Cinepolis");

        Movie movieEight = new Movie();
        movieEight.setMovieId(8);
        movieEight.setMovieName("Titanic");
        movieEight.setHero("Leonardo DiCaprio");
        movieEight.setTheatreName("Liberty Theatre");

        Movie movieNine = new Movie();
        movieNine.setMovieId(9);
        movieNine.setMovieName("Inception");
        movieNine.setHero("Leonardo DiCaprio");
        movieNine.setTheatreName("PVR Cinemas");

        Theatre theatre=new Theatre();
        theatre.addMovie(movie);
        theatre.addMovie(movieOne);
        theatre.addMovie(movieTwo);
        theatre.addMovie(movieThree);
        theatre.addMovie(movieFour);
        theatre.addMovie(movieFive);
        theatre.addMovie(movieSix);
        theatre.addMovie(movieSeven);
        theatre.addMovie(movieEight);
        theatre.addMovie(movieNine);

        theatre.getMovieDetails();

        System.out.println("Main Ended");


    }
}
