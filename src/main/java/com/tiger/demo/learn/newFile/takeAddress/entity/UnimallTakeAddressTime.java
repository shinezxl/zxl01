package com.tiger.demo.learn.newFile.takeAddress.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
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
public class UnimallTakeAddressTime implements Serializable {

private static final long serialVersionUID=1L;

    private Integer unimallTakeAddressId;

    /**
     * 提货时间范围
     */
    private String timeRange;

    /**
     * 最大提货限制
     */
    private Integer maxTakeLimit;

    private LocalDateTime gmtCreate;

    private String gmtCreateBy;

    private LocalDateTime gmtUpdate;

    private String gmtUpdateBy;

    /**
     * 0关闭 1开启
     */
    @TableField("STATUS")
    private Boolean status;


}
