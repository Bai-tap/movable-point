package point;

public class MovablePoint extends Point {
    private float xSpeed = 0;
    private float ySpeed = 0;

    public MovablePoint() {

    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public MovablePoint move() {
        super.setX(super.getX() + xSpeed);
        super.setY(super.getY() + ySpeed);
        return this;
    }

    @Override
    public String toString() {
        return super.toString() + "\tSpeed: (" + xSpeed + "," + ySpeed + ")";
    }
}
