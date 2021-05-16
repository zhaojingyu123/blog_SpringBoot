package com.zjy.util;

import org.springframework.beans.BeanWrapperImpl;
import org.springframework.context.annotation.Bean;

import java.beans.PropertyDescriptor;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zhaojingy
 * @create 2021-03-02 7:35 上午
 */
public class MyBeanUtils {
    public static String[] getNullPropertyNames(Object source){
        BeanWrapperImpl beanWrapper = new BeanWrapperImpl(source);
        PropertyDescriptor[] pds = beanWrapper.getPropertyDescriptors();
        List<String> nullPropertyNames =new ArrayList<>();
        for (PropertyDescriptor pd : pds) {
            String name = pd.getName();
            if(beanWrapper.getPropertyValue(name)==null){
                nullPropertyNames.add(name);
            }
        }
        return nullPropertyNames.toArray(new String[nullPropertyNames.size()]);
    }
}
