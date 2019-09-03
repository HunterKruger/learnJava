package MultiThread;

/**
 * Created by FY on 16/12/13.
 */
public class MultiThreadEatMusic {
    public static void main(String[] args) {
        ThreadMusic threadMusic =new ThreadMusic();
        ThreadEat threadEat=new ThreadEat();
        threadMusic.start();
        threadEat.start();
    }

}
