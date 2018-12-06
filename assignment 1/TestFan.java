public class TestFan {
    public static void main(String[] args) {
        Fan hall = new Fan();
        Fan kitchen = new Fan();
        // assiging values to both fans
        hall.setSpeed(3);
        hall.setRadius(10);
        hall.setColor("yellow");
        hall.setStatus(true);
        kitchen.setSpeed(2);
        kitchen.setRadius(5);
        kitchen.setColor("blue");
        kitchen.setStatus(false);
        System.out.println("Hall fan status: " + hall.toString());
        System.out.println("Kitchen fan status: " + kitchen.toString());

    }
}