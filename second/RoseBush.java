package lecture9.second;


public class RoseBush extends Rose {

   Rose[] roseBush;

    public RoseBush(int size, String color, Rose[] roseBush) {
        super(size, color);
        this.roseBush = roseBush;
    }
}
