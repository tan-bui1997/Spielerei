import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Buch b = new Buch("Harry Potter", 17);

        try {
            b.setName("Anderes Buch");
            b.setPages(100);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(b.getName());
    }
}