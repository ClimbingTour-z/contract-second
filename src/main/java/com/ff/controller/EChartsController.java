package com.ff.controller;

import com.ff.model.Compact;
import com.ff.serivce.EChartsService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "echarts")
public class EChartsController {
    @Autowired
    EChartsService eChartsService;

    private static Log log = LogFactory.getLog(EChartsController.class);

    /**
     * 合同总额
     * @return
     */
    @RequestMapping(value ="/checkCA")
    public String checkCA(){
        return "management/chartsCA";
    }

    @RequestMapping(value = "/recordCA")
    public @ResponseBody
    Object getRecord(){
        List<Compact> compactList = eChartsService.selectCA();
        System.out.print(compactList);
        return compactList;
    }

    /**
     * 回款情况
     * @return
     */
    @RequestMapping(value ="/checkRS")
    public String checkRS(){
        return "management/chartsRS";
    }

    @RequestMapping(value = "/recordRS")
    public @ResponseBody
    Object getRecord2(){
        List<Compact> compactList = eChartsService.selectRS();
        System.out.print(compactList);
        return compactList;
    }



}
