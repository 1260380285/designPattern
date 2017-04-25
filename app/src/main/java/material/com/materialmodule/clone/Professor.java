package material.com.materialmodule.clone;

/**
 * @author: yuanbing
 * @date: 2017-04-25 21:25
 * @description <描述当前版本功能>
 */
public class Professor {
    String name;
    int age;

    Professor(String name, int age) {
        this.name = name;
        this.age = age;
    }


    //Student实现了Cloneable接口
    static class Student implements Cloneable {
        String name;//常量对象。
        int age;
        Professor p;

        Student(String name, int age, Professor p) {
            this.name = name;
            this.age = age;
            this.p = p;
        }

        public Object clone() {
            Student o = null;
            try {
                o = (Student) super.clone();
                //使用Object类的clone()方法,下面这个会是深拷贝
                o.p = (Professor) this.p.clone();
            } catch (CloneNotSupportedException e) {
                System.out.println(e.toString());
            }
            return o;
        }

    }

    public static void main(String[] args) {
        Professor p = new Professor("wangwu", 50);
        Student s1 = new Student("zhangsan", 18, p);
        Student s2 = (Student) s1.clone();
        s2.p.name = "lisi";
        s2.p.age = 30;
        //学生1的教授也变成了lisi,age为30
        System.out.println("name=" + s1.p.name + "," + "age=" + s1.p.age);
    }
}
