package com.tiger.demo.learn.newFile.lotAllotStrategy.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author zxl
 * @since 2020-03-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class LotAllotStrategy implements Serializable {

private static final long serialVersionUID=1L;

    /**
     * 批属性ID
     */
    private Integer lotAttributeId;

    /**
     * 批属性列名
     */
    private String lotAttributeColumnName;

    /**
     * 分配优先级
     */
    private Integer allotPriority;

    /**
     * 自然排序
     */
    private String allotSort;

    /**
     * 运算符
     */
    private String operators;


}
