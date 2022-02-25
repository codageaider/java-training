package day10;

import day9.Student;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.hibernate.Session;
import utils.Utility;

import java.util.List;

/*
various ways to fetch data
(i) session.get(Student.class,1) -> return you the student object
(ii) HQL -> hibernate query language
(iii) Hibernate criteria API

criteria -> marks > 40
 HQL -> from Student
 SQL -> select * from student_records
 aggregate functions, where, groupby -> converted to Java functions.

select * from student where marks > 90

Q-)
write a query which returns the records for the student with name student-1 or student-2
Q-) Use an aggregate function like avg to find the average marks or sum function.
Q-) write a groupby query using criteria api
Q-) write a groupby clause that returns the name and count of records in the table for that particular name.

Any advantage you can think of Using Criteria API over SQL and HQL?
*) If you can write a code that works everywhere and in future it leads to minimal
number of changes
*) Criteria api there is less chance of making erros in writing queries
"select * from user group by name order by desc"
"select * from user group by name order by desc" +" ljk"

Bad approach to use strings directly which have an internal meaning
When you code in this way the detection of errors become very late.
By using Criteria API we will be able to detect errors at compile time rather than runtime.
*) It conveys more meaning.
String sql = "select * from user" <-- This is a query
Query query;


criteria builder is providing useful methods to build a criteria
criteria query is a query with a criteria-> is provided by criteria builder
 */
public class CriteriaAPIExample {
    public static void main(String[] args) {
        Session session = Utility.getSession();
        CriteriaQuery<Student> critertiaQuery = betweenMethod(session);
        // predicate means a condition that is evaluated to true or false
// from Student wher marks > 90

        System.out.println(session.createQuery(critertiaQuery).getResultList());

    }

    private static CriteriaQuery<Student> betweenMethod(Session session) {
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaQuery<Student> critertiaQuery = criteriaBuilder.createQuery(Student.class);
        Root<Student> root = critertiaQuery.from(Student.class);
        critertiaQuery.select(root).where(criteriaBuilder.between(root.get("marks"), 10, 20));
        return critertiaQuery;
    }

    private static CriteriaQuery<Student> ltMethod(Session session) {
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaQuery<Student> critertiaQuery = criteriaBuilder.createQuery(Student.class);
        Root<Student> root = critertiaQuery.from(Student.class);
        critertiaQuery.select(root).where(criteriaBuilder.lt(root.get("marks"), 10));
        critertiaQuery.select(root).where(criteriaBuilder.lt(root.get("marks"), 10));

        return critertiaQuery;
    }

    private static CriteriaQuery<Student> gtMethod(Session session) {
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaQuery<Student> critertiaQuery = criteriaBuilder.createQuery(Student.class);
        Root<Student> root = critertiaQuery.from(Student.class);
        critertiaQuery.select(root).where(criteriaBuilder.gt(root.get("marks"), 90));
        return critertiaQuery;
    }

    private static void selectQuery() {
        Session session = Utility.getSession();
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaQuery<Student> critertiaQuery = criteriaBuilder.createQuery(Student.class);
        Root<Student> root = critertiaQuery.from(Student.class);
        /*
        root is like root of a tree.
        Binary Trees in algorithm or in general what is a tree in a graph
         */
        critertiaQuery.select(root);
        System.out.println(session.createQuery(critertiaQuery).getResultList());
    }

    private static CriteriaQuery<Double> average(Session session) {
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaQuery<Double> criteriaQuery = criteriaBuilder.createQuery(Double.class);
        Root<Student> root = criteriaQuery.from(Student.class);
        criteriaQuery.select(criteriaBuilder.avg(root.get("marks")));
        return criteriaQuery;
    }


    private static CriteriaQuery<Object[]> groupbyname(Session session) {
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaQuery<Object[]> criteriaQuery = criteriaBuilder.createQuery(Object[].class);
        Root<Student> root = criteriaQuery.from(Student.class);
        criteriaQuery.multiselect(root.get("name"), criteriaBuilder.count(root.get("name"))).groupBy(root.get("name"));
        return criteriaQuery;
    }

    private static void groupedBy(Session session) {
        CriteriaBuilder builder = session.getCriteriaBuilder();

        CriteriaQuery<Object[]> criteriaQuery = builder.createQuery(Object[].class);
        Root<Student> root = criteriaQuery.from(Student.class);
        criteriaQuery.multiselect(root.get("name"), builder.count(root.get("name")));
        criteriaQuery.groupBy(root.get("name"));
        List<Object[]> resultList = session.createQuery(criteriaQuery).getResultList();
        resultList.forEach(student -> System.out.println("Student Name: " + student[0] + "\t count : " + student[1]));

    }


}
