package com.tiger.demo.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author ${author}
 * @since 2019-04-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class InventoryEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer productId;

    /**
     * 产品码
     */
    private String productNumber;

    /**
     * 产品批次
     */
    private String productBatch;

    /**
     * 仓库
     */
    private String warehouseCode;


    private String warehouseAreaCode;

    /**
     * 客户ID
     */
    private Integer customerId;

    /**
     * 客户编码
     */
    private String customerCode;

    /**
     * 客户名称
     *//*
    @TableField("customer_cn_name")
    private String customerCnName;*/

    /**
     * 容器ID
     */
    private Integer containerId;

    /**
     * 库存状态
     */
    private Integer status;

    /**
     * 库存状态码
     */
    private String statusCode;

    /**
     * 产品状态
     */
    private Integer productStatus;

    /**
     * 产品状态码
     */
    private String productStatusCode;

    /**
     * 产品批次状态
     */
    private Integer productBatchStatus;

    /**
     * 产品批次状态码
     */
    private String productBatchStatusCode;

    /**
     * 货架周期
     */
    private String dateOfShelfLife;

    private Double quantity;

    /**
     * 库存中文名
     */
    private String productCnName;

    /**
     * 库存数量ID
     */
    private Integer inventoryQuantityId;


    /**
     * 批属性值
     */
    private String lotAttr01Value;
    private String lotAttr02Value;
    private String lotAttr03Value;
    private String lotAttr04Value;
    private String lotAttr05Value;
    private String lotAttr06Value;
    private String lotAttr07Value;
    private String lotAttr08Value;
    private String lotAttr09Value;
    private String lotAttr10Value;
    private String lotAttr11Value;
    private String lotAttr12Value;
    private String lotAttr13Value;
    private String lotAttr14Value;
    private String lotAttr15Value;

    /**
     * 生产日期
     */
    private String dateOfManufacture;
    /**
     * 过期日期
     */
    private String dateOfExpiration;
    private String dateOfInWarehouse;

}
