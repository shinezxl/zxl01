package com.tiger.demo.learn.newFile.takeAddressCount.entity;

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
 * @since 2020-02-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class UnimallTakeAddressCount implements Serializable {

private static final long serialVersionUID=1L;

    private Integer takeAddressTimeId;

    /**
     * 提货日期
     */
    private String dayStr;

    private LocalDateTime createTime;

    private Integer userId;

    private Integer orderId;

    private String orderNumber;


}
