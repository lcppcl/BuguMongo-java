package cn.lcp.Model;

import cn.lcp.connect.DbUtil;
import com.bugull.mongo.BuguConnection;

/**
 * Created by lcp on 2015/12/28.
 * 模板
 */
public class Model {
    private static DbUtil dbUtil = new DbUtil();

    public static void main(String[] args) {
        BuguConnection connection = dbUtil.getConnect();
        System.out.print("建立连接");


        dbUtil.close(connection);
        System.out.print("关闭连接");
    }
}
