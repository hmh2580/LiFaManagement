package cn.edu.guet;

import cn.edu.guet.mapper.ServiceTypeMapper;
import cn.edu.guet.model.ServiceType;
import cn.edu.guet.service.IServiceTypeService;
import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/applicationContext.xml")
public class SpringTest {

/*
    @Autowired
    IServiceTypeService serviceTypeService;


    @Test
    public void testMenu() throws Exception{

        ServiceType serviceType=new ServiceType ();

        serviceType.setServiceId ( "104" );
        serviceType.setServiceName ( "拉直" );
        serviceType.setCommoney ( 10.0f );
        serviceType.setPrice ( 100.0f );
        serviceTypeService.saveServiceType ( serviceType );
        System.out.println ( JSON.toJSON ( serviceType ) );


    }

    @Test
    public void testallservicetype(){
        List<ServiceType> servicetypes=serviceTypeService.getAllServiceType ();
        for(ServiceType servicetype:servicetypes){
            System.out.println(servicetype);
        }
        for(int i=0;i<servicetypes.size();i++){
            System.out.println(servicetypes.get(i).getServiceId());
            System.out.println(servicetypes.get(i).getServiceName());
            System.out.println(servicetypes.get(i).getCommoney ());
        }


    }
*/

}