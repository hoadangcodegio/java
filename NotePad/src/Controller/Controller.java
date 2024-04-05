package Controller;

import Model.Model;
import View.View;

public class Controller {
    private Model model;
    private View View;

    public Controller(Model model, View View) {
        this.model = model;
        this.View = View;

        setupEventHandlers();
    }

    private void setupEventHandlers() {
        View.display();
    }
}
