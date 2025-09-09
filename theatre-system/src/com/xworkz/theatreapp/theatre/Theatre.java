package com.xworkz.theatreapp.theatre;

import com.xworkz.theatreapp.movie.Movie;

public class Theatre {
    Movie[] movies=new Movie[10];
    int index;

    public boolean addMovie(Movie m){
        boolean isValid=false;
        if(m != null){
            movies[index++]=m;
            isValid=true;
        }
        else {
            System.out.println("Invalid Details");
        }
        return isValid;
    }

public void getMovieDetails(){
        for (Movie movie:movies){
            System.out.println("Movie Id Is:"+movie.getMovieId());
            System.out.println("Movie Name Is:"+movie.getMovieName());
            System.out.println("Movie Hero Is:"+movie.getHero());
            System.out.println("Theatre Name Is:"+movie.getTheatreName());
            System.out.println();
        }
}
}
