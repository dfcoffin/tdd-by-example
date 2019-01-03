package guru.springframework;

/**
 * Created by Donald F. Coffin 2019/01/03 at 01:11
 */
public class Dollar {

    int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    void times(int multiplier) {
        amount *= multiplier;
    }
}
