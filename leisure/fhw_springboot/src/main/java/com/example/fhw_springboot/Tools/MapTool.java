package com.example.fhw_springboot.Tools;

import org.dozer.Mapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

@Component
public class MapTool {
    private Mapper mapper;
    public <T> T mapObj(Object sourceObj,Class<T> toClass){
        if(sourceObj==null){
            return null;
        }
        return mapper.map(sourceObj,toClass);
    }

    /**
     * 实现集合类型的对象clone
     * @param sourceList
     * @param destinationClass
     * @return
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public <T> List<T> mapList(Collection sourceList, Class<T> destinationClass) {
        if(sourceList == null){
            return null;
        }
        List destinationList = new ArrayList();
        for (Iterator i = sourceList.iterator(); i.hasNext();){
            Object sourceObject = i.next();
            Object destinationObject = mapObj(sourceObject,destinationClass);
            destinationList.add(destinationObject);
        }
        return destinationList;
    }
}
