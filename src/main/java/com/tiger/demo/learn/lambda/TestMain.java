package com.tiger.demo.learn.lambda;

import java.util.*;
import java.util.function.Predicate;

import static java.util.stream.Collectors.*;

/**
 * lambda学习
 * https://www.cnblogs.com/franson-2016/p/5593080.html
 */
public class TestMain {
    static String [] nameArray = {"Cady","Able","Bob"};

    static List<Person> javaProgrammers = new ArrayList<Person>() {
        {
            add(new Person("Elsdon", "Jaycob", "Java programmer", "male", 43, 2100));
            add(new Person("Tamsen", "Brittany", "Java programmer", "female", 23, 1500));
            add(new Person("Floyd", "Donny", "Java programmer", "male", 33, 1800));
            add(new Person("Sindy", "Jonie", "Java programmer", "female", 32, 1600));
            add(new Person("Vere", "Hervey", "Java programmer", "male", 22, 1200));
            add(new Person("Maude", "Jaimie", "Java programmer", "female", 27, 1900));
            add(new Person("Shawn", "Randall", "Java programmer", "male", 30, 2300));
            add(new Person("Jayden", "Corrina", "Java programmer", "female", 35, 1700));
            add(new Person("Palmer", "Dene", "Java programmer", "male", 33, 2000));
            add(new Person("Addison", "Pam", "Java programmer", "female", 34, 1300));
        }
    };

    static List<Person> phpProgrammers = new ArrayList<Person>() {
        {
            add(new Person("Jarrod", "Pace", "PHP programmer", "male", 34, 1550));
            add(new Person("Clarette", "Cicely", "PHP programmer", "female", 23, 1200));
            add(new Person("Victor", "Channing", "PHP programmer", "male", 32, 1600));
            add(new Person("Tori", "Sheryl", "PHP programmer", "female", 21, 1000));
            add(new Person("Osborne", "Shad", "PHP programmer", "male", 32, 1100));
            add(new Person("Rosalind", "Layla", "PHP programmer", "female", 25, 1300));
            add(new Person("Fraser", "Hewie", "PHP programmer", "male", 36, 1100));
            add(new Person("Quinn", "Tamara", "PHP programmer", "female", 21, 1000));
            add(new Person("Alvin", "Lance", "PHP programmer", "male", 38, 1600));
            add(new Person("Evonne", "Shari", "PHP programmer", "female", 40, 1800));
        }
    };

    /**
     * 对list进行遍历
     */
    public static void learn1(){

        List<String> names = Arrays.asList(nameArray);
        //传统写法
        for (String name : names) {
            System.out.println("My name is "+name);
        }
        //lambda写法
        names.forEach(lambdaName -> System.out.println("My name is "+lambdaName));
    }

    /**
     * 线程的启动
     */
    public static void learn2(){
        //传统写法
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("learn lambda!");
            }
        }).start();
        //lambda写法
        new Thread(()-> System.out.println("learn lambda!")).start();
    }

    /**
     * Comparator类集合排序
     */
    public static void learn3(){
        //传统写法
        Arrays.sort(nameArray, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });
        //lambda写法
        Arrays.sort(nameArray,(String str1,String str2) -> str1.compareTo(str2));

    }

    /**
     * Stream对集合进行操作
     */
    public static void learn4(){
        //lambda写法
        System.out.println("给程序员加薪 5% :");
        javaProgrammers.forEach(e -> e.setSalary(e.getSalary() / 100 * 5 + e.getSalary()));
        System.out.println("下面是月薪超过 $1,400 的PHP程序员:");
        phpProgrammers.stream().filter(person -> person.getSalary()>1400).forEach(person -> System.out.println(person.getFirstName()));
    }

    /**
     * Stream: filter ...对集合进行操作
     */
    public static void learn5(){
        //lambda写法
        // 定义 filters
        Predicate<Person> ageFilter = (p) -> (p.getAge() > 25);
        Predicate<Person> salaryFilter = (p) -> (p.getSalary() > 1400);
        Predicate<Person> genderFilter = (p) -> ("female".equals(p.getGender()));
        System.out.println("下面是年龄大于 24岁且月薪在$1,400以上的女PHP程序员:");
        phpProgrammers.stream()
                .filter(ageFilter)
                .filter(salaryFilter)
                .filter(genderFilter)
                .forEach((p) -> System.out.printf("%s %s; ", p.getFirstName(), p.getLastName()));


        //limit方法,可以限制结果集的个数
        System.out.println("最前面的3个女性 Java programmers:");
        javaProgrammers.stream()
                .filter(genderFilter)
                .limit(3)
                .forEach((p) -> System.out.printf("%s %s; ", p.getFirstName(), p.getLastName()));

        //sorted方法,排序
        System.out.println("根据 name 排序,并显示前5个 Java programmers:");
        List<Person> sortedJavaProgrammers = javaProgrammers
                .stream()
                .sorted((p, p2) -> (p.getFirstName().compareTo(p2.getFirstName())))
                .limit(5)
                .collect(toList());
        sortedJavaProgrammers.forEach((p) -> System.out.printf("%s %s; %n", p.getFirstName(), p.getLastName()));

        //min方法,排序
        System.out.println("工资最低的 Java programmer:");
        Person pers = javaProgrammers
                .stream()
                .min((p1, p2) -> (p1.getSalary() - p2.getSalary()))
                .get();
        System.out.printf("Name: %s %s; Salary: $%,d.", pers.getFirstName(), pers.getLastName(), pers.getSalary());

        //max方法,排序
        System.out.println("工资最高的 Java programmer:");
        Person person = javaProgrammers
                .stream()
                .max((p, p2) -> (p.getSalary() - p2.getSalary()))
                .get();
        System.out.printf("Name: %s %s; Salary: $%,d.", person.getFirstName(), person.getLastName(), person.getSalary());

        //collect方法 将我们的结果集放到一个字符串,一个 Set 或一个TreeSet中
        System.out.println("将 PHP programmers 的 first name 拼接成字符串:");
        String phpDevelopers = phpProgrammers
                .stream()
                .map(Person::getFirstName)
                .collect(joining(" ; ")); // 在进一步的操作中可以作为标记(token)
        System.out.println(phpDevelopers);

        System.out.println("将 Java programmers 的 first name 存放到 Set:");
        Set<String> javaDevFirstName = javaProgrammers
                .stream()
                .map(Person::getFirstName)
                .collect(toSet());
        javaDevFirstName.forEach(name-> System.out.println(name));

        System.out.println("将 Java programmers 的 first name 存放到 TreeSet:");
        TreeSet<String> javaDevLastName = javaProgrammers
                .stream()
                .map(Person::getLastName)
                .collect(toCollection(TreeSet::new));
        javaDevLastName.forEach(name-> System.out.println(name));

    }

    /**
     * Streams 还可以是并行的(parallel) 计算总和
     */
    public static void learn6(){
        //lambda写法
        System.out.println("计算付给 Java programmers 的所有money:");
        int totalSalary = javaProgrammers
                .parallelStream()
                .mapToInt(p -> p.getSalary())
                .sum();
        System.out.println(totalSalary);
    }

    /**
     * 计算 count, min, max, sum, and average for numbers
     */
    public static void learn7(){
        //lambda写法
        System.out.println("计算 count, min, max, sum, and average for numbers ");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        IntSummaryStatistics stats = numbers
                .stream()
                .mapToInt((x) -> x)
                .summaryStatistics();

        System.out.println("List中最大的数字 : " + stats.getMax());
        System.out.println("List中最小的数字 : " + stats.getMin());
        System.out.println("所有数字的总和   : " + stats.getSum());
        System.out.println("所有数字的平均值 : " + stats.getAverage());
    }

    /*public static void learn7(){
        PackEntity inputPack = packList.stream()
                .filter((p) -> (p.getUnitDictionaryId() == unitDictionaryId.intValue()))
                .findFirst().get();
    }*/


    public static void main(String[] args) {
//        learn1();
//        learn2();
//        learn3();
//        learn4();
//        learn5();
          learn6();
          learn7();
    }
}
