package com.tiger.demo.learn.designmodel.Singleton;

public class SingletonDemo {

    class Car {
        public void run() {
            System.out.println("走。。。。");
        }
    }


    class XiaoMing {
        public Car travel() {
            System.out.println("小明去旅游");
            Car car = new Car();
            car.run();
            return car;
        }

        public Car goToSchool() {
            System.out.println("小明去学校");
            Car car = new Car();
            car.run();
            return car;
        }

        public Car getTogether() {
            System.out.println("小明参加聚会");
            Car car = new Car();
            car.run();
            return car;
        }
    }

    public void test(){
        XiaoMing xiaoMing = new XiaoMing();
        Car car1 = xiaoMing.travel();
        Car car2 = xiaoMing.goToSchool();
        Car car3 = xiaoMing.getTogether();
    }


}
