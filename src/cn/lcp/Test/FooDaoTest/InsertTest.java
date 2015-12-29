package cn.lcp.Test.FooDaoTest;

import cn.lcp.bean.Foo;
import cn.lcp.connect.DbUtil;
import cn.lcp.dao.FooDao;
import com.bugull.mongo.BuguConnection;

/**
 * Created by lcp on 2015/12/27.
 * 插入操作
 */
public class InsertTest {
    private static DbUtil dbUtil= new DbUtil();
    public static void main(String[] args){
        BuguConnection connection = dbUtil.getConnect();
        System.out.print("建立连接");
        //创建Foo对象
        Foo foo = new Foo();
        //设置对象的值
        foo.setName("李翠萍");
        foo.setLevel(10);
        //
        FooDao dao = new FooDao();
        //往数据库写入值
        dao.insert(foo);
        String id = foo.getId();
        System.out.print(id);
        dbUtil.close(connection);
        System.out.print("关闭连接");
    }
}
