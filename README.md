Spring Expression Language(SpEL)
This is used to perform dependency injection dynamically at runtime. This compiles at the runtime. They execute during bean creation time i.e compile time.

Using SpEL we can
1.	Refer to other beans by id attribute.
2.	Refer to the properties and invoke methods defined in other beans.
3.	Refer to the static constants and invoke static methods.
4.	Perform mathematical operations on values.
5.	Perform Relational and Logical comparisons.
6.	Perform Regular Expression Matching.
7.	Accessing Collections.

The key elements of syntax of Spring Expression Language are
1.	All Spring Expressions should be declared inside ${..} or #{…}
2.	Any bean can be directly accessed using the id attribute of the bean.
3.	Members and methods of a bean are accessed using the dot (.) notation. Same as java.
4.	Static class is reffered by using T(...)
5.	Standard mathematical operations such as +,* etc are used on numerical properties similar to java language.
6.	Standard relational operations such as <,<= etc similar to java can be used.
7.	Logical opertions such as and,or can be used.
8.	Matching with regular expression is done using the matches keyword.
9.	Regular expression syntax is similar to corresponding syntax in java.
10.	Individual elements within a list are accessed by using [].
11.	Filter operations on elements in a list are performed using .?[].
12.	Projection of elements in a List is performed using .![].
13.	Individual elements within a map are accessed by reffering to the corresponding key using [].
