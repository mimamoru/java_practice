public class P14_4s{
    private String name;
    private String mastername;
    P14_4s(String name,String mastername){
        this.mastername=mastername;
        this.name=name;
    }
    public String getName() {
        return name;
    }
    public String getMastername() {
        return mastername;
    }
    public void introduce(){
        System.out.println("my name is "+name);
        System.out.println("my master's name is "+mastername);
    }
}