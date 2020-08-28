package cn.edu.guet.mapper;

import cn.edu.guet.dt.ServiceTypeDto;
import cn.edu.guet.model.ServiceType;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface ServiceTypeMapper {

    void saveServiceType( ServiceType serviceType) throws Exception;
    List<ServiceType> selectServiceType(String serviceName);
    List<ServiceType> getAllServiceType();
    void updateServiceType(ServiceType serviceType) throws Exception;
    void deleteServiceType(String serviceId) throws Exception;
    List<String> getAllStype();
    List<ServiceType> searchStypeService(String stype);
    List<ServiceType> getStateService(String state);
}
