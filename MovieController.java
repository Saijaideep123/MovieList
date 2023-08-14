package com.design.app;

import java.util.Scanner;

public class MovieController {
	private MovieManager manager;
	private Scanner scanner;

	
	public MovieController(){
		manager=new MovieManager();
		scanner = new Scanner(System.in);
		
	}
	public void start()
	{
		displayMenu();
	}
	private void displayMenu()
	{
		
	        int choice;

	        do {
	            System.out.println("Menu:");
	            System.out.println("1. Add Movie");
	            System.out.println("2. Delete All Movies");
	            System.out.println("3. list of all Movies");
	            System.out.println("4. Get Movie Id");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                
	                    Movie newMovie = setMovieDetails();
	                    manager.addMovie(newMovie);
	                    manager.saveMovies();
	                    System.out.println("Movie added!");
	                    break;
	                

	                case 2:
	                    manager.deleteAllMovies();
	                    manager.saveMovies();
	                    System.out.println("All movies deleted!");
	                    break;
	                case 3:
	                	listMovies();
	                	break;
	                case 4:
	                	System.out.println("Current Movie Id:"+manager.getMovieId());
	                	break;

	                case 5:
	                    System.out.println("Exiting...");
	                    return ;

	                default:
	                    System.out.println("Invalid choice.");
	                    break;
	            }
	        } while (choice != 5);
	    }
	
	public void listMovies() {
		System.out.println("Movie List");
		for(Movie movie:manager.getMovies()) {
			System.out.println(movie);
		}
	}
	  private Movie setMovieDetails()
	  {
		 
		  System.out.println("Enter the id");
		  
      	int id=scanner.nextInt();
          System.out.print("Enter movie name: ");
          String name = scanner.next();
          System.out.print("Enter movie year: ");
          int year = scanner.nextInt();
          System.out.print("Enter movie genre: ");
          String genre = scanner.next();
		return new Movie( id,name,year,genre);
		
		  
	  }
	}
	


