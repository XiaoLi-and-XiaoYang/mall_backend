package com.c414.dload.mall_backend.controller;

import com.c414.dload.mall_backend.common.CommonResult;
import com.c414.dload.mall_backend.nosql.mongodb.document.MemberReadHistory;
import com.c414.dload.mall_backend.service.impl.MemberReadHistoryServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Api(tags = "MemberReadHistoryController", description = "用户浏览记录接口")
@RequestMapping("/member/readHistory")
public class MemberReadHistoryController {

    @Resource
    private MemberReadHistoryServiceImpl memberReadHistoryService;

    @ApiOperation("创建浏览记录")
    @PostMapping("/create")
    public CommonResult create(@RequestBody MemberReadHistory memberReadHistory){
        Integer res = memberReadHistoryService.create(memberReadHistory);
        if (res > 0){
            return CommonResult.success(res);
        }else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("删除浏览记录")
    @PostMapping("/delete")
    public CommonResult delete(@RequestParam("ids") List<String> ids){
        Integer res = memberReadHistoryService.delete(ids);
        if (res > 0){
            return CommonResult.success(res);
        }else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("查询用户浏览记录")
    @GetMapping("/list")
    public CommonResult list(Long memberId){
        List<MemberReadHistory> list = memberReadHistoryService.list(memberId);
        return CommonResult.success(list);
    }

}
