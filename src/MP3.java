public class MP3 extends Item {
    public String duration;


    MP3(String name, String description, String ID, int price, String duration) {
        super(name, description, ID, price);
        this.duration = duration;
    }

    @Override
    public void showInfo() {
        System.out.println("Name: " + name + "\nDescription: " + getDescription() + "\nID: " + ID + "\nPrice: " + price + "\nDuration: " + duration);
    }
}
