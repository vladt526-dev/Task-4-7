class Book {
    String title;
    String author;
    boolean isAvailable;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }
}

class Library {
    private final java.util.List<Book> books = new java.util.ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void checkOutBook(String title) {
        for (Book b : books) {
            if (b.title.equals(title) && b.isAvailable) {
                b.isAvailable = false;
                System.out.println("Видано: " + b.title);
                return;
            }
        }
        System.out.println("Книгу не знайдено або вже видано.");
    }

    public void returnBook(String title) {
        for (Book b : books) {
            if (b.title.equals(title) && !b.isAvailable) {
                b.isAvailable = true;
                System.out.println("Повернено: " + b.title);
                return;
            }
        }
        System.out.println("Книгу не знайдено або вона вже у бібліотеці.");
    }

    public void showBooks() {
        for (Book b : books) {
            System.out.println(b.title + " — " + (b.isAvailable ? "доступна" : "видана"));
        }
    }

    public static void main(String[] args) {
        Library lib = new Library();
        Book b1 = new Book("Java Basics", "J. Smith");
        Book b2 = new Book("OOP Principles", "M. Brown");

        lib.addBook(b1);
        lib.addBook(b2);

        lib.showBooks();
        lib.checkOutBook("Java Basics");
        lib.showBooks();
        lib.returnBook("Java Basics");
        lib.showBooks();
    }
}

