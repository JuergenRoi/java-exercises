package Library;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private String name;
    private String memberId;
    private List<String> borrowedBooks;

    public Member() {
        this.borrowedBooks = new ArrayList<>();
    }

    public Member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
        this.borrowedBooks = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public String getMemberId() {
        return memberId;
    }

    public List<String> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook(String isbn) {
        borrowedBooks.add(isbn);
    }

    public void returnBook(String isbn) {
        borrowedBooks.remove(isbn);
    }

    public boolean hasBorrowed(String isbn) {
        return borrowedBooks.contains(isbn);
    }

    @Override
    public String toString() {
        return "Member{name=" + name + ", memberId=" + memberId + ", borrowedBooks=" + borrowedBooks + "}";
    }
}
