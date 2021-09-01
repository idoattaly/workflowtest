public class Bar implements Foo{

    protected int x;
    protected int y;

    public Bar(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public int myMethod() {
        return this.x + this.y;
    }

}
