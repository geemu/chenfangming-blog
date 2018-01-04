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
    @Column(name = "reqParam")
    private String reqparam;

    /**
     * 返回内容
     */
    @Column(name = "respBody")
    private String respbody;

    /**
     * 请求时间
     */
    @Column(name = "reqTime")
    private Date reqtime;

    /**
     * 相应时间
     */
    @Column(name = "respTime")
    private Date resptime;

    /**
     * 耗时
     */
    @Column(name = "spendTime")
    private Integer spendtime;

    /**
     * ip
     */
    private String ip;

    /**
     * 用户id 游客为0
     */
    @Column(name = "userId")
    private Long userid;

    /**
     * token
     */
    private String token;

    /**
     * 设备类型
     */
    @Column(name = "deviceType")
    private String devicetype;

    /**
     * 设备ID
     */
    @Column(name = "deviceId")
    private String deviceid;

    /**
     * 设备名称
     */
    @Column(name = "deviceName")
    private String devicename;

    /**
     * UA
     */
    @Column(name = "userAgent")
    private String useragent;

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
    public String getReqparam() {
        return reqparam;
    }

    /**
     * 设置请求参数
     *
     * @param reqparam 请求参数
     */
    public void setReqparam(String reqparam) {
        this.reqparam = reqparam;
    }

    /**
     * 获取返回内容
     *
     * @return respBody - 返回内容
     */
    public String getRespbody() {
        return respbody;
    }

    /**
     * 设置返回内容
     *
     * @param respbody 返回内容
     */
    public void setRespbody(String respbody) {
        this.respbody = respbody;
    }

    /**
     * 获取请求时间
     *
     * @return reqTime - 请求时间
     */
    public Date getReqtime() {
        return reqtime;
    }

    /**
     * 设置请求时间
     *
     * @param reqtime 请求时间
     */
    public void setReqtime(Date reqtime) {
        this.reqtime = reqtime;
    }

    /**
     * 获取相应时间
     *
     * @return respTime - 相应时间
     */
    public Date getResptime() {
        return resptime;
    }

    /**
     * 设置相应时间
     *
     * @param resptime 相应时间
     */
    public void setResptime(Date resptime) {
        this.resptime = resptime;
    }

    /**
     * 获取耗时
     *
     * @return spendTime - 耗时
     */
    public Integer getSpendtime() {
        return spendtime;
    }

    /**
     * 设置耗时
     *
     * @param spendtime 耗时
     */
    public void setSpendtime(Integer spendtime) {
        this.spendtime = spendtime;
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
    public Long getUserid() {
        return userid;
    }

    /**
     * 设置用户id 游客为0
     *
     * @param userid 用户id 游客为0
     */
    public void setUserid(Long userid) {
        this.userid = userid;
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
    public String getDevicetype() {
        return devicetype;
    }

    /**
     * 设置设备类型
     *
     * @param devicetype 设备类型
     */
    public void setDevicetype(String devicetype) {
        this.devicetype = devicetype;
    }

    /**
     * 获取设备ID
     *
     * @return deviceId - 设备ID
     */
    public String getDeviceid() {
        return deviceid;
    }

    /**
     * 设置设备ID
     *
     * @param deviceid 设备ID
     */
    public void setDeviceid(String deviceid) {
        this.deviceid = deviceid;
    }

    /**
     * 获取设备名称
     *
     * @return deviceName - 设备名称
     */
    public String getDevicename() {
        return devicename;
    }

    /**
     * 设置设备名称
     *
     * @param devicename 设备名称
     */
    public void setDevicename(String devicename) {
        this.devicename = devicename;
    }

    /**
     * 获取UA
     *
     * @return userAgent - UA
     */
    public String getUseragent() {
        return useragent;
    }

    /**
     * 设置UA
     *
     * @param useragent UA
     */
    public void setUseragent(String useragent) {
        this.useragent = useragent;
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