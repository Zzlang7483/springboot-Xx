import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class LogTest {

    public static final Logger log =  LoggerFactory.getLogger(LogTest.class);

    @Test
    public void test(){
        log.error("错误");

    }

}
