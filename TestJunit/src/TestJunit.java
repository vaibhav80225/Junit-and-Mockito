import org.junit.*;
public class TestJunit {
	@Test
	public void testAdd(){
		String str = "junit is work fine";
		Assert.assertEquals("junit is work  fine", str);
	}
}
