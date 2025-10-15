class ComplexNumber{
    double real;
    double imaginary;
    public ComplexNumber(double real,double imaginary){
        this.real=real;
        this.imaginary=imaginary;
    }
    public void display(){
        System.out.println(this.real+"i"+this.imaginary);
    }
   
    
}
class Calculator{
    
    public int add(int a,int b){
        
        return a+b;
    }
    public ComplexNumber add(ComplexNumber c1, ComplexNumber c2){
        double realSum = c1.real + c2.real;
        double imaginarySum = c1.imaginary + c2.imaginary;
        return new ComplexNumber(realSum, imaginarySum);
    }
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Adding integers
        int sumInt = calc.add(5, 10);
        System.out.println("Sum of integers: " + sumInt);

        // Adding complex numbers
        ComplexNumber c1 = new ComplexNumber(2.5, 3.5);
        ComplexNumber c2 = new ComplexNumber(1.5, 4.5);
        ComplexNumber sumComplex = calc.add(c1, c2);

        System.out.print("Sum of complex numbers: ");
        sumComplex.display();
    }
}