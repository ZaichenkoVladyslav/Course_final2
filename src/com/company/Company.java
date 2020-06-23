/*
 *
 * Classname: Company
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

public class Company {
    // parent for this company nullable,
    // when there is no parent for this company
    private Company parent;
    private long employeesCount;

    // default empty constructor
    public Company() {
    }

    // default constructor with parameters: parent, employeesCount
    public Company(Company parent, long employeesCount) {
        this.parent = parent;
        this.employeesCount = employeesCount;
    }

    // Getters and Setters for class Company
    public Company getParent() {
        return parent;
    }

    public void setParent(Company parent) {
        this.parent = parent;
    }

    public long getEmployeesCount() {
        return employeesCount;
    }

    public void setEmployeesCount(long employeesCount) {
        this.employeesCount = employeesCount;
    }

    // Method toString() for class Company
    @Override
    public String toString() {
        return "Company { " +
                "parent = " + parent +
                ", employeesCount = " + employeesCount +
                '}';
    }
}
