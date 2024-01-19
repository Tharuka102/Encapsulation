class Person {
    private int age ;
    public int getAge(){
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class test3{
    public static void main(String[] args) {
        Person p= new Person();
        p.setAge(45);
        System.out.println("Age is :- "+ p.getAge());
    }
}

