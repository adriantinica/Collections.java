import java.util.ArrayList;
import java.util.List;

public class CollectionsOopEx {

    public static void main(String[] args) {
        Product pizza = new Food("Pizza", 100.00, 300, "grams");
        Product cola = new Drink("Coca Cola", 30.00, 500, "ml");
        Product appleJuice = new Drink ("Apple juice", 25.00,200,"ml");
        Product salad = new Food("Caesar salad", 200.00, 175, "grams");
        Product lasagna = new Food("Lasagna", 120.00, 300, "grams");

        //System.out.println(pizza);
        //System.out.println(cola);

        List<Object> items = new ArrayList<>();
        
        System.out.println("Initial List size: " + items.size());
        items.add(0, pizza);
        items.add(1,cola);
        items.add(appleJuice);
        items.add(salad);
        items.add(2, lasagna);
        System.out.println("List size: " + items.size());

        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i));
        }

        items.remove(salad);
        System.out.println("List size after remove:" + salad + " ="+ items.size());




    }
}



abstract class Product{
    String name;
    Double price;


    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Product [name= " + name + ", price= " + price + "]";
    }

    

    

}

class Food extends Product {
    private int weight;
    private String weightType;

    public Food(String name, Double price, int weight, String weightType) {
        super(name, price);
        this.weight = weight;
        this.weightType = weightType;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getWeightType() {
        return weightType;
    }

    public void setWeightType(String weightType) {
        this.weightType = weightType;
    }

    @Override
    public String toString() {
        return "Food [name= " + getName() + ", price= " + getPrice() + ", weight=" + weight + " " + weightType + "]";
    }
}




class Drink extends Product {
    private int volume;
    private String volumeType;

    public Drink(String name, Double price, int volume, String volumeType) {
        super(name, price);
        this.volume = volume;
        this.volumeType = volumeType;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getVolumeType() {
        return volumeType;
    }

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    @Override
    public String toString() {
        return "Drink  [name= " + getName() + ", price= " + getPrice() + ", weight=" + volume + " " + volumeType + "]";
    }
}