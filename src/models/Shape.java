package models;
import java.util.ArrayList;
public class Shape {

    private ArrayList<Point> points;
    public Shape(){
        points=new ArrayList<>();
    }
    public void addPoint(Point point){
        points.add(point);
    }
    public double calculatePerimeter(){
        return 0;
    }




}
