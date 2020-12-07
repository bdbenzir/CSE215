package com.company;

public class Point {

    private double x;
    private double y;

    public Point(double x, double y) {
        setX(x);
        setY(y);
    }
    public Point(double n) {
        this(n, n);
    }
    public Point() {
        this(0, 0);
    }
    public Point(Point p) {
        this(p.getX(), p.getY());
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public double distance(Point p) {
        double dx = this.getX()-p.getX();
        double dy = this.getY()-p.getY();
        return Math.sqrt(dx*dx + dy*dy);
    }
    public String toString() {
        return ("< " + getX() + " ; " + getY() + " >");
    }
}