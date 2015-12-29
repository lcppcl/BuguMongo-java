package cn.lcp.index.Lucene;

import com.bugull.mongo.BuguEntity;
import com.bugull.mongo.annotations.Entity;
import com.bugull.mongo.annotations.Id;
import com.bugull.mongo.lucene.annotations.IndexRefBy;

/**
 * Created by lcp on 2015/12/28.
 */
@Entity(name="father")
public class FatherFoo implements BuguEntity {
    @Id
    private String id;
    @IndexRefBy(value=Foo.class, analyze=true)
    private String name;

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
