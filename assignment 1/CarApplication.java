public class CarApplication {
    public static void main(String[] args) {
        Car bugatti = new Car();
        Car cad = new Car();
        bugatti.setModel("Bugatti Shiron ");
        bugatti.setYear("2018");
        bugatti.setPrice(3.28); // in mllion.
        cad.setModel("Cadillac X24 ");
        cad.setYear("2019");
        cad.setPrice(35); // in thousands.
        System.out.println(bugatti.model + bugatti.getYear() + " price is: $" + bugatti.getPrice() + " Million.");
        System.out.println(cad.model + cad.getYear() + " price is: $" + cad.getPrice() + " thousand.\n");
        double bugDisc = bugatti.getPrice() * 0.05;
        double cadDisc = cad.getPrice() * 0.07;
        bugatti.setPrice(bugatti.getPrice() - bugDisc); // in mllion.
        cad.setPrice(cad.getPrice() - cadDisc); // in thousands.
        System.out.println(bugatti.model + bugatti.getYear() + " price after 5% discount is: $" + String.format("%.2f", bugatti.getPrice()) + " Million."); // format to 2 decimal points.
        System.out.println(cad.model + cad.getYear() + " price after 7% discount is: $" + cad.getPrice() + " thousand.");
    }
}