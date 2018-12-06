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
        System.out.println(bugatti.model + bugatti.year + " price is: $" + bugatti.price + " Million.");
        System.out.println(cad.model + cad.year + " price is: $" + cad.price + " thousand.\n");
        double bugDisc = bugatti.price * 0.05;
        double cadDisc = cad.price * 0.07;
        bugatti.setPrice(bugatti.price - bugDisc); // in mllion.
        cad.setPrice(cad.price - cadDisc); // in thousands.
        System.out.println(bugatti.model + bugatti.year + " price after 5% discount is: $" + String.format("%.2f", bugatti.price) + " Million."); // format to 2 decimal points.
        System.out.println(cad.model + cad.year + " price after 7% discount is: $" + cad.price + " thousand.");
    }
}