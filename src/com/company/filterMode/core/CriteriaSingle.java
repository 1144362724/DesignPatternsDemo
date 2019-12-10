package com.company.filterMode.core;

import java.util.ArrayList;
import java.util.List;

/**
 * 单身
 *
 * @author MGARY
 * @date 2019-11-27 下午3:20
 */
public class CriteriaSingle implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if("SINGLE".equalsIgnoreCase(person.getMaritalStatus())){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }

}
