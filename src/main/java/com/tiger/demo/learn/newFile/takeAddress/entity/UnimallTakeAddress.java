package com.tiger.demo.learn.newFile.takeAddress.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
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
 * @since 2020-02-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class UnimallTakeAddress implements Serializable {

private static final long serialVersionUID=1L;

    private String fromProvinceCode;

    /**
     * 提货省
     */
    private String fromProvince;

    private String fromCityCode;

    /**
     * 提货市
     */
    private String fromCity;

    private String fromAreaCode;

    /**
     * 提货区
     */
    private String fromArea;

    /**
     * 提货详细地址
     */
    private String fromDetailedAddress;

    /**
     * 经度
     */
    private String fromLongitude;

    /**
     * 纬度
     */
    private String fromLatitude;

    /**
     * 提货联系人
     */
    private String fromLinkMan;

    /**
     * 提货联系人手机
     */
    private String fromLinkManPhone;

    private LocalDateTime gmtCreate;

    private LocalDateTime gmtUpdate;


}
