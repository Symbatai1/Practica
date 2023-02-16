public class Wolf extends Animal {
    private String type;

    public Wolf(String type,String name, int age) {
        super(name, age);
        this.type=type;
    }

    @Override
    public void eat() {
        System.out.println("Wolf eat meat");

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void liveplace() {
        System.out.println("Live in the forest");

    }
}
