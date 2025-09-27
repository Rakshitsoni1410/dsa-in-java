import java.util.*;
abstract class Publication {
    abstract void displayInfo();
}
class Book extends Publication {
    String title, author;
    final String isbn;
    int qty;
    Book(String t, String a, String i, int q) {
        title = t;
        author = a;
        isbn = i;
        qty = Math.max(q, 0);
    }
    void displayInfo() {
        System.out.println(title + " | " + author + " | " + isbn + " | Qty:" + qty);
    }
}
class ReferenceBook extends Book {
    String cat;
    ReferenceBook(String t, String a, String i, int q, String c) {
        super(t, a, i, q);
        cat = c;
    }
    void displayInfo() {
        System.out.println(cat + " Ref: " + title + " | " + author + " | " + isbn + " | Qty:" + qty);
    }
}
interface Borrowable {
    void borrow();
    void giveBack();
}
class Library {
    static ArrayList<Book> list = new ArrayList<>();
    static int total = 0;
    static void addBook(Book b) {
        list.add(b);
        total += b.qty;
    }
    static void addBook(Book b, int c) {
        if (c > 0) {
            b.qty += c;
            total += c;
        }
    }
    static void search(String k) {
        for (Book b : list)
            if (b.title.equalsIgnoreCase(k) || b.author.equalsIgnoreCase(k)) {
                b.displayInfo();
                return;
            }
        System.out.println("Not found");
    }
}
public class LibraryApp {
    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);
        for (;;) {
            System.out.println("1.Add 2.AddRef 3.Search 4.Show 5.Borrow 6.Exit");
            int ch = s.nextInt();
            s.nextLine();
            if (ch == 1) {
                System.out.print("Title: ");
                String t = s.nextLine();
                System.out.print("Author: ");
                String au = s.nextLine();
                System.out.print("ISBN: ");
                String i = s.nextLine();
                System.out.print("Qty: ");
                int q = s.nextInt();
                Library.addBook(new Book(t, au, i, q));
            } else if (ch == 2) {
                System.out.print("Title: ");
                String t = s.nextLine();
                System.out.print("Author: ");
                String au = s.nextLine();
                System.out.print("ISBN: ");
                String i = s.nextLine();
                System.out.print("Qty: ");
                int q = s.nextInt();
                s.nextLine();
                System.out.print("Category: ");
                String c = s.nextLine();
                Library.addBook(new ReferenceBook(t, au, i, q, c));
            } else if (ch == 3) {
                System.out.print("Key: ");
                Library.search(s.nextLine());
            } else if (ch == 4) {
                for (Book b : Library.list) b.displayInfo();
                System.out.println("Total:" + Library.total);
            } else if (ch == 5) {
                System.out.print("ISBN: ");
                String id = s.nextLine();
                Book found = null;
                for (Book b : Library.list)
                    if (b.isbn.equals(id)) {
                        found = b;
                        break;
                    }
                if (found != null && found.qty > 0) {
                    final Book fb = found;
                    Borrowable br = new Borrowable() {
                        public void borrow() {
                            fb.qty--;
                            System.out.println("Borrowed " + fb.title);
                        }
                        public void giveBack() {
                            fb.qty++;
                            System.out.println("Returned " + fb.title);
                        }
                    };
                    br.borrow();
                    br.giveBack();
                } else System.out.println("Not available");
            } else if (ch == 6) break;
        }
        s.close();
    }
}
