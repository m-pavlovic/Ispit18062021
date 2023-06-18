package m_p_zad_3;

public class Book {

    private int id;
    private static int cnt = 100;
    private String title;
    private Author author;

    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
        this.id = cnt++;
    }


    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author=" + author +
                '}';
    }


    public Object getAuthor() {
        return this.author;
    }
}
