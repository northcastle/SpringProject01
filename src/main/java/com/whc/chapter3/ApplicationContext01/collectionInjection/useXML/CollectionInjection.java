package com.whc.chapter3.ApplicationContext01.collectionInjection.useXML;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * author : whc
 * createTime:2019/8/10  15:16
 */
public class CollectionInjection {
    private List list;
    private Set set;
    private Map<String,Object> map;
    private Properties props;

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Set getSet() {
        return set;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public Properties getProps() {
        return props;
    }

    public void setProps(Properties props) {
        this.props = props;
    }

    public CollectionInjection() {
    }

    public CollectionInjection(List list, Set set, Map<String, Object> map, Properties props) {
        this.list = list;
        this.set = set;
        this.map = map;
        this.props = props;
    }

    @Override
    public String toString() {
        return "CollectionInjection{\n" +
                "list=" + list +
                ",\n set=" + set +
                ",\n map=" + map +
                ",\n props=" + props +
                ",\n}";
    }
}
