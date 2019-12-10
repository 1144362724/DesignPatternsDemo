package com.company.filterMode.core;

import java.util.ArrayList;
import java.util.List;

/**
 * 女性
 * @author MGARY
 * @date 2019-11-27 下午3:20
 */
public class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<>();
        for (Person person : persons) {
            if("MALE".equalsIgnoreCase(person.getGender())){
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
