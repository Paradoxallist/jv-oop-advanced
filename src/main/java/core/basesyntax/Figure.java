package core.basesyntax;

public abstract class Figure implements AreaCalculator, FigureDrawer {
    private Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
