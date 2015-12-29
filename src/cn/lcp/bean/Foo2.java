package cn.lcp.bean;

import com.bugull.mongo.SimpleEntity;
import com.bugull.mongo.annotations.Entity;

import java.util.SimpleTimeZone;

/**
 * Created by lcp on 2015/12/27.
 */
/*BuguEntity接口的实现可以是自己实现BuguEntity接口，可以继承SimpleEntity。SimpleEntity是一个抽象类，他自己有一个id属性，*/
@Entity
public class Foo2 extends SimpleEntity {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
