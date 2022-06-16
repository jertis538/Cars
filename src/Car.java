public class Car {
    String color;
    String model;
    String name;

    public Car() {}

    public Car(String myName, String myColor, String myModel){
        name = myName;
        color = myColor;
        model = myModel;
    }

    public void showInfo(){
        System.out.println(name + " " + model + " " + color);
    }
}
