package com.springcore.propertiesfile.beans;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("pInfo")
//@PropertySource("Info.properties")
public class PersonInfo {
    //injecting the values of properties file to spring bean properties
    @Value("${per.id}")
    private String id;
    @Value("${per.name}")
    private String name;
    @Value("${per.addrs}")
    private String addrs;
    //injecting the direct values to spring bean properties
    @Value("9898989898")
    private Long mobileno;
    //injecting system property values to spring bean properties
    @Value("${os.name}")
    private String os_name;
    @Value("${os.version}")
    private String os_ver;
    //injecting envt variables
    @Value("${Path}")
    private String path_data;

    @Override
    public String toString() {
        return "PersonInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", addrs='" + addrs + '\'' +
                ", mobileno=" + mobileno +
                ", os_name='" + os_name + '\'' +
                ", os_ver='" + os_ver + '\'' +
                ", path_data='" + path_data + '\'' +
                '}';
    }


}
