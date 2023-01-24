package product;

public class Pants extends Product{

    private int waist;
    private int length;


    public Pants(double price, String color, String brand, int waist, int length) {
        super(price, color, brand);
        this.waist = waist;
        this.length = length;
    }


    public int getWaist() {
        return this.waist;
    }

    public void setWaist(int waist) {
        this.waist = waist;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void wear() {
        System.out.println("The " + waist + " " + length + " pants look good on you.");
    }

    @Override
    public void fold() {
        super.fold();
        System.out.println("Hold pants upright");
        System.out.println("Fold one leg over the other");
        System.out.println("Fold pants from bottom in thirds");
    }

    @Override
    public String toString() {
        return "PANTS: " + this.waist + " " + this.length + " " + super.getBrand() + " " + super.getColor() + " " + super.getPrice();
    }
}
