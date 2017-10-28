package design_patterns.behavioral.bridge;

class Line extends Shape {
    public Line(DrawProgram drawProgram) {
        super(drawProgram);
    }

    public String draw() {
        return drawProgram.drawLine();
    }
}