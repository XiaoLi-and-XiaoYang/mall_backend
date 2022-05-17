package com.c414.dload.mall_backend.elasticsearch.document;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
 * <p>
 * 存储产品参数信息的表
 * </p>
 *
 * @author dload
 * @since 2022-05-16
 */
@Getter
@Setter
@TableName("pms_product_attribute_value")
@ApiModel(value = "ProductAttributeValue对象", description = "存储产品参数信息的表")
public class EsProductAttributeValue implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long id;
    private Long productAttributeId;
    //属性值
    @Field(type = FieldType.Keyword)
    private String value;
    //属性参数：0->规格；1->参数
    private Integer type;
    //属性名称
    @Field(type = FieldType.Keyword)
    private String name;

}
