/***
By default interface have:-
1.)All Methods are public and abstract.                         
2.)All Fields public,static,final.				

Interface provides 100% abstraction.
Through Interface we can achieve multiple inheritance in java.

jdk 1.8 allows us to define methods(defined either default or static-->restriction) inside interfaces 

Similarities b/w Interface and Abstract class:-
1.)Interface cannot be instantiated(new InterfaceName()) but their reference(IntefaceName obj) can be created.
2.)We need to re-implement all the methods inside the child class.

Class can implement multiple interfaces.
Interface can extend multiple interfaces.

***/

--------------------------------------------------------------------------------------------

interface I1{
....
}


interface I2{
....
}


interface I3 extends I1,I2{
.......
}


class A{
.......
}

class B extends A implements I1,I2{
.......
}