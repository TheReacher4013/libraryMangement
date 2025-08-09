import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<User> users;

    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println(book.getTitle() + " added to the library.");
    }

    public void addUser(User user) {
        users.add(user);
        System.out.println("User " + user.getName() + " added to the library.");
    }

    public Book findBookById(int bookId) {
        for (Book b : books) {
            if (b.getId() == bookId)
                return b;
        }
        return null;
    }

    public User findUserById(int userId) {
        for (User u : users) {
            if (u.getId() == userId)
                return u;
        }
        return null;
    }

    public void issueBook(int bookId, int userId) {
        Book book = findBookById(bookId);
        User user = findUserById(userId);
        if (book != null && user != null) {
            user.issueBook(book);
        } else {
            System.out.println("Invalid book or user ID.");
        }
    }

    public void returnBook(int bookId, int userId) {
        Book book = findBookById(bookId);
        User user = findUserById(userId);
        if (book != null && user != null) {
            user.returnBook(book);
        } else {
            System.out.println("Invalid book or user ID.");
        }
    }

    public void showAllBooks() {
        for (Book b : books) {
            System.out.println(b);
        }
    }
}
