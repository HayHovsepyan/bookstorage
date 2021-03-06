package entity;

public class Book {
    int id;

    String name;

    String title;

    double price;

    Author author;

    public Book(final int id, final String name, final String title, final double price, final Author author) {

        this.id = id;

        this.name = name;

        this.price = price;

        this.author = author;

    }

    public int getId() {

        return id;

    }

    public void setId(int id) {

        this.id = id;

    }

    public String getName() {

        return name;

    }
    public void setName(String name) {

        this.name = name;

    }

    public double getPrice() {

        return price;

    }

    public void setPrice(double price) {

        this.price = price;

    }

    public Author getAuthor() {

        return author;

    }

    public void setAuthor(Author author) {

        this.author = author;

    }
}
