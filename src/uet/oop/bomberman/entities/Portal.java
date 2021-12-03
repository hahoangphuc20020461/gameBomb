package uet.oop.bomberman.entities;

import javafx.scene.image.Image;
import uet.oop.bomberman.entities.item.SpeedUp;
import uet.oop.bomberman.graphics.Sprite;

import static uet.oop.bomberman.BombermanGame.listKill;
import static uet.oop.bomberman.BombermanGame.stillObjects;

public class Portal extends Entity{
    public static boolean isPortal = false;

    public Portal(int x, int y, Image img) {
        super(x, y, img);
    }


    @Override
    public void update() {

    }
}
