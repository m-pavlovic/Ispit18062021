package m_p_zad_3;

/*
expected output
Books of the author - Author{id=100, name='AUTHOR-1'}
Book{id=100, title='Book-1', author=Author{id=100, name='AUTHOR-1'}}
Book{id=101, title='Book-2', author=Author{id=100, name='AUTHOR-1'}}

Books of the author - Author{id=101, name='AUTHOR-2'}
Book{id=102, title='Book-3', author=Author{id=101, name='AUTHOR-2'}}
Book{id=103, title='Book-4', author=Author{id=101, name='AUTHOR-2'}}
Book{id=104, title='Book-5', author=Author{id=101, name='AUTHOR-2'}}
 */

public class Test {

    public static void main(String[] args) {

            Books books = new Books();

            Author author1 = new Author("AUTHOR-1");
            Author author2 = new Author("AUTHOR-2");

            Book book1 = new Book("Book-1", author1);
            Book book2 = new Book("Book-2", author1);
            Book book3 = new Book("Book-3", author2);
            Book book4 = new Book("Book-4", author2);
            Book book5 = new Book("Book-5", author2);

            books.addNewBook(book1);
            books.addNewBook(book2);
            books.addNewBook(book3);
            books.addNewBook(book4);
            books.addNewBook(book5);

            books.listAllBooks();

            System.out.println("\nBooks of the author - " + author1);
            books.listAllBooksOfAuthor(author1);

            System.out.println("\nBooks of the author - " + author2);
            books.listAllBooksOfAuthor(author2);
    }
}
