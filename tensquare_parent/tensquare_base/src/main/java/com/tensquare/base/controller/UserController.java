package com.tensquare.base.controller;

import com.tensquare.base.pojo.Label;
import com.tensquare.base.service.LabelService;
import entity.Result;
import entity.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Description: 标签控制层
 * @ProjectName: tensquare_parent
 * @Package: com.tensquare.base.controller
 * @Author: hz
 * @Date: 2019/2/12 17:44
 * @Version: 1.0
 */
@RestController
@RequestMapping("/label")
@CrossOrigin
public class UserController {

    @Autowired
    private LabelService labelService;

    /**
     * 查询全部标签
     *
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public Result findAll() {
        int i = 1/0;
        return new Result(true, StatusCode.OK, "查询所有成功", labelService.findAll());
    }

    /**
     * 根据ID查询标签
     * @return
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Result findById(@PathVariable String id) {
        return new Result(true, StatusCode.OK, "查询成功", labelService.findById(id));
    }

    /**
     * 增加标签
     * @param label
     */
    @RequestMapping(method = RequestMethod.POST)
    public Result add(@RequestBody Label label) {
        labelService.add(label);
        return new Result(true,StatusCode.OK,"增加成功");
    }

    /**
     * 修改标签
     * @param label
     */
    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public Result update(@RequestBody Label label,@PathVariable String id){
        label.setId(id);
        labelService.update(label);
        return new Result(true,StatusCode.OK,"修改成功");
    }


    /**
     * 删除标签
     * @param id
     */
    @RequestMapping(value="/{id}" ,method = RequestMethod.DELETE)
    public Result deleteById(@PathVariable String id){
        labelService.deleteById(id);
        return new Result(true,StatusCode.OK,"删除成功");
    }

}
