package com.epam.rd.autotasks.figures;

class Triangle extends Figure{
    Point a;
    Point b;
    Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        return ((Math.abs((a.getX() - c.getX()) * (b.getY() - a.getY()) - (a.getX() - b.getX()) * (c.getY() - a.getY()))) / 2);
    }

    @Override
    public String pointsToString() {
        return a.toString() + b.toString() + c.toString();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public Point leftmostPoint() {
        if (Math.min(a.getX(), b.getX()) < c.getX()){
            if (a.getX() < b.getX()){
                return a;
            }
            else return b;
        }
        else return c;
    }
}
