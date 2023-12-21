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

    private double[] getSides(){
        int size = points.size();
        double[] sidesOfShape = new double[size];
        for(int i = 0 ; i< size;i++ ){
             if(i==size-1){
                 sidesOfShape[i]=points.get(i).getDistance(points.get(0));
                 break;
             }
             sidesOfShape[i]=points.get(i).getDistance(points.get(i+1));
         }
        return sidesOfShape;
    }
    public double calculatePerimeter(){
        int numOfSides=getSides().length;
        double perimeter=0;
        for(int i = 0 ; i<numOfSides;i++){
            perimeter+=getSides()[i];
        }
        return perimeter;
    }
    public double getLongestSide(){
        int numOfSides=getSides().length;
        double max = getSides()[0];
        for(int i = 0 ; i<numOfSides;i++){
            if(max<getSides()[i]){
                max=getSides()[i];
            }
        }
        return max;
    }
    public double getAverage(){
        int numOfSides=getSides().length;
        return calculatePerimeter()/numOfSides;
    }





}
