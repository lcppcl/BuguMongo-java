package cn.lcp.connect;

import com.bugull.mongo.BuguConnection;

/**
 * Created by lcp on 2015/12/26.
 */
/*
     数据库建立连接工具类
 */
public class DbUtil {

    private static String host = "127.0.0.1";
    private static int port = 27017;
    private static String database = "new_lcp_test";

    //建立连接
    public static BuguConnection getConnect(){
        BuguConnection conn = BuguConnection.getInstance();
        conn.connect(host,port,database);
        return conn;
    }

    //关闭连接
    public void close(BuguConnection conn){
        if (conn != null){
            conn.close();
        }
    }
}
