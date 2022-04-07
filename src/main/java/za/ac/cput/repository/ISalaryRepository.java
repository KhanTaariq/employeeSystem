package za.ac.cput.repository;

import za.ac.cput.domain.Salary;

import java.util.Set;

public interface ISalaryRepository extends IRepository<Salary, String> //replace ObjT & ID
{
    // create read update delete
    public Set<Salary> getAll();
}
//generics