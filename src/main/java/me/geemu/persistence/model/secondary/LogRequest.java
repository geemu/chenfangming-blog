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
    @Column(name = "request_param")
    private String requestParam;

    /**
     * 返回内容
     */
    @Column(name = "response_Body")
    private String responseBody;

    /**
     * 请求时间
     */
    @Column(name = "request_time")
    private Date requestTime;

    /**
     * 相应时间
     */
    @Column(name = "response_time")
    private Date responseTime;

    /**
     * 耗时
     */
    @Column(name = "spend_time")
    private Integer spendTime;

    /**
     * ip
     */
    private String ip;

    /**
     * 用户id 游客为0
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * token
     */
    private String token;

    /**
     * 设备类型
     */
    @Column(name = "device_type")
    private String deviceType;

    /**
     * 设备ID
     */
    @Column(name = "device_id")
    private String deviceId;

    /**
     * 设备名称
     */
    @Column(name = "device_name")
    private String deviceName;

    /**
     * UA
     */
    @Column(name = "user_agent")
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
     * @return request_param - 请求参数
     */
    public String getRequestParam() {
        return requestParam;
    }

    /**
     * 设置请求参数
     *
     * @param requestParam 请求参数
     */
    public void setRequestParam(String requestParam) {
        this.requestParam = requestParam;
    }

    /**
     * 获取返回内容
     *
     * @return response_Body - 返回内容
     */
    public String getResponseBody() {
        return responseBody;
    }

    /**
     * 设置返回内容
     *
     * @param responseBody 返回内容
     */
    public void setResponseBody(String responseBody) {
        this.responseBody = responseBody;
    }

    /**
     * 获取请求时间
     *
     * @return request_time - 请求时间
     */
    public Date getRequestTime() {
        return requestTime;
    }

    /**
     * 设置请求时间
     *
     * @param requestTime 请求时间
     */
    public void setRequestTime(Date requestTime) {
        this.requestTime = requestTime;
    }

    /**
     * 获取相应时间
     *
     * @return response_time - 相应时间
     */
    public Date getResponseTime() {
        return responseTime;
    }

    /**
     * 设置相应时间
     *
     * @param responseTime 相应时间
     */
    public void setResponseTime(Date responseTime) {
        this.responseTime = responseTime;
    }

    /**
     * 获取耗时
     *
     * @return spend_time - 耗时
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
     * @return user_id - 用户id 游客为0
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
     * @return device_type - 设备类型
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
     * @return device_id - 设备ID
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
     * @return device_name - 设备名称
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
     * @return user_agent - UA
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