import java.util.ArrayList; 
import java.util.Scanner;   
import java.io.File;        
import java.io.FileWriter;
import java.io.IOException;

public class LBS_SA { 

    static ArrayList<String> books = new ArrayList<>();
    static final String FILE_NAME = "books.txt";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        loadBooksFromFile();

        int choice; 
        do {
            System.out.println("\n===== Library Menu =====");
            System.out.println("1. Add Book");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Display Available Books");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            // Check if input is actually an integer to prevent crashes
            
                choice = sc.nextInt();
                sc.nextLine(); 

                switch (choice) {
                    case 1:
                        System.out.print("Enter book name to add: ");
                        String addBook = sc.nextLine();
                        books.add(addBook);
                        System.out.println("Book added successfully.");
                        break;
                    case 2:
                        System.out.print("Enter book name to issue: ");
                        String issueBook = sc.nextLine();
                        if (books.remove(issueBook)) {
                            System.out.println("Book issued successfully.");
                        } else {
                            System.out.println("Book not available.");
                        }
                        break;
                    case 3:
                        System.out.print("Enter book name to return: ");
                        String returnBook = sc.nextLine();
                        books.add(returnBook);
                        System.out.println("Book returned successfully.");
                        break;
                    case 4:
                        if (books.isEmpty()) {
                            System.out.println("No books available.");
                        } else {
                            System.out.println("Available Books:");
                            for (String book : books) {
                                System.out.println("- " + book);
                            }
                        }
                        break;
                    case 5:
                        savaBooksToFile();
                        System.out.println("data saved.Exit program");
                        break;
                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            
        } while(choice !=5);
        
       sc.close();
        
        }
    
    static void loadBooksFromFile() {
        // Logic for reading from books.txt would go here
    	try{
    		File file =new File(FILE_NAME);
    		if(!file.exists()) return;
    		
    		
    	Scanner fileScanner = new Scanner(file);
    	while (fileScanner.hasNextLine()) {
    	books.add(fileScanner.nextLine());
    	}
    	fileScanner.close();
    	}
    	catch (Exception e) {
    		System.out.println("Error loading books");
    	}
    }
static void savaBooksToFile () {
	try {
		FileWriter writer=new FileWriter(FILE_NAME);
		for (String book:books) {
			writer.write(books+"\n");
		}
				writer.close();
			}
			catch(IOException e) {
				System.out.println("Error saving books" );
			}}}
			
		