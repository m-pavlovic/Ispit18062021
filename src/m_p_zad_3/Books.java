package m_p_zad_3;

import java.util.ArrayList;

public class Books {

    private ArrayList<Book> books;


    public Books() {
        this.books = new ArrayList<>();
    }

    public void addNewBook(Book book) {
        this.books.add(book);
    }

    public void listAllBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void listAllBooksOfAuthor(Author author1) {
        for (Book book : books) {
            if (book.getAuthor().equals(author1)) {
                System.out.println(book);
            }
        }
    }
}
