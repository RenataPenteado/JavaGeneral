package j04.encapsulation;


//this shouldn't compile
public class Foo {
    public void go() {
        int x =0;  //added initialization after verified that it doesn't compile
                   // without it -Tyler Boone
        int z = x + 3;
    }
}
