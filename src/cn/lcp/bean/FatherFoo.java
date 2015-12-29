package cn.lcp.bean;

import com.bugull.mongo.BuguEntity;
import com.bugull.mongo.annotations.Entity;
import com.bugull.mongo.annotations.Id;
import com.bugull.mongo.annotations.IdType;
import com.bugull.mongo.annotations.Ref;

import java.util.Date;

/**
 * Created by lcp on 2015/12/27.
 */
/*name是在数据库collection的映射的名字*/
@Entity(name = "fatherFoo")
public class FatherFoo implements BuguEntity{
    /*在数据库中的id自动增长，从1000开始增长*/
    @Id(type = IdType.AUTO_INCREASE,start = 1000)
    private String id;
    private Date date;
    @Ref
    private FatherFoo fatherFoo;

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public FatherFoo getFatherFoo() {
        return fatherFoo;
    }

    public void setFatherFoo(FatherFoo fatherFoo) {
        this.fatherFoo = fatherFoo;
    }
}
