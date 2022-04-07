package za.ac.cput.repository;

public interface IRepository<ObjT, ID> //ObjT replaces object type e.g. salary //ID passing through id
{
    ObjT create(ObjT objt);
    ObjT read(ID id);
    ObjT update(ObjT objt);
    boolean delete(ID id);
}
//level of abstraction
//generics