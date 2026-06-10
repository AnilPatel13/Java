package CoreJava.Module7;

import java.util.Objects;

class Laptop {
    String brand;
    int price;

    public String toString() {
        return "{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (!(o instanceof Laptop)) {
            return false;
        }

        Laptop other = (Laptop) o;

        return this.price == other.price &&
                this.brand.equals(other.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, price);
    }
}

public class ObjectClass {
    public static void main(String[] args) {
        Laptop a1 = new Laptop();
        a1.brand = "HP";
        a1.price = 50000;

        System.out.println(a1);
        System.out.println(a1.toString());

        Laptop a2 = new Laptop();
        a2.brand = "HP";
        a2.price = 50000;

        boolean b = a1.equals(a2);
        System.out.println(b);
    }
}