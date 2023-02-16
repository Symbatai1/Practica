public class Cow extends Animal {
    private String breed;

    public Cow(String breed,String name, int age) {
        super(name, age);
        this.breed=breed;
    }

    @Override
    public void eat() {
        System.out.println(" Cow eat grass");

    }

    @Override
    public void liveplace() {
        System.out.println("Cow live at home");

    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

}
