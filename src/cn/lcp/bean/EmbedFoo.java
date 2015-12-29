package cn.lcp.bean;

/**
 * Created by lcp on 2015/12/27.
 */


/*普通的javaBean，不需要@Entity注解，不需要实现BuguEntity接口，也不需要@Id*/
public class EmbedFoo {
    private float x;
    private int y;

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
