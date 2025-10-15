package Chapter4_5.Ex10;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("1234567890", "Java Programming", "John Doe");
        Book book2 = new Book("1234567890", "Advanced Java", "Jane Smith");
        Book book3 = new Book("0987654321", "Python Programming", "Alice Johnson");

        System.out.println("book1.equals(book2): " + book1.equals(book2)); // true, same ISBN
        System.out.println("book1.equals(book3): " + book1.equals(book3)); // false, different ISBN

        System.out.println("book1.hashCode(): " + book1.hashCode());
        System.out.println("book2.hashCode(): " + book2.hashCode());
    }
}

