public class Bar implements Foo{

    protected int x;
    protected int y;
    protected FooFoo fooFoo;

    public Bar(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setFooFoo(){
        this.fooFoo = null;
    }

    public FooFoo getFooFoo(){
        return this.fooFoo;
    }

    @Override
    public int myMethod() {
        return this.x + this.y;
    }

}
