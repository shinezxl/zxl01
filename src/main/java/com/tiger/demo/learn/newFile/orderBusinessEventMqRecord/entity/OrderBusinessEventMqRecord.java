package com.tiger.demo.learn.newFile.orderBusinessEventMqRecord.entity;

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
 * @since 2020-07-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class OrderBusinessEventMqRecord implements Serializable {

private static final long serialVersionUID=1L;

    private String businessEventCode;

    private String orderNumber;

    /**
     * 投递MQ的报文
     */
    private String messageInfo;

    /**
     * 消息状态 0-投递成功,1-投递失败
     */
    private Integer messageStatus;

    private String createdTime;


}
