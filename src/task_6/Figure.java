package task_6;

public abstract class Figure {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double calculateArea(); // нереализованный метод подсчета площади фигуры

    public abstract double calculatePerimeter(); // нереализованный метод подсчета периметра фигуры
}
