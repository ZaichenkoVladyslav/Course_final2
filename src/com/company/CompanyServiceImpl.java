/*
 *
 * Classname: CompanyServiceImpl
 *
 * @version 23.06.2020
 * @author Vladyslav Zaichenko

 * Module 4 task Final
 *
 *      COMPANY Service implementation - 15 points
 *
 *      1. Create a test set of companies in your main class.
 *
 *      2.  Take for this set  IT-companies:  Chief, Lawyer, Developer
 *      (Design,  Front-end, Back-end, DevOps). See attch.
 *
 *      3. Take into account 4 different cases  for a company
 *      ( on-top, on bottom, in the node,  out of chain)
 *
 *      4. Test all this cases in your main class.
 *
 *      5. Implement the interface in a class CompanyService.
 *
 *      Zaichenko Vladyslav KNUTE
 *
 */

package com.company;

import java.util.List;

public class CompanyServiceImpl implements ICompanyService {

    /*
     * @param child return top level parent for company
     */
    @Override
    public Company getTopLevelParent(Company child) {

       if (child.getParent() == null ){
           return child;
       }

       Company company = child;

       while (company.getParent() != null){
           company = company.getParent();
       }
        return company;
    }

    /*
     * Method getEmployeeCountForCompanyAndChildren
     * return total amount of employees from conpany
     */
    @Override
    public long getEmployeeCountForCompanyAndChildren
                        (Company company, List<Company> companies) {


        return company.getEmployeesCount();
    }
}
