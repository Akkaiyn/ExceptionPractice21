package secondTask;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("John", 19);
        Product bread = new Product("Black bread", 1, false);
        Product pivo = new Product("Pivo", 2, true);
        Product[] products = {bread, pivo};
        try {
            if (pivo.isAlcohol() == true && person.getAge() < 21 || bread.isAlcohol() == true  ){
                throw new OurException("It's not avaible cause of low in USA");
            }

                System.out.println("Common price is: " + pivo.getPrice() + bread.getPrice());

        } catch (OurException o){
            System.out.println(o.getMessage());
        }
    }
}
