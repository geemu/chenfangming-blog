package me.geemu.domain.request;

import lombok.Data;


/**
 * @author geemu
 * Email：cfmmail@sina.com
 * Date：2017/11/15 17:12
 * Despriction：爬取参数
 */
@Data
public class BillRequest {

    /**
     * 爬取批次号
     */
    private String spiderNo;
    /**
     * 授权码
     */
    private String authorization;
    /**
     * 爬取平台参数
     */
    private PlatformVO platform;
    /**
     * 设备参数
     */
    private DeviceVO device;

}
