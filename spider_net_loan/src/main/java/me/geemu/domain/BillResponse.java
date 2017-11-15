package me.geemu.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @author geemu
 * Email：cfmmail@sina.com
 * Date：2017/10/10 17:16
 * Despriction：账单
 */
public class BillResponse implements Serializable {
    private static final long serialVersionUID = -8145865776285690957L;
    /**
     * 账单id
     */
    private String id;
    /**
     * 申请金额
     */
    private BigDecimal borrowAmount;
    /**
     * 到账金额
     */
    private BigDecimal arriveAmount;
    /**
     * 借款时间
     */
    private Date borrowTime;
    /**
     * 应还金额
     */
    private BigDecimal repayAmount;
    /**
     * 实际还款金额
     */
    private BigDecimal actualRepayAmount;
    /**
     * 还款状态
     */
    private boolean status;
    /**
     * 分期情况
     */
    private List<BillPeriodResponse> periodList;

}
