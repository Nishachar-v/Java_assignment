import java.util.*;

class BookNotAvailableException extends Exception { public BookNotAvailableException(String msg){ super(msg);} }
class InvalidReturnException extends Exception { public InvalidReturnException(String msg){ super(msg);} }
class UserLimitExceededException extends Exception { public UserLimitExceededException(String msg){ super(msg);} }

class Library {
    Map<String, Boolean> books = new HashMap<>();
    int borrowedCount = 0;

    public Library() {
        books.put("Java", true);
        books.put("Python", false);
        books.put("C++", true);
    }

    public void borrowBook(String name) throws BookNotAvailableException, UserLimitExceededException {
        if (borrowedCount >= 5) throw new UserLimitExceededException("Borrowing limit exceeded!");
        if (!books.containsKey(name) || !books.get(name)) throw new BookNotAvailableException("Book not available!");
        books.put(name, false);
        borrowedCount++;
        System.out.println("Book borrowed: " + name);
    }

    public void returnBook(String name) throws InvalidReturnException {
        if (!books.containsKey(name) || books.get(name)) throw new InvalidReturnException("Invalid return!");
        books.put(name, true);
        borrowedCount--;
        System.out.println("Book returned: " + name);
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library lib = new Library();
        try {
            lib.borrowBook("Python");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}