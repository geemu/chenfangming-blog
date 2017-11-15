package me.geemu.domain.request;

import lombok.Data;

/**
 * @author geemu
 * Email：cfmmail@sina.com
 * Date：2017/11/15 17:37
 * Despriction：设备信息
 */
@Data
public class DeviceVO {
    /**
     * 设备类型 android ios
     */
    private String deviceType;
    /**
     * 设备唯一标识码
     */
    private String deviceId;
    /**
     * 设备系统
     */
    private String deviceName;
    /**
     * 设备系统版本号
     */
    private String osVersion;
    /**
     * wifi地址
     */
    private String wifi;
}
