package aQute.libg.glob;

import junit.framework.TestCase;

public class GlobTest extends TestCase {
	public static void testSimple() {
		Glob glob = new Glob("*foo*");
		assertTrue(glob.matcher("foo").find());
		assertTrue(glob.matcher("food").find());
		assertTrue(glob.matcher("Xfoo").find());
		assertTrue(glob.matcher("XfooY").find());
		assertFalse(glob.matcher("ood").find());
	}

	public static void testUrl() {
		Glob glob;

		glob = new Glob("http://www.example.com/*");
		assertTrue(glob.matcher("http://www.example.com/repository.xml").find());
		assertFalse(glob.matcher("https://www.example.com/repository.xml").find());

		glob = new Glob("http://*.example.com/*");
		assertTrue(glob.matcher("http://www.example.com/repository.xml").find());
		assertTrue(glob.matcher("http://foo.example.com/repository.xml").find());
		assertFalse(glob.matcher("http://example.com/repository.xml").find());
		assertFalse(glob.matcher("http://foo.exampleXcom/repository.xml").find());
	}
}
