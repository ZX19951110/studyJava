public class test extends person implements functions{
    private String name;
    public test(String name){
        this.name = name;
    }
    @Override
    public String getName(){
        return this.name;
    }
    public void sleep(){
        System.out.println("Sleeping...");
    }
    public void eat(){
        System.out.println("Eating...");
    }
    public static void main (String args[]){
        test zhanxu = new test("zhanxu");
        System.out.println(zhanxu.name);
    }
}

