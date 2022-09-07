import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class Panel extends JPanel {
    int x, y, type, tSize, mSize, size;
    int[][] map;
    Color color;

    public Panel(int size, int tSize, int mSize) {
        this.tSize = tSize;
        this.mSize = mSize;
        this.setBounds(0, 0, size, size);
        this.setBackground(Color.BLACK);
    }

    public void paint(Graphics g) {
        for (int i = 0; i < mSize; i++) {
            for (int j = 0; j < mSize; j++) {
                if (map[i][j] == 0) {

                } else if (map[i][j] == 2) {
                    drawSnake(i, j, g);

                    System.out.println("I: " + i);
                    System.out.println("J: " + j);
                    System.out.println("Type: " + map[i][j]);
                    System.out.println("X Pos: " + (i * tSize));
                    System.out.println("Y Pos: " + (j * tSize));
                } else if (map[i][j] == 1) {
                    drawSnake(i, j, g);

                    System.out.println("I: " + i);
                    System.out.println("J: " + j);
                    System.out.println("Type: " + map[i][j]);
                    System.out.println("X Pos: " + (i * tSize));
                    System.out.println("Y Pos: " + (j * tSize));
                } else if (map[i][j] == 3) {
                    drawApple(i, j, g);

                    System.out.println("I: " + i);
                    System.out.println("J: " + j);
                    System.out.println("Type: " + map[i][j]);
                    System.out.println("X Pos: " + (i * tSize));
                    System.out.println("Y Pos: " + (j * tSize));
                }
            }
        }

        g.setColor(color);
        g.fillRect(x * tSize, y * tSize, tSize, tSize);
    }

    void drawApple(int x, int y, Graphics g) {
        g.setColor(Color.red);
        g.fillRect(x * tSize, y * tSize, tSize, tSize);
    }

    void drawSnake(int x, int y, Graphics g) {
        g.setColor(Color.white);
        g.fillRect(x * tSize, y * tSize, tSize, tSize);
    }
}
