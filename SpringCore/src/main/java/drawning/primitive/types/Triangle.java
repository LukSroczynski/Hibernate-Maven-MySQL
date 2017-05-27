package drawning.primitive.types;

/**
 * Created by Lukasz S. on 27.05.2017.
 */
public class Triangle {

    private String type;
    private int height;

    public void drawWithoutHeight() {
        System.out.println("Drawning triangle... of Type: " + getType());
    }

    public void drawWithHeight() {
        System.out.println("Drawning triangle... of Type: " + getType() + " that have height of " + getHeight());
    }

    public Triangle(String type) {
        this.type = type;
    }

    public Triangle(String type, int height) {
        this.type = type;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
