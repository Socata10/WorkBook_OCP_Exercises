package Chapter4_5.Ex10;

public class Book {
    private final String ISBN;
    private final String title;
    private final String author;

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    @Override
    public int hashCode() {
        return ISBN.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Book other)) {
            return false;
        }
        return this.ISBN.equals(other.ISBN);
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN='" + ISBN + '\'' +
                ", title='" + title + '\''+
                "}";

    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }
}

