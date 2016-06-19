package joshi.astroidz.main;

import org.lwjgl.opengl.GL11;
import static org.lwjgl.opengl.GL11.glVertex2f;

public class DisplayObject {
    
  
    private final int mode;
    private final float[] xList;
    private final float[] yList;

    private float velocityX = 0.0f;
    private float velocityY = 0.0f;

    private float positionX = 0.0f;
    private float positionY = 0.0f;

    public DisplayObject(int mode, float[] x, float[] y) {

        if (x.length != y.length) {
            throw new IllegalArgumentException("There must be the same amount of x and y coordinates.");
        }

        this.mode = mode;
        this.xList = x;
        this.yList = y;
    }

    public void draw() {
        GL11.glBegin(mode);
        for (int i = 0; i < xList.length; i++) {
            glVertex2f(positionX + xList[i], positionY + yList[i]);
        }
        for (int i = 0; i < xList.length; i++) {
            glVertex2f(positionX + xList[i] + 2.0f, positionY + yList[i]);
        }
        for (int i = 0; i < xList.length; i++) {
            glVertex2f(positionX + xList[i], positionY + yList[i] + 2.0f);
        }
        for (int i = 0; i < xList.length; i++) {
            glVertex2f(positionX + xList[i] + 2.0f, positionY + yList[i] + 2.0f);
        }
        GL11.glEnd();
    }

    public void addSpeed(float deltaX, float deltaY) {
        velocityX += deltaX;
        velocityY += deltaY;
    }

    public void setSpeed(float veloX, float veloY) {
        velocityX = veloX;
        velocityY = veloX;
    }

    public void moveBySpeed() {
        move(velocityX, velocityY);
    }

    public void move(float deltaX, float deltaY) {
        positionX += deltaX;
        positionY += deltaY;
        
        if (positionX < -2.0f) {
            positionX += 2.0f;
        }
        if (positionX > 0.0f) {
            positionX -= 2.0f;
        }

        if (positionY < -2.0f) {
            positionY += 2.0f;
        }
        if (positionY > 0.0f) {
            positionY -= 2.0f;
        }
    }
}
