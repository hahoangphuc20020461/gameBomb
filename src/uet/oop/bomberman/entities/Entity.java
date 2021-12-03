package uet.oop.bomberman.entities;

import javafx.scene.SnapshotParameters;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import uet.oop.bomberman.graphics.Sprite;

import static uet.oop.bomberman.BombermanGame.entities;

public abstract class Entity {
    //Tọa độ X tính từ góc trái trên trong Canvas
    protected int x;

    //Tọa độ Y tính từ góc trái trên trong Canvas
    protected int y;

    protected Image img;

    protected Sprite sprite;

    protected boolean breakdown;

    //Khởi tạo đối tượng, chuyển từ tọa độ đơn vị sang tọa độ trong canvas
    public Entity( int xUnit, int yUnit, Image img) {
        this.x = xUnit * Sprite.SCALED_SIZE;
        this.y = yUnit * Sprite.SCALED_SIZE;
        this.img = img;
    }

    public Entity() {}

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Image getImg() {
        return img;
    }

    public void setImg(Image img) {
        this.img = img;
    }

    public void render(GraphicsContext gc) {
        gc.drawImage(img, x, y);
    }

    public boolean isBreakdown() {
        return breakdown;
    }

    public void setBreakdown(boolean breakdown) {
        this.breakdown = breakdown;
    }

    public boolean validate(int x, int y) {
        boolean b = true;
        if (x < 32 || x > 29 * 32) {
            b = false;
        } else if (y < 32 || y > 11*32) {
            b = false;
        }
        return b;
    }

    public Entity getAt(int x, int y) {
        if(!validate(x, y)) {
            return null;
        }

        for(int i = 0; i < entities.size(); i++) {
            if(entities.get(i).getX() == x && entities.get(i).getY() == y) {
                return entities.get(i);
            }
        }
        return null;
    }

    public abstract void update();

}
