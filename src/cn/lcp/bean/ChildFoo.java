package cn.lcp.bean;

import com.bugull.mongo.BuguEntity;
import com.bugull.mongo.annotations.Entity;
import com.bugull.mongo.annotations.Id;

import java.util.List;

/**
 * Created by lcp on 2015/12/27.
 */
/*name是在数据库collection的映射的名字*/
@Entity(name = "childFoo")
public class ChildFoo implements BuguEntity {
    @Id
    private String id;
    private List<String> list;

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }
}
