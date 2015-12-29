package cn.lcp.Test.FooDao2Test;

import cn.lcp.connect.DbUtil;
import cn.lcp.dao.FooDao2;
import com.bugull.mongo.BuguConnection;

/**
 * Created by lcp on 2015/12/28.
 */
public class FooDao2Test {
    private static DbUtil dbUtil = new DbUtil();
    public static void main(String[] args){
        BuguConnection connection = dbUtil.getConnect();
        System.out.print("建立连接");
        FooDao2 fooDao2 = new FooDao2();
        //double d = fooDao2.max("level");
        dbUtil.close(connection);
        System.out.print("关闭连接");
    }
}
