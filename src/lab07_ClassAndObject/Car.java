package lab07_ClassAndObject;

public class Car {

    public String brand;
    public String model;
    public int year;
    public String color;
    public double price;

    public String toString() {
        return year + " " + brand + " " + model + " " + color + ", $" + price;
    }
    public void setInfo(String brand, String model, int year, String color, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
    }

    public void drive(){
        System.out.println("Drive " + brand + " " + model);
    }
}


/*

Create a custom class for car objects.
1. In each car objects, user should be able to store the brand,
model, year, color, price information of car
2. Add a function named setInfo that allows the user to be able
to set all the fields of the car
3. Add a function named drive that can print the brand, and
model of the car that’s bring driven
4. Add a function that allows the user to be able to display each
objects’ brand, model, color, year and price of the car object
when the it’s passed in the print statement

 */