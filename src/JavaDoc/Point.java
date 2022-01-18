package JavaDoc;

/**
 * The Point class represents a point in 2D space. This is a second sentence.
 *
 *
 *
 * @author tugbayalcin
 * @version 1.0
 */

public class Point // basit bir pojo class'imiz olsun (simple point class da denebilir)
{
    /**
     * x represents the x coordinate of a (x,y) coordinate pair for 2D space. This is a second sentence.
     */
    private int x; // class'a ozgu private tamşimlanmis fieald'larimiz olsun
    private int y; // class'a ozgu private tamşimlanmis fieald'larimiz olsun

    /**
     * Explicit value constructor for Point. Accepts whats needed for 2D space (2 ints).
     *
     * @param x
     * @param y
     */
    public Point(int x, int y) // parametreli constructor
    {
        this.x = x;
        this.y = y;
    }

    public Point() // parametresiz constructor
    {
        x=0;
        y=0;
    }

    // variable'larim private oldugu icin getter ve setter methodlarini olusturalim
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // toString methodunu override edelim
    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
