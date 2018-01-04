package me.geemu.persistence.model.secondary;

import java.util.Date;
import javax.persistence.*;

@Table(name = "log_request")
public class LogRequest {
    /**
     * 主键
     */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 请求URL
     */
    private String url;

    /**
     * path 即controller调用的方法
     */
    private String path;

    /**
     * 请求参数
     */
    private String reqParam;

    /**
     * 返回内容
     */
    private String respBody;

    /**
     * 请求时间
     */
    private Date reqTime;

    /**
     * 相应时间
     */
    private Date respTime;

    /**
     * 耗时
     */
    private Integer spendTime;

    /**
     * ip
     */
    private String ip;

    /**
     * 用户id 游客为0
     */
    private Long userId;

    /**
     * token
     */
    private String token;

    /**
     * 设备类型
     */
    private String deviceType;

    /**
     * 设备ID
     */
    private String deviceId;

    /**
     * 设备名称
     */
    private String deviceName;

    /**
     * UA
     */
    private String userAgent;

    /**
     * cookie
     */
    private String cookie;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取请求URL
     *
     * @return url - 请求URL
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置请求URL
     *
     * @param url 请求URL
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取path 即controller调用的方法
     *
     * @return path - path 即controller调用的方法
     */
    public String getPath() {
        return path;
    }

    /**
     * 设置path 即controller调用的方法
     *
     * @param path path 即controller调用的方法
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * 获取请求参数
     *
     * @return reqParam - 请求参数
     */
    public String getReqParam() {
        return reqParam;
    }

    /**
     * 设置请求参数
     *
     * @param reqParam 请求参数
     */
    public void setReqParam(String reqParam) {
        this.reqParam = reqParam;
    }

    /**
     * 获取返回内容
     *
     * @return respBody - 返回内容
     */
    public String getRespBody() {
        return respBody;
    }

    /**
     * 设置返回内容
     *
     * @param respBody 返回内容
     */
    public void setRespBody(String respBody) {
        this.respBody = respBody;
    }

    /**
     * 获取请求时间
     *
     * @return reqTime - 请求时间
     */
    public Date getReqTime() {
        return reqTime;
    }

    /**
     * 设置请求时间
     *
     * @param reqTime 请求时间
     */
    public void setReqTime(Date reqTime) {
        this.reqTime = reqTime;
    }

    /**
     * 获取相应时间
     *
     * @return respTime - 相应时间
     */
    public Date getRespTime() {
        return respTime;
    }

    /**
     * 设置相应时间
     *
     * @param respTime 相应时间
     */
    public void setRespTime(Date respTime) {
        this.respTime = respTime;
    }

    /**
     * 获取耗时
     *
     * @return spendTime - 耗时
     */
    public Integer getSpendTime() {
        return spendTime;
    }

    /**
     * 设置耗时
     *
     * @param spendTime 耗时
     */
    public void setSpendTime(Integer spendTime) {
        this.spendTime = spendTime;
    }

    /**
     * 获取ip
     *
     * @return ip - ip
     */
    public String getIp() {
        return ip;
    }

    /**
     * 设置ip
     *
     * @param ip ip
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * 获取用户id 游客为0
     *
     * @return userId - 用户id 游客为0
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置用户id 游客为0
     *
     * @param userId 用户id 游客为0
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取token
     *
     * @return token - token
     */
    public String getToken() {
        return token;
    }

    /**
     * 设置token
     *
     * @param token token
     */
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * 获取设备类型
     *
     * @return deviceType - 设备类型
     */
    public String getDeviceType() {
        return deviceType;
    }

    /**
     * 设置设备类型
     *
     * @param deviceType 设备类型
     */
    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    /**
     * 获取设备ID
     *
     * @return deviceId - 设备ID
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * 设置设备ID
     *
     * @param deviceId 设备ID
     */
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * 获取设备名称
     *
     * @return deviceName - 设备名称
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * 设置设备名称
     *
     * @param deviceName 设备名称
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    /**
     * 获取UA
     *
     * @return userAgent - UA
     */
    public String getUserAgent() {
        return userAgent;
    }

    /**
     * 设置UA
     *
     * @param userAgent UA
     */
    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    /**
     * 获取cookie
     *
     * @return cookie - cookie
     */
    public String getCookie() {
        return cookie;
    }

    /**
     * 设置cookie
     *
     * @param cookie cookie
     */
    public void setCookie(String cookie) {
        this.cookie = cookie;
    }
}