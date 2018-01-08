package com.chenfangming.persistence.model.secondary;

import java.util.Date;

/**
 * @author auto generator
 */
public class LogRequest {
    /**
     * id 主键
     */
    private Long id;

    /**
     * url 请求URL
     */
    private String url;

    /**
     * path path 即controller调用的方法
     */
    private String path;

    /**
     * requestparam 请求参数
     */
    private String requestparam;

    /**
     * responsebody 返回内容
     */
    private String responsebody;

    /**
     * requesttime 请求时间
     */
    private Date requesttime;

    /**
     * responsetime 相应时间
     */
    private Date responsetime;

    /**
     * spendtime 耗时
     */
    private Integer spendtime;

    /**
     * ip ip
     */
    private String ip;

    /**
     * userid 用户id 游客为0
     */
    private Long userid;

    /**
     * token token
     */
    private String token;

    /**
     * devicetype 设备类型
     */
    private String devicetype;

    /**
     * deviceid 设备ID
     */
    private String deviceid;

    /**
     * devicename 设备名称
     */
    private String devicename;

    /**
     * useragent UA
     */
    private String useragent;

    /**
     * cookie cookie
     */
    private String cookie;

    /**
     * 获取 主键 字段:log_request.id
     *
     * @return log_request.id, 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置 主键 字段:log_request.id
     *
     * @param id 数据库.表名 log_request.id, 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取 请求URL 字段:log_request.url
     *
     * @return log_request.url, 请求URL
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置 请求URL 字段:log_request.url
     *
     * @param url 数据库.表名 log_request.url, 请求URL
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取 path 即controller调用的方法 字段:log_request.path
     *
     * @return log_request.path, path 即controller调用的方法
     */
    public String getPath() {
        return path;
    }

    /**
     * 设置 path 即controller调用的方法 字段:log_request.path
     *
     * @param path 数据库.表名 log_request.path, path 即controller调用的方法
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * 获取 请求参数 字段:log_request.requestParam
     *
     * @return log_request.requestParam, 请求参数
     */
    public String getRequestparam() {
        return requestparam;
    }

    /**
     * 设置 请求参数 字段:log_request.requestParam
     *
     * @param requestparam 数据库.表名 log_request.requestParam, 请求参数
     */
    public void setRequestparam(String requestparam) {
        this.requestparam = requestparam;
    }

    /**
     * 获取 返回内容 字段:log_request.responseBody
     *
     * @return log_request.responseBody, 返回内容
     */
    public String getResponsebody() {
        return responsebody;
    }

    /**
     * 设置 返回内容 字段:log_request.responseBody
     *
     * @param responsebody 数据库.表名 log_request.responseBody, 返回内容
     */
    public void setResponsebody(String responsebody) {
        this.responsebody = responsebody;
    }

    /**
     * 获取 请求时间 字段:log_request.requestTime
     *
     * @return log_request.requestTime, 请求时间
     */
    public Date getRequesttime() {
        return requesttime;
    }

    /**
     * 设置 请求时间 字段:log_request.requestTime
     *
     * @param requesttime 数据库.表名 log_request.requestTime, 请求时间
     */
    public void setRequesttime(Date requesttime) {
        this.requesttime = requesttime;
    }

    /**
     * 获取 相应时间 字段:log_request.responseTime
     *
     * @return log_request.responseTime, 相应时间
     */
    public Date getResponsetime() {
        return responsetime;
    }

    /**
     * 设置 相应时间 字段:log_request.responseTime
     *
     * @param responsetime 数据库.表名 log_request.responseTime, 相应时间
     */
    public void setResponsetime(Date responsetime) {
        this.responsetime = responsetime;
    }

    /**
     * 获取 耗时 字段:log_request.spendTime
     *
     * @return log_request.spendTime, 耗时
     */
    public Integer getSpendtime() {
        return spendtime;
    }

    /**
     * 设置 耗时 字段:log_request.spendTime
     *
     * @param spendtime 数据库.表名 log_request.spendTime, 耗时
     */
    public void setSpendtime(Integer spendtime) {
        this.spendtime = spendtime;
    }

    /**
     * 获取 ip 字段:log_request.ip
     *
     * @return log_request.ip, ip
     */
    public String getIp() {
        return ip;
    }

    /**
     * 设置 ip 字段:log_request.ip
     *
     * @param ip 数据库.表名 log_request.ip, ip
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * 获取 用户id 游客为0 字段:log_request.userId
     *
     * @return log_request.userId, 用户id 游客为0
     */
    public Long getUserid() {
        return userid;
    }

    /**
     * 设置 用户id 游客为0 字段:log_request.userId
     *
     * @param userid 数据库.表名 log_request.userId, 用户id 游客为0
     */
    public void setUserid(Long userid) {
        this.userid = userid;
    }

    /**
     * 获取 token 字段:log_request.token
     *
     * @return log_request.token, token
     */
    public String getToken() {
        return token;
    }

    /**
     * 设置 token 字段:log_request.token
     *
     * @param token 数据库.表名 log_request.token, token
     */
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * 获取 设备类型 字段:log_request.deviceType
     *
     * @return log_request.deviceType, 设备类型
     */
    public String getDevicetype() {
        return devicetype;
    }

    /**
     * 设置 设备类型 字段:log_request.deviceType
     *
     * @param devicetype 数据库.表名 log_request.deviceType, 设备类型
     */
    public void setDevicetype(String devicetype) {
        this.devicetype = devicetype;
    }

    /**
     * 获取 设备ID 字段:log_request.deviceId
     *
     * @return log_request.deviceId, 设备ID
     */
    public String getDeviceid() {
        return deviceid;
    }

    /**
     * 设置 设备ID 字段:log_request.deviceId
     *
     * @param deviceid 数据库.表名 log_request.deviceId, 设备ID
     */
    public void setDeviceid(String deviceid) {
        this.deviceid = deviceid;
    }

    /**
     * 获取 设备名称 字段:log_request.deviceName
     *
     * @return log_request.deviceName, 设备名称
     */
    public String getDevicename() {
        return devicename;
    }

    /**
     * 设置 设备名称 字段:log_request.deviceName
     *
     * @param devicename 数据库.表名 log_request.deviceName, 设备名称
     */
    public void setDevicename(String devicename) {
        this.devicename = devicename;
    }

    /**
     * 获取 UA 字段:log_request.userAgent
     *
     * @return log_request.userAgent, UA
     */
    public String getUseragent() {
        return useragent;
    }

    /**
     * 设置 UA 字段:log_request.userAgent
     *
     * @param useragent 数据库.表名 log_request.userAgent, UA
     */
    public void setUseragent(String useragent) {
        this.useragent = useragent;
    }

    /**
     * 获取 cookie 字段:log_request.cookie
     *
     * @return log_request.cookie, cookie
     */
    public String getCookie() {
        return cookie;
    }

    /**
     * 设置 cookie 字段:log_request.cookie
     *
     * @param cookie 数据库.表名 log_request.cookie, cookie
     */
    public void setCookie(String cookie) {
        this.cookie = cookie;
    }
}