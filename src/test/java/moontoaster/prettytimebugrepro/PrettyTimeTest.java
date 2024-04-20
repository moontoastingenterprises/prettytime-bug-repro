package moontoaster.prettytimebugrepro;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.Date;
import java.util.Locale;
import org.ocpsoft.prettytime.PrettyTime;

public class PrettyTimeTest
{
  Date reference = new Date(1000 * 60 * 10);
  Date date = new Date(0);

  PrettyTime prettyTime = new PrettyTime(reference, new Locale("uk"));

  @Test
  public void testFormatRounded()
  {
    assertEquals("10 хвилин тому", prettyTime.format(date));
  }

  @Test
  public void testFormatUnrounded()
  {
    assertEquals("10 хвилин тому", prettyTime.formatUnrounded(date));
  }
}
