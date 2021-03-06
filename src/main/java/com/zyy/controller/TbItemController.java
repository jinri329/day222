package com.zyy.controller;

import com.zyy.service.ItemService;
import com.zyy.vo.LayuiTableResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/item")
public class TbItemController {
    @Autowired
    private ItemService itemService;
    //分页展示
    @RequestMapping("/showItemPage")
    @ResponseBody
    public LayuiTableResult findTbItemByPage(Integer page,Integer limit){
        //浏览器输入的地址为：。。。。item/showItemPage?page=1&limit=30
        //就要将json格式的数据返回到页面去
        //ResponseBody 注解会自动将对象转换为json格式输出到页面
        LayuiTableResult result = itemService.findTbItemByPage(page,limit);
        return result;
    }
}
