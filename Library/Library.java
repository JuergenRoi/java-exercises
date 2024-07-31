package Library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Member> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void registerMember(Member member) {
        members.add(member);
    }

    public Book findByIsbn(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }

        return null;
    }

    public Member findByMemberById(String id) {
        for (Member member : members) {
            if (member.getMemberId().equals(id)) {
                return member;
            }
        }

        return null;
    }

    public void lendBook(String isbn, String id) {
        Book bookToLend = findByIsbn(isbn);
        Member member = findByMemberById(id);

        if (bookToLend != null && member != null && bookToLend.isAvailable()) {
            bookToLend.setAvailable(false);
            member.borrowBook(isbn);
            System.out.println("Book with ISBN " + isbn + " has been lent to member " + id);
        } else {
            System.out.println("Unable to lend the book. Either the book is unavailable or the member does not exist.");
        }
    }

    public void returnBook(String isbn, String id) {
        Book bookToReturn = findByIsbn(isbn);
        Member member = findByMemberById(id);

        if (bookToReturn != null && member != null && member.hasBorrowed(isbn)) {
            bookToReturn.setAvailable(true);
            member.returnBook(isbn);        
            System.out.println("Book with ISBN " + isbn + " has been returned by member " + id);
        } else {
            System.out.println("Unable to return the book. Either the book is unavailable or the member does not exist.");
        }
    }

    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("1984", "George Orwell", "123456789", true));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", "987654321", true));
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", "192837465", true));

        library.registerMember(new Member("Alice", "001"));
        library.registerMember(new Member("Bob", "002"));
        library.registerMember(new Member("Charlie", "003"));

        library.lendBook("123456789", "001");
        library.lendBook("987654321", "002");
        library.lendBook("192837465", "003");

        library.returnBook("123456789", "001");
        library.returnBook("987654321", "002");

        library.lendBook("192837465", "001");
        library.lendBook("987654321", "003");

        library.returnBook("192837465", "001");
        library.returnBook("987654321", "003");
    }
}