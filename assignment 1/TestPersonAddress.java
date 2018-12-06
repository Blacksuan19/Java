public class TestPersonAddress {
    public static void main(String[] args) {
        PersonAddress ali = new PersonAddress();
        PersonAddress ahmed = new PersonAddress();
        PersonAddress abubakar = new PersonAddress();
        ali.firstName = "Ali";
        ali.lastName = "Mohammed";
        ali.email = "ali1999@gmail.com";
        ali.phone = 0113341211;
        ahmed.firstName = "Ahmed";
        ahmed.lastName = "Ali";
        ahmed.email = "hamody69@gmail.com";
        ahmed.phone = 012315161;
        abubakar.firstName = "Abubakar";
        abubakar.lastName = "Kaki";
        abubakar.email = "akakixyz@gmail.com";
        abubakar.phone = 0153147412;
        System.out.println("First address:\nName: " + ali.getFirst() + " " + ali.getLast() + "\nEmail: " + ali.getEmail() + "\nPhone Number: " + ali.getPhone());
        System.out.println("\nSecond address:\nName: " + ahmed.getFirst() + " " + ahmed.getLast() + "\nEmail: " + ahmed.getEmail() + "\nPhone Number: " + ahmed.getPhone());
        System.out.println("\nThird address:\nName: " + abubakar.getFirst() + " " + abubakar.getLast() + "\nEmail: " + abubakar.getEmail() + "\nPhone Number: " + abubakar.getPhone());
        // change emails
        ali.setEmail("amoh00@hotmail.com");
        ahmed.setEmail("ahmd@outlook.com");
        abubakar.setEmail("ak69@yahoo.com");
        ali.setPhone(0112233445);
        ahmed.setPhone(0124245376);
        abubakar.setPhone(0115436232);
        System.out.println("\nNew " + ali.getFirst() + " information \nEmail: " + ali.getEmail() + " \nPhone Number: " + ali.getPhone());
        System.out.println("\nNew " + ahmed.getFirst() + " information \nEmail: " + ahmed.getEmail() + " \nPhone Number: " + ahmed.getPhone());
        System.out.println("\nNew " + abubakar.getFirst() + " information \nEmail: " + abubakar.getEmail() + " \nPhone Number: " + abubakar.getPhone());
        System.out.println("\n" + ali.getFirst() + " and " + abubakar.getFirst() + ali.Equal(ali.getFirst(),abubakar.getFirst()));
    }
}