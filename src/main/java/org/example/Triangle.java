package org.example;

import static java.lang.Math.sqrt;

public class Triangle implements Shape{

    private final double a;
    private final double b;
    private final double c;

    public Triangle(double a, double b, double c)
    {
        if(a + b <= c || a + c <= b || b + c <= a)
        {
            throw new IllegalArgumentException("Не является  треугольником");
        }
        if(a<=0 || b<=0)
        {
            throw new IllegalArgumentException();
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        double s = getPerimeter()/2;
        return sqrt(s*(s-a)*(s-b)*(s-c));
    }

    @Override
    public double getPerimeter() {
        return a+b+c;
    }
}
