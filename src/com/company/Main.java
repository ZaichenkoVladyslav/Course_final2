/*
 *
 * Classname: Main
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

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        CompanyServiceImpl service = new CompanyServiceImpl();

        /*
         * Creation ArrayList with companies elements
         */
        List<Company> companies = new ArrayList<>();

        Company chief = new Company(null,12);
        Company lawyer = new Company(chief,10);
        Company developer = new Company(chief,15);
        Company backEnd = new Company(developer,20);
        Company frontEnd = new Company(developer,14);
        Company devOps = new Company(backEnd,11);
        Company design = new Company(frontEnd,17);
        Company accounting = new Company(null,6);

        // tests for all companies
        System.out.println("Parent company for company Chief is: \n"
                + service.getTopLevelParent(chief));
        System.out.println("Parent company for company Lawyer is: \n"
                + service.getTopLevelParent(developer));
        System.out.println("Parent company for company Developer is: \n"
                + service.getTopLevelParent(lawyer));
        System.out.println("Parent company for company Back-End is: \n"
                + service.getTopLevelParent(backEnd));
        System.out.println("Parent company for company Front-End is: \n"
                + service.getTopLevelParent(frontEnd));
        System.out.println("Parent company for company DevOps is: \n"
                + service.getTopLevelParent(devOps));
        System.out.println("Parent company for company Design is: \n"
                + service.getTopLevelParent(design));
        System.out.println("Parent company for company Accounting is: \n"
                + service.getTopLevelParent(accounting));

    }
}
