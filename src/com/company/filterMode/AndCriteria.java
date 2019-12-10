package com.company.filterMode;

import com.company.filterMode.core.Criteria;
import com.company.filterMode.core.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @author MGARY
 * @date 2019-11-27 下午3:20
 */
public class AndCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
        return otherCriteria.meetCriteria(firstCriteriaPersons);
    }

}
