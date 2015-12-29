package cn.lcp.index.Lucene;

import cn.lcp.bean.EmbedFoo;
import cn.lcp.bean.FatherFoo;
import com.bugull.mongo.BuguEntity;
import com.bugull.mongo.annotations.Embed;
import com.bugull.mongo.annotations.Entity;
import com.bugull.mongo.annotations.Id;
import com.bugull.mongo.annotations.Ref;
import com.bugull.mongo.lucene.annotations.*;

/**
 * Created by lcp on 2015/12/28.
 * Lucene索引：当往mongodb中新建一个Document时，能自动为该Document建立Lucene索引，document被修改时，删除对应的Lucene索引也会被修改
 *
 * 10个注解：@Indexed、@IndexProperty、@IndexEmbed、@IndexEmbedList、@IndexRef、@IndexRefList、@IndexRefBy、@IndexEmbedBy、@IndexFilter、@BoostSwitch
 * 5个类：BuguIndex、BuguParser、BuguSearcher、BuguHighlighter、IndexRebuilder
 */
@Entity
@Indexed/*需要对该Entity建索引。该Entity上必须要有@Entity和@Id注解，@Indexed才能起作用。*/
public class Foo implements BuguEntity{
    @Id
    private String id;

    /**
     * @IndexProperty支持的数据类型包括：String、char、boolean、int、long、float、double、Date等基本数据类型。
     * 属性：analyze-boolean,是否需要分词，缺省为false
     * store-boolean,是否需要存储，缺省为false
     * boost-float,该Field的权重，缺省为1.0
     * 支持数组，List，Set，都会连接成一个字符串作为索引。
     */
    @IndexProperty(analyze = true,boost = 2.0f)
    private String title;
    @IndexProperty(analyze=true)
    private String introduce;

    @Embed
    /**
     * 需要嵌入对该Embed对象的索引，结合@IndexEmbedBy使用，索引域的名称形如‘embed.x’
     */
    @IndexEmbed
    private EmbedFoo embed;

    @Ref
    /**
     * 需要嵌入对该Ref对象的索引。结合@IndexRefBy使用。索引域的名称形如“father.name”。
     */
    @IndexRef
    private FatherFoo father;

    /**
     * 只有满足该条件的实体才会被索引，否则不创建索引。
     * compare表示比较操作，是枚举类型Compare。
     *  Compare.IS_EQUALS——等于（==）。支持String、boolean、int、long、float、double、char。
     *  Compare.NOT_EQUALS——不等于（!=）。支持String、boolean、int、long、float、double、char。
     *  Compare.GREATER_THAN——大于（>）。支持int、long、float、double。
     *  Compare.GREATER_THAN_EQUALS——大于等于（>=）。支持int、long、float、double。
     *  Compare.LESS_THAN——小于（<）。支持int、long、float、double。
     *  Compare.LESS_THAN_EQUALS——小于等于（<=）。支持int、long、float、double。
     *  Compare.IS_NULL——为空（==null）。支持Object类型，包括String。这时不需要value参数。
     *  Compare.NOT_NULL——不为空（!=null）。支持Object类型，包括String。这时不需要value参数。
     *  在一个Entity类上可以有多个@IndexFilter注解，表示需要同时满足这些条件。
     * value是比较的值，是字符串，会相应的解析成该属性类型的值。
     */
    @IndexFilter(compare=Compare.IS_EQUALS,value="true")
    private boolean valid;

    /**
     * 同一个Entity类的不同的Document，可能需要设置不同的权重，
     * compare——与上面@IndexFilter的compare含义相同
     * value——与上面@IndexFilter的value含义相同
     * fit——float型，表示满足比较条件时该Document的boost值，缺省值为1.0
     * unfit——float型，表示不满足比较条件时该Document的boost值，缺省值为1.0
     */
    @BoostSwitch(compare= Compare.IS_EQUALS,value="true",fit=1.5f,unfit=0.5f)
    private boolean vip;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public EmbedFoo getEmbed() {
        return embed;
    }

    public void setEmbed(EmbedFoo embed) {
        this.embed = embed;
    }

    public FatherFoo getFather() {
        return father;
    }

    public void setFather(FatherFoo father) {
        this.father = father;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public void setId(String s) {
        this.id = s;
    }

    @Override
    public String getId() {
        return null;
    }
}
