package secondTask;

public class Product {
    private String name;
    private int price;
    private boolean isAlcohol;

    public Product(){
    }

    public Product(String name, int price, boolean isAlcohol) {
        this.name = name;
        this.price = price;
        this.isAlcohol = isAlcohol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isAlcohol() {
        return isAlcohol;
    }

    public void setAlcohol(boolean alcohol) {
        isAlcohol = alcohol;
    }

}
