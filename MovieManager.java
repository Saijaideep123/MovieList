package com.design.app;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;


public class MovieManager {
	private List<Movie> movies;
    private static final String filePath = "E:\\java\\data.txt"; 
	public MovieManager() {
        movies = new ArrayList<>();
        
        loadMovies();
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
        
    }

    public void clearMovies() {
        movies.clear();
        
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public int getMovieId() {
        return movies.size()+1;
    }

    public void loadMovies() {
    	try {
    	 FileInputStream fileIn = new FileInputStream(filePath);
         ObjectInputStream objectIn = new ObjectInputStream(fileIn);
        List<Movie> movies = (List<Movie>) objectIn.readObject();
        System.out.println(movies);
         objectIn.close();
         fileIn.close();
                
     } catch (Exception e) {
         e.printStackTrace();
     }
    }

    public void saveMovies() {
    
    	try {
            FileOutputStream fileOut = new FileOutputStream(filePath);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
         objectOut.writeObject(movies);
            objectOut.close();
            fileOut.close();
            
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    }
    public void deleteAllMovies() {
        movies.clear();
        saveMovies();
        
    }
}
	


