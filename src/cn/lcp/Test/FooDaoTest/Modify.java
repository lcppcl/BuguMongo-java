package cn.lcp.Test.FooDaoTest;

import cn.lcp.bean.Foo;
import cn.lcp.connect.DbUtil;
import cn.lcp.dao.FooDao;
import com.bugull.mongo.BuguConnection;

/**
 * Created by lcp on 2015/12/28.
 * 修改
 */
public class Modify {
    private static DbUtil dbUtil = new DbUtil();

    public static void main(String[] args) {
        BuguConnection connection = dbUtil.getConnect();
        System.out.print("建立连接");

        FooDao dao = new FooDao();
        //先查找出来
        Foo foo = dao.query().is("name", "hahha").result();
        //修改值
        dao.set(foo,"name","hahhalop");
        dao.inc(foo,"level",88);
        System.out.print(foo);

        //dao.update().inc(foo, "level", 10);  //把foo的level值增加10

        dbUtil.close(connection);
        System.out.print("关闭连接");
    }
}
