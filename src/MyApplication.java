import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import models.Shape;
import models.Point;

public class MyApplication {
    public static void main(String[] args)throws FileNotFoundException {
        File file = new File("C:\\Users\\Дидар\\IdeaProjects\\assignment 1\\src\\source");
        Scanner sc = new Scanner(file);
        Shape shape =new Shape();

        while(sc.hasNextLine()){
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            Point point = new Point(x,y);
            shape.addPoint(point);
        }

        System.out.println(shape.calculatePerimeter());
    }
}
