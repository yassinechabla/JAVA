package TME7;

public class TestFigure {
    public static void main(String[] args) {
        Figure[] figures = new Figure[10];
        figures[0] = new Rectangle(2, 5);
        figures[1] = new Carre(5);
        figures[2] = new Ellipse(2.5, 2.6);
        figures[3] = new Cercle(3.9);
    for (Figure figure : figures) {
        if (figure!=null)
            System.out.println(figure);
   
    }
    }
}
