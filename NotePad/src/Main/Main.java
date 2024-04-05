package Main;

import Controller.Controller;
import Model.Model;
import View.View;

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View View = new View(model);
        Controller controller = new Controller(model, View);
    }
}
