class World {
    private String name; private long age; private String color;

    public String getName() {return name;}
    public long getAge() {return age;}
    public String getColor() {return color;}

    public void setAge(long age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class test5{
    public static void main(String[] args) {
        World w =new World(); w.setName("Erath");
        w.setAge(400000000); w.setColor("Blue");
        System.out.println("world name :-"+w.getName());
        System.out.println("world age :-"+w.getAge());
        System.out.println("World color :-"+w.getColor());
    }
}