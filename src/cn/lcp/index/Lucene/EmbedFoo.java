package cn.lcp.index.Lucene;

import com.bugull.mongo.lucene.annotations.IndexEmbedBy;

/**
 * Created by lcp on 2015/12/28.
 */
public class EmbedFoo {
    @IndexEmbedBy(value=Foo.class)
    private float x;
    @IndexEmbedBy(value=Foo.class)
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
