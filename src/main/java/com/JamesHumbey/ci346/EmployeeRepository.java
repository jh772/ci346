package com.JamesHumbey.ci346;


import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by James1
 */
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long> {

}