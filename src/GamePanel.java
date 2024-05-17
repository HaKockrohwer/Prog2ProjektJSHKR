
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URL;

public class GamePanel extends JPanel {

    private Image backgroundImage;

    public GamePanel() {
        setPreferredSize(new Dimension(800, 600));
        loadBackgroundImage("C:\\Users\\Shepp\\OneDrive\\Desktop\\Prog 2\\Bilder für Clickit");
    }

    private void loadBackgroundImage(String imagePath) {
        try {
            URL imageUrl = getClass().getResource(imagePath);
            backgroundImage = new ImageIcon(imageUrl).getImage();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (backgroundImage != null) {
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        }

    }


}