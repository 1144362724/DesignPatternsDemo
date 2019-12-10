package com.company.filterMode.core;

import java.util.List;

/**
 * 标准接口
 * @author MGARY
 * @date 2019-11-27 下午3:19
 */
public interface Criteria {
    List<Person> meetCriteria(List<Person> persons);
}
