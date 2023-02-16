public class Main {
    public static void main(String[] args) {
        Cow cow = new Cow("Golshtinskaya", "Slava", 20);
        cow.eat();
        System.out.println(cow.getBreed() + " ," + cow.getName() + "," + cow.getAge() + ";");


        Wolf wolf = new Wolf("Mammle wolf", "Seryi", 12);

        System.out.println(wolf.getType()+","+wolf.getName()+ "," +wolf.getAge()+";");
        wolf.liveplace();

        Fish fish=new Fish("Golden","Sloki",3);
        fish.eat();
        System.out.println(fish.getColour()+","+fish.getName()+","
        +fish.getAge()+";");





    }
}