package BasicShapes;

public class ThreePlaneShape {

    private int mHeight;
    private int mGround;

   public ThreePlaneShape(int height, int ground) {
        this.mGround = ground;
        this.mHeight = height;
    }

    public int getmHeight() {
        return mHeight;
    }

    public void setmHeight(int mHeight) {
        this.mHeight = mHeight;
    }

    public int getmGround() {
        return mGround;
    }

    public void setmGround(int mGround) {
        this.mGround = mGround;
    }
}
