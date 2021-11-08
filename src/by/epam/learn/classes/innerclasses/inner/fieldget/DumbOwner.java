package by.epam.learn.classes.innerclasses.inner.fieldget;

public class DumbOwner {
    private int id;
    private static int range;
    public class DumberInner{
        private int id;
        public void setId(int id) {
            this.id = id + DumbOwner.this.id * DumbOwner.range; // или просто range
        }
    }
}
