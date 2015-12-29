package cn.lcp.bean;

import com.bugull.mongo.BuguEntity;
import com.bugull.mongo.annotations.*;


import java.util.List;

/**
 * Created by lcp on 2015/12/26.
 */
/*@Entity表示映射到数据库中的实体，
有name-(String,在数据库中的collection的名称，可以省略，默认是类名的全小写)，
capped-(boolean,表示该Entity类对应的是Capped Collection缺省为false),
capSize-(long,设置Capped Collection的空间大小，以字节为单位，默认为-1，表示未设置),
capMax-(long,设置Capped Collection的最多能存储多少个document，默认为-1，表示未设置。如果设置capped=true，则需要设置capSize和capMax两者中的一个)四个属性
*/
@Entity
public class Foo implements BuguEntity {
    /*  @Id
    映射到数据库的id，在java中必须为String类型，在数据库中则根据@id的type属性设置而定
    * IdType.AUTO_GENERATE——默认值。表示由MongoDB自动产生id值。
    * IdType.AUTO_INCREASE——表示id值自动增长。在数据库中被保存为Long类性的数值。可以设置start参数，使得id从指定的值开始增长。
    * IdType.USER_DEFINE——表示id值由程序员自己定义。在数据库中保存为一个字符串
    */
    @Id
    private String id;
    private String name;
    /*  @Property
    * 用来映射基本的数据类型：String、int、long、short、byte、float、double、boolean、char、Date、Timestamp
    * List、Set、Map
    * name属性：string用于指定映射到collection中某个field，可以省略。
    * lazy属性：Boolean，取出该实体时，是否取出该field的值。为true为不取出，默认为false。只对列表起作用。取单条记录并没有用。
    * */
    @Property
    private int level;

    /* @Embed
    * 该属性是一个嵌入对象，实体对象只是一个普通的pojo（javaBean）
    * name属性：string用于指定映射到collection中某个field，可以省略。
    * lazy属性：Boolean，取出该实体时，是否取出该field的值。为true为不取出，默认为false。只对列表起作用。取单条记录并没有用。
    * */
    @Embed
    private EmbedFoo embedFoo;

    /* @EmbedList
    * 该属性是一组嵌入的对象（也就是普通的javaBean）。支持数组、List、Set、Map、Queue，但都必须使用泛型。当使用Map的时候，嵌入对象只能作为Map的value，而不能作为key。
    * 基本数据类型组成的List，Set，Map使用@Property
    * name属性：string用于指定映射到collection中某个field，可以省略。
    * lazy属性：Boolean，取出该实体时，是否取出该field的值。为true为不取出，默认为false。只对列表起作用。取单条记录并没有用。
    * */
    @EmbedList
    private List<EmbedFoo> embedFooList;

    /* @Ref
    * 表示对另外的对象的引用，在数据库保存形如:"fatherFoo":{"$ref":"fatherFoo","$id":ObjectId("XXXXXXXXXXX")}这样的DBRef
    *
    * name：指定collection中的某个field，可以省略。
    * impl：如果@Ref在某个接口上，那么impl指定其实现类
    *       @Ref(impl=MyFather.class)
    *       private IFather father
    * reduced：指定是否进行简单存储，默认为false。"fatherFoo":{"$ref":"fatherFoo","$id":ObjectId("XXXXXXXXXXX")}这样的DBRef
    *           为true，可以节省存储空间，@Ref在数据库中保存是引用对象的id，没有$ref属性，形如，”fatherFoo":"ObjectId(XXXXXXXXXXX)”
    * casecade:String,指定其关联操作，其值为C-创建R读取U修改D删除四个当中的其中一个或者多个。缺省值都是空字符串，表示不做任何关联操作
    * */
    @Ref
    private FatherFoo fatherFoo;

    /*@RefList 支持数组、List、Set、Map、Queue，但都必须使用泛型。当使用Map的时候，引用对象只能作为Map的value，而不能作为key。
    * name：指定collection中的某个field，可以省略。
    * impl:指定集合中的实现元素。
    * casecade:String,指定其关联操作，其值为C-创建R读取U修改D删除四个当中的其中一个或者多个。缺省值都是空字符串，表示不做任何关联操作
    * reduced:指定是否进行简单存储，默认为false。"fatherFoo":{"$ref":"fatherFoo","$id":ObjectId("XXXXXXXXXXX")}这样的DBRef
    *           为true，可以节省存储空间，@Ref在数据库中保存是引用对象的id，没有$ref属性，形如，”fatherFoo":"ObjectId(XXXXXXXXXXX)”
    * sort:string,用于关联取出该List，Set属性使用的排序规则，不排序不用设置该值@RefList(sort="{kay':-1}")
    * */
    @RefList
    private List<ChildFoo> childFooList;

    /*  @Ignore
    * 该属性不映射，当保存实体时，该实体不会保存到数据库，该属性也不会从数据库中取出来
    * */
    @Ignore
    private double sumScore;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public EmbedFoo getEmbedFoo() {
        return embedFoo;
    }

    public void setEmbedFoo(EmbedFoo embedFoo) {
        this.embedFoo = embedFoo;
    }

    public List<EmbedFoo> getEmbedFooList() {
        return embedFooList;
    }

    public void setEmbedFooList(List<EmbedFoo> embedFooList) {
        this.embedFooList = embedFooList;
    }

    public FatherFoo getFatherFoo() {
        return fatherFoo;
    }

    public void setFatherFoo(FatherFoo fatherFoo) {
        this.fatherFoo = fatherFoo;
    }

    public List<ChildFoo> getChildFooList() {
        return childFooList;
    }

    public void setChildFooList(List<ChildFoo> childFooList) {
        this.childFooList = childFooList;
    }

    public double getSumScore() {
        return sumScore;
    }

    public void setSumScore(double sumScore) {
        this.sumScore = sumScore;
    }

    @Override
    public void setId(String s) {
        this.id = s;
    }

    @Override
    public String getId() {
        return id;
    }


}
