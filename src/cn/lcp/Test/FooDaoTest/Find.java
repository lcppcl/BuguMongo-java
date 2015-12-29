package cn.lcp.Test.FooDaoTest;

import cn.lcp.bean.Foo;
import cn.lcp.connect.DbUtil;
import cn.lcp.dao.FooDao;
import com.bugull.mongo.BuguConnection;

/**
 * Created by lcp on 2015/12/28.
 * 查找
 */
public class Find {
    private static DbUtil dbUtil = new DbUtil();

    public static void main(String[] args) {
        BuguConnection connection = dbUtil.getConnect();
        System.out.print("建立连接");

        FooDao fooDao = new FooDao();
        Foo foo = fooDao.findOne("568095ac897146a4d4ced9a9");
        System.out.print(foo);

        dbUtil.close(connection);
        System.out.print("关闭连接");
    }
}
