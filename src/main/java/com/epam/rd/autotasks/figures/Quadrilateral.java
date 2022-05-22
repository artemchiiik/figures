package com.epam.rd.autotasks.figures;

class Quadrilateral extends Figure {
    Point a;
    Point b;
    Point c;
    Point d;

    public Quadrilateral(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public double area() {
        return ((Math.abs((a.getX() - c.getX()) * (b.getY() - a.getY()) - (a.getX() - b.getX()) * (c.getY() - a.getY()))) / 2) + ((Math.abs((a.getX() - c.getX()) * (d.getY() - a.getY()) - (a.getX() - d.getX()) * (c.getY() - a.getY()))) / 2);
    }

    @Override
    public String pointsToString() {
        return a.toString() + b.toString() + c.toString() + d.toString();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public Point leftmostPoint() {
        if (Math.min(a.getX(), b.getX()) < Math.min(c.getX(), d.getX())){
            if (a.getX() < b.getX()){
                return a;
            }
            else return b;
        }
        else {
            if (c.getX() < d.getX()){
                return c;
            }
            else return d;
        }
    }
}
