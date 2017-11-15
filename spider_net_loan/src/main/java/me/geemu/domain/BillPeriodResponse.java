package me.geemu.domain;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author geemu
 * Email：cfmmail@sina.com
 * Date：2017/10/10 17:16
 * Despriction：账单分期
 */
@Data
public class BillPeriodResponse implements Serializable {
    private static final long serialVersionUID = -8145865776285690953L;
    /**
     * 当前分期id
     */
    private String id;
    /**
     * 本期应还金额
     */
    private BigDecimal repayAmount;
    /**
     * 实际还款金额
     */
    private BigDecimal ActualRepayAmount;
    /**
     * 应还款时间
     */
    private Date repayTime;
    /**
     * 实际还款时间
     */
    private Date ActualRepayTime;
    /**
     * 还款状态
     */
    private boolean status;

}
