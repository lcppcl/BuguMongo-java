package cn.lcp.Test.FooDaoTest;

import cn.lcp.connect.DbUtil;
import cn.lcp.dao.FooDao;
import com.bugull.mongo.BuguConnection;
import com.mongodb.WriteResult;

/**
 * Created by lcp on 2015/12/28.
 * 删除操作
 */
public class DropTest {
    private static DbUtil dbUtil= new DbUtil();
    public static void main(String[] args){
        BuguConnection connection = dbUtil.getConnect();
        System.out.print("建立连接");
        FooDao dao = new FooDao();
        //删除整个集合
        //dao.drop();
        //按某个id删除
        WriteResult result = dao.remove("568090e78971f7ed23f8db3b");
        if (result != null){
            System.out.print("删除集合");
        }else {
            System.out.print("删除失败");
        }
        dbUtil.close(connection);
    }
}
