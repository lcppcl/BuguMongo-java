package cn.lcp.dao;

import cn.lcp.bean.Foo;
import com.bugull.mongo.AdvancedDao;

/**
 * Created by lcp on 2015/12/28.
 */
public class FooDao2 extends AdvancedDao<Foo>{
    public FooDao2() {
        super(Foo.class);
    }
    /*
    MapReduce
    * */
   /* 统计：
    public double max(String key)
    public double max(String key, BuguQuery query)
    public double min(String key)
    public double min(String key, BuguQuery query)
    public double sum(String key)
    public double sum(String key, BuguQuery query)
    MapReduced
    public Iterable<DBObject> mapReduce(MapReduceCommand cmd)
    public Iterable<DBObject> mapReduce(String map, String reduce)
    public Iterable<DBObject> mapReduce(String map, String reduce, DBObject query)
    public Iterable<DBObject> mapReduce(String map, String reduce, String outputTarget, MapReduceCommand.OutputType outputType, DBObject sort, DBObject query)
    public Iterable<DBObject> mapReduce(String map, String reduce, String outputTarget, MapReduceCommand.OutputType outputType, DBObject sort, int pageNum, int pageSize, DBObject query)*/

}
