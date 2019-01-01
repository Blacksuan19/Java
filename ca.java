public class ca{
    private String make;
    private int speed;
    public ca(String newMake){
            make = newMake;
            speed = 0;
    } 
    public void acclerate(int s){
        speed += s;
    }
    public int getSpeed(){
        return speed;
    }
}