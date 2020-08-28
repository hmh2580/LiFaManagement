package cn.edu.guet.service.impl;

import cn.edu.guet.dt.ServiceTypeDto;
import cn.edu.guet.mapper.ServiceTypeMapper;
import cn.edu.guet.model.ServiceType;
import cn.edu.guet.service.IServiceTypeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ServiceTypeServiceImpl implements IServiceTypeService {
    @Autowired
    ServiceTypeMapper serviceTypeMapper;


    @Override
    public List <ServiceType> selectServiceType(String serviceName){
        return serviceTypeMapper.selectServiceType ( serviceName );
    }

    @Override
    public void saveServiceType(ServiceType serviceType) throws Exception{
        serviceTypeMapper.saveServiceType ( serviceType );
    }

    @Override
    public List<ServiceType> getAllServiceType() {
        return serviceTypeMapper.getAllServiceType ();
    }

    @Override
    public void updateServiceType(ServiceType serviceType) throws Exception{
        serviceTypeMapper.updateServiceType ( serviceType );
    }

    @Override
    public void deleteServiceType(String serviceId) throws Exception {
        serviceTypeMapper.deleteServiceType ( serviceId);
    }

    @Override
    public List <String> getAllStype() {
        return serviceTypeMapper.getAllStype ();
    }

    @Override
    public List <ServiceType> searchStypeService(String stype) {
        return serviceTypeMapper.searchStypeService ( stype );
    }

    @Override
    public List <ServiceType> getStateService(String state) {
        return serviceTypeMapper.getStateService (state);
    }
}
