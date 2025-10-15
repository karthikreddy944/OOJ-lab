class Car{
    String make;
    String model;
    int year;

    public Car(String make,String model,int year){
        this.make=make;
        this.model=model;
        this.year=year;
    }
    public void displayInfo(){
        System.out.println("The Manufacturer of the Car: "+this.make);
        System.out.println("The Model of the Car: "+this.model);
        System.out.println("Manufacter Year: "+this.year);
    }

    public static void main(String arr[]){
        Car[] cars = new Car[5];
        cars[0] = new Car("Toyota", "Camry", 2020);
        cars[1] = new Car("Honda", "Civic", 2018);
        cars[2] = new Car("Ford", "Mustang", 2021);
        cars[3] = new Car("Tesla", "Model 3", 2022);
        cars[4] = new Car("Chevrolet", "Impala", 2019);

        for(Car car:cars){
            car.displayInfo();
        }
        cars[1]=null;
        cars[2]=null;

        System.gc();
        System.out.println("Garbage collector is requested");
    }
}