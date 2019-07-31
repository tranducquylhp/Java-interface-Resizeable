public class Shape {
    public String color = "green";
    public boolean fill = true;
    public Shape(){
    }

    public Shape(String color, boolean fill) {
        this.color = color;
        this.fill = fill;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getFill() {
        return this.fill;
    }

    public void setFill(boolean fill) {
        this.fill = fill;
    }

    @Override
    public String toString() {
        if (this.fill) {
            return "A Shape with color of " + this.color + " and filled";
        } else {
            return "A Shape with color of " + this.color + " and not filled";
        }
    }
}
