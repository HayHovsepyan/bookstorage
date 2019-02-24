package common;

public final class BookCreateParameter {
    private String name;

    private double price;

    public BookCreateParameter(String name,  double price) {
        this.name = name;

        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "BookCreateParameter{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
