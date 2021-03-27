package com.company;

public class Main {

    public static void main(String[] args) {

        // 1. Circle area
        Circle circle = new Circle(8);
        System.out.println("Area of circle: " + circle.getArea());
        System.out.println();

        // 2. Count of objects
        ObjectCounter counter1 = new ObjectCounter();
        ObjectCounter counter2 = new ObjectCounter();
        ObjectCounter counter3 = new ObjectCounter();
        System.out.println("Count of objects: " + counter1.getObjectCount());
        System.out.println();

        // 3. Car
        System.out.println("\tCar info");
        Car car = new Car(60);
        car.startTheEngine();
        car.info();
        System.out.println();

        // 4. Fractions
        Fractions firstFractions = new Fractions(12, (short) 5);
        Fractions secondFractions = new Fractions(21, (short) 24);

        System.out.println("\tFractions");
        System.out.print("Sum: ");
        Fractions resultFraction = firstFractions.addition(secondFractions);
        System.out.println(resultFraction.toString());
        System.out.print("Difference: ");
        resultFraction = firstFractions.subtraction(secondFractions);
        System.out.println(resultFraction.toString());
        System.out.print("Share: ");
        resultFraction = firstFractions.division(secondFractions);
        System.out.println(resultFraction.toString());
        System.out.print("Product: ");
        resultFraction = firstFractions.multiplication(secondFractions);
        System.out.println(resultFraction.toString());
        System.out.print("Equal: ");
        firstFractions.equals(secondFractions);

        // 5. Money
        Money firstMoney = new Money(12, (byte) 25);
        Money secondMoney = new Money(2, (byte) 50);

        System.out.println();
        System.out.println("\tMoney");
        System.out.print("Sum: ");
        Money resultMoney = firstMoney.additionOfSums(secondMoney);
        System.out.println(resultMoney.toString());
        System.out.print("Difference: ");
        resultMoney = firstMoney.subtractionOfSums(secondMoney);
        System.out.println(resultMoney.toString());
        System.out.print("Share: ");
        resultMoney = firstMoney.divisionOfSums(secondMoney);
        System.out.println(resultMoney.toString());
        System.out.print("The share of division into fractional expressions: ");
        resultMoney = firstMoney.divisionByNum(2.1f);
        System.out.println(resultMoney.toString());
        System.out.print("The product of multiplication by a number: ");
        resultMoney = firstMoney.multiplicationByNum(3.7f);
        System.out.println(resultMoney.toString());
        System.out.print("Equal: ");
        firstMoney.equals(secondMoney);
    }
}
