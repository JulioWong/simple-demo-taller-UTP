import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import com.utp.taller.demo.service.Bar;
import com.utp.taller.demo.service.BarImpl;

public class FooTest {
	
	@Test
    public void validateSizeMap() {
		Bar bar = new BarImpl();
		assertEquals(4, bar.getResult().size());
    }
}
