package cn.edu.guet.controller;

import cn.edu.guet.common.Result;
import cn.edu.guet.dt.ServiceTypeDto;
import cn.edu.guet.model.ServiceType;
import cn.edu.guet.service.IServiceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("serviceType")
public class ServiceTypeController {

    @Autowired
    IServiceTypeService serviceTypeService;


    @RequestMapping(value = "saveServiceType",method = {RequestMethod.POST})
    @ResponseBody
    public Result saveServiceType(@RequestBody ServiceType serviceType){
        try {
            serviceTypeService.saveServiceType ( serviceType );
        } catch (Exception e) {
            e.printStackTrace ();
            return Result.fail ( "添加失败，请联系管理员" );
        }
        return Result.succ ( "添加成功" );

    }

    @RequestMapping(value = "getAllServiceType",method = {RequestMethod.GET})
    @ResponseBody
    public Result getAllServiceType(){
        return Result.succ (serviceTypeService.getAllServiceType ());


    }

    @RequestMapping(value = "selectServiceType",method = {RequestMethod.GET})
    @ResponseBody
    public Result selectServiceType(String serviceName){
        return Result.succ ( serviceTypeService.selectServiceType ( serviceName ) );

    }

    @RequestMapping(value = "updateServiceType",method = {RequestMethod.POST})
    @ResponseBody
    public Result updateServiceType(@RequestBody ServiceType serviceType){
        try {
            serviceTypeService.updateServiceType ( serviceType );
        } catch (Exception e) {
            e.printStackTrace ();
            return Result.fail ( "修改失败，请联系管理员" );
        }
        return Result.succ ( "修改成功" );
    }

    @RequestMapping(value = "deleteServiceType",method = {RequestMethod.POST})
    @ResponseBody
    public Result deleteServiceType(String serviceId ){
        try {
            serviceTypeService.deleteServiceType ( serviceId);
        } catch (Exception e) {
            e.printStackTrace ();
            return Result.fail ( "删除失败，请联系管理员" );
        }
        return Result.succ ( "删除成功" );
    }

    @RequestMapping(value = "getAllStype",method = {RequestMethod.GET})
    @ResponseBody
    public Result getAllSetype(){
        return Result.succ ( serviceTypeService.getAllStype () );

    }

    @RequestMapping(value = "searchStypeService",method = {RequestMethod.GET})
    @ResponseBody
    public Result searchStypeService(String stype){
        return Result.succ ( serviceTypeService.searchStypeService ( stype ) );

    }

    @RequestMapping(value = "getStateService",method = {RequestMethod.GET})
    @ResponseBody
    public Result getStateService(String state){
        return Result.succ (serviceTypeService.getStateService (state));


    }

}
