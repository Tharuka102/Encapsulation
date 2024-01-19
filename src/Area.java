class Area {
    private int length;
    private int width;


    Area(int length,int width){
        this.length =length;
        this.width = width;
    }
    public void getArea(){
        int area =length * width;
        System.out.println("Area ;-"+ area);
    }

}
class test1 {
    public static void main(String[] args) {
        Area a= new Area(34,34);
        a.getArea();
    }
}