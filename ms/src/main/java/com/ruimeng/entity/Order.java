package com.ruimeng.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.Version;
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
 * @author JiangShiDing
 * @since 2019-11-27
 * @description 订单实体类
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("customerId")
    private Integer customerId; //客户id

    private String customerName; //客户名
    private String description; //订单描述
    private Integer quantity; //购买数量

    @TableField("totalPrice")
    private BigDecimal totalPrice; //订单总价

    private Integer status; //订单状态

    private Integer paid;

    @TableField("createTime")
    private Date createTime; //创建时间

    @TableField("updateTime")
    private Date updateTime; //修改时间

}
