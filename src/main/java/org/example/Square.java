package org.example;

public class Square extends Rectangle{
    private double a;
    public Square(double a){
        super(a, a);
        this.a=a;
    }

    @Override
    public double getArea()
    {
        return a*a;
    }

    @Override
    public double getPerimeter()
    {
        return a*4;
    }

}
