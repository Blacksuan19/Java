public class Car {
    String model;
    String year;
    double price;
    Car() {
        model = "";
        year = "";
        price = 0.0;
    }
    public String getType() {
        return model;
    }
    public String getYear() {
        return year;
    }
    public double getPrice() {
        return price;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setYear(String year) {
        this.year = year;
    }
    public void setPrice(double price) {
    	if (price > 0) {
            this.price = price;
      }
    }
}