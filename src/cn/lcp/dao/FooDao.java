package cn.lcp.dao;

import cn.lcp.bean.Foo;
import com.bugull.mongo.BuguDao;
import com.mongodb.WriteResult;

/**
 * Created by lcp on 2015/12/27.
 */
/*dao都要继承来自BuguDao*/
public class FooDao extends BuguDao<Foo> {
    public FooDao() {
        super(Foo.class);
    }


    /*
    * 1.插入方法
    * */
    /* public WriteResult insert(T t)
    public WriteResult insert(List<T> list)  //批量插入
    public WriteResult save(T t)  //如果t中没有ID值，则为插入，若有ID值，则为修改。用户自定义ID除外。
    其中，当使用save(obj)方法时，如果obj中的id值为null，则实际执行插入操作；如果obj中的id值不为null，则实际执行修改操作。（@Id的type=IdType.USER_DEFINE的情况除外）*/

    /*2.删除*/
    /*public void drop()  //删除整个Collection
    public WriteResult remove(T t)
    public WriteResult remove(String id)
    public WriteResult remove(List<String> idList)  //批量删除
    public WriteResult remove(String key, Object value)  //按条件删除
    public WriteResult remove(BuguQuery query)  //按条件删除*/

    /*3.修改*/
    /*public WriteResult save(T t)*/
    /* 修改属性值 */
    /*public WriteResult set(BuguQuery query, String key, Object value)
    public WriteResult set(BuguQuery query, Map values)
    public WriteResult set(T t, String key, Object value)
    public WriteResult set(String id, String key, Object value)
    public WriteResult set(T t, Map values)
    public WriteResult set(String id, Map values)*/
    /* 删除属性列 */
    /* public WriteResult unset(T t, String... keys)
    public WriteResult unset(String id, String... keys)
    public WriteResult unset(BuguQuery query, String... keys)*/
    /* 增加、减少数值 */
    /* public WriteResult inc(T t, String key, Object value)
    public WriteResult inc(String id, String key, Object value)
    public WriteResult inc(BuguQuery query, String key, Object value)*/
    /* 乘以某个数值 */
    /* public WriteResult mul(T t, String key, Object value)
    public WriteResult mul(String id, String key, Object value)
    public WriteResult mul(BuguQuery query, String key, Object value)*/
    /* 数组操作 */
    /* public WriteResult push(T t, String key, Object value)
    public WriteResult push(String id, String key, Object value)
    public WriteResult push(BuguQuery query, String key, Object value)
    public WriteResult pushEach(T t, String key, List valueList)
    public WriteResult pushEach(String id, String key, List valueList)
    public WriteResult pushEach(BuguQuery query, String key, List valueList)
    public WriteResult pull(T t, String key, Object value)
    public WriteResult pull(String id, String key, Object value)
    public WriteResult pull(BuguQuery query, String key, Object value)
    public WriteResult popFirst(T t, String key)
    public WriteResult popFirst(String id, String key)
    public WriteResult popFirst(BuguQuery query, String key)
    public WriteResult popLast(T t, String key)
    public WriteResult popLast(String id, String key)
    public WriteResult popLast(BuguQuery query, String key)*/
    /* 设置成较小值 */
    /* public WriteResult min(T t, String key, Object value)
    public WriteResult min(String id, String key, Object value)
    public WriteResult min(BuguQuery query, String key, Object value)*/
    /* 设置成较大值 */
    /* public WriteResult max(T t, String key, Object value)
    public WriteResult max(String id, String key, Object value)
    public WriteResult max(BuguQuery query, String key, Object value)*/
    /* 按位操作 */
    /* public WriteResult bitwise(T t, String key, int value, Bitwise bitwise)
    public WriteResult bitwise(String id, String key, int value, Bitwise bitwise)
    public WriteResult bitwise(BuguQuery query, String key, int value, Bitwise bitwise)*/


    /*4.查询*/
    /* 查询一个 */
    /* public T findOne(String id)
    public T findOne(String key, Object value)*/
    /* 查询全部 */
    /*public List<T> findAll()
    public List<T> findAll(String orderBy)
    public List<T> findAll(int pageNum, int pageSize)
    public List<T> findAll(String orderBy, int pageNum, int pageSize)*/
    /* 查询是否存在 */
    /*public boolean exists(String id)
    public boolean exists(String key, Object value)*/
    /* 查询数目 */
    /*public long count()
    public long count(String key, Object value)*/
    /* 查询某一字段的不重复值 */
    /*public List distinct(String key)*/
}
