import javax.swing.*;

public class Snake {
    int size = 450;
    Frame frame = new Frame(size, size, "Snake Game");
    JPanel panel = new JPanel();
    JLabel score = new JLabel();
    int map[][];
    int mSize = 10;
    int tSize = 20; // Tile Size

    public Snake() {
        onLoad();
    }

    public void onLoad() {
        initMap();
        frame.add(panel);
        frame.pack();

        panel.setBounds(0, 0, size, size);
    }

    void initMap() {
        map = new int[mSize][mSize];
        for (int i = 0; i < mSize; i++) {
            for (int j = 0; j < mSize; j++) {
                map[i][j] = 0;
            }
        }
    }
}
