package ModelElements;
import java.util.ArrayList;
import java.util.List;
import Service1.Point3D;
public class Poligon {
    public List<Point3D> points = new ArrayList<Point3D>();

    public Poligon(Point3D point) {
        points.add(point);
    }
}
