public class Fish extends Animal{
    private String colour;

    public Fish(String colour,String name, int age) {
        super(name, age);
        this.colour=colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public void eat() {
        System.out.println(" Fish eat chervi");

    }

    @Override
    public void liveplace() {
        System.out.println("Fish live in the water");

    }

}
