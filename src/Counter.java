/**
 * @author Yihao Pei
 * @version 1.0
 *
 */
public class Counter {
    private int count;
    private int max;

    /**
     * This is a constructor of Counter
     * reset the count to zero and max to 10
     */

    public Counter() {
        this.count = 0;
        this.max = 10;
    }


    public int getCount() {
        return count;
    }

    public void setCount(int n) {
        this.count = n;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int n) {
        this.max = n;
    }

    public boolean increase() {
        this.count += 2;
        if (this.count >= this.max) {
            reset();
            return false;
        }
        return true;
    }

    public void increase(int n) {
        this.count = this.count + n;
    }


    public boolean decrease() {
        if (this.count == 0) {
            return false;
        } else {
            this.count -= 1;
            return true;
        }
    }

    public void decrease(int n) {
        this.count = this.count - n;
    }

    public void doubler() {
        this.count = this.count * 2;
    }

    public void reset() {
        this.count = 0;
        System.out.println("Counter Reset!");
    }


    public String toString() {
        return "Counter{count = " + count + ", max = " + max + "}";
    }
}
