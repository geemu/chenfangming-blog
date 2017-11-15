package me.geemu.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import me.geemu.domain.BaseResponse;
import me.geemu.domain.request.BillRequest;
import me.geemu.domain.response.BillResponse;
import org.springframework.web.bind.annotation.*;

/**
 * @author geemu
 * Email：cfmmail@sina.com
 * Date：2017/10/10 17:16
 * Despriction：平台控制器
 */
@RestController
@RequestMapping("platform")
@Api(description = "平台控制器")
public class PlatformController {


    @ApiOperation(value = "获取账单", notes = "获取账单", response = BillResponse.class)
    @PostMapping("")
    public BaseResponse<BillResponse> getBills(@RequestBody() BillRequest requestBody) {
        System.out.println(requestBody);
        return null;
    }
}
