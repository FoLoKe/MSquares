package Main;

import java.awt.*;

import static java.lang.Float.max;
import static java.lang.Math.abs;

public class Mesh {
    private boolean[][] mesh;
    private final int sizeX;
    private final int sizeY;
    public Mesh(int sizeX, int sizeY)
    {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.mesh = new boolean[sizeX][sizeX];

    }

    public void render(Graphics g)
    {
        for (int x = 0; x < sizeX - 1; x++)
            for(int y = 0; y < sizeY - 1; y++)
            {
                evaluate(g, x, y);
                if(mesh[x][y])
                    g.setColor(Color.green);
                else
                    g.setColor(Color.red);
                g.drawOval(x*16-2, y*16-2, 3, 3);
            }
    }

    public void set(int x, int y)
    {
        if (mesh[x][y])
            mesh[x][y] = false;
        else
            mesh[x][y] = true;
    }

    public void evaluate(Graphics g, int x, int y)
    {
        boolean lu = mesh[x][y];
        boolean ld = mesh[x][y + 1];
        boolean ru = mesh[x + 1][y];
        boolean rd = mesh[x + 1][y + 1];
        int c1, c2,c3, c4;
        if (lu)
            c1 = 1;
        else
            c1 = 0;

        if (ld)
            c2 = 2;
        else
            c2 = 0;

        if (ru)
            c3 = 4;
        else
            c3 =0;

        if (rd)
            c4 = 8;
        else
            c4 = 0;

        int cs = c1 + c2 + c3 + c4;

        g.setColor(Color.BLUE);
        switch (cs) {
            case 1:
                g.drawLine(x*16, y * 16 + 8, x * 16 + 8, y * 16);
                break;
            case 2:
                g.drawLine(x*16, y * 16 - 8 + 16, x * 16 + 8, y * 16 + 16);
                break;
            case 3:
                g.drawLine(x*16 + 8, y * 16, x * 16 + 8, y * 16 + 16);
                break;
        }




    }


}
