package org.uppower.project.cashiermanagesystem.controller;

import cn.windyrjc.utils.response.Response;
import com.baomidou.mybatisplus.extension.api.R;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.uppower.project.cashiermanagesystem.model.result.RulesResult;
import org.uppower.project.cashiermanagesystem.model.vo.RulesVO;
import org.uppower.project.cashiermanagesystem.service.RulesService;

import java.util.List;

/**
 * create by:
 * *      ____        ___  ___       __          __
 * *    /  _  \     /   |/   |      | |        / /
 * *   | | | |     / /|   /| |     | |  __   / /
 * *  | | | |     / / |__/ | |    | | /  | / /
 * * | |_| |_    / /       | |   | |/   |/ /
 * * \_______|  /_/        |_|  |___/|___/
 *
 * @date 2019/10/1915:34
 */
@RestController
@RequestMapping("/rules")
public class RulesController {

    @Autowired
    RulesService rulesService;

    @ApiOperation("查询规则")
    @GetMapping
    public Response<RulesResult> index(){
        return rulesService.index();
    }

    @ApiOperation("新增规则")
    @PostMapping
    public Response store(@RequestBody RulesVO rulesVO){
        return rulesService.store(rulesVO);
    }
/*
    @ApiOperation("删除规则")
    @DeleteMapping
    public Response delete(@RequestParam("id") Integer id){
        return rulesService.delete(id);
    }*/

    @ApiOperation("修改规则")
    @PatchMapping
    public Response update(@RequestParam("id") Integer id,@RequestBody RulesVO rulesVO){
        return rulesService.update(id,rulesVO);
    }
}
