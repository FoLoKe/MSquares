package Main;

import java.awt.*;

public class Controller {
    Graphics g;
    Mesh mesh = new Mesh(20 , 20);
    public Controller(Graphics g)
    {
        this.g = g;

        mesh.set(2,2);
        mesh.set(2,3);
        mesh.set(2,4);
        mesh.set(3,2);
        mesh.set(4,2);
        mesh.set(3,3);
        mesh.set(3,4);
        mesh.set(4,3);
        mesh.set(4,4);
    }

    public void render()
    {
        mesh.render(g);
    }
}
