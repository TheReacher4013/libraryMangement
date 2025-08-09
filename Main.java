public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding Books
        library.addBook(new Book(1, "Java Basics", "John Doe"));
        library.addBook(new Book(2, "OOP Concepts", "Jane Smith"));
        library.addBook(new Book(3, "Data Structures", "Mark Brown"));

        // Adding Users
        library.addUser(new User(101, "Alice"));
        library.addUser(new User(102, "Bob"));

        System.out.println("\n--- All Books in Library ---");
        library.showAllBooks();

        System.out.println("\n--- Issuing Books ---");
        library.issueBook(1, 101);
        library.issueBook(2, 102);
        library.issueBook(1, 102); 

        System.out.println("\n--- Returning Books ---");
        library.returnBook(1, 101);
        library.returnBook(3, 102); 

        System.out.println("\n--- Final Book List ---");
        library.showAllBooks();
    }
}
