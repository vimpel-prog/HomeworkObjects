package pro.sky.java.course1.homeworkObjects;

public class Main {
    public static void main(String[] args) {
        Author tolstoy = new Author("Lev", "Tolstoy");
        Author gogol = new Author("Nikolay", "Gogol");
        Book Viy = new Book("Viy", gogol, 1835);
        Book annaKarenina = new Book("Anna Karenina", tolstoy, 1875);
        annaKarenina.setPublicationYear(1877);
        System.out.println(annaKarenina.getPublicationYear());
    }
}