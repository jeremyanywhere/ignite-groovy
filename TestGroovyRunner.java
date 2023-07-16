import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;

public class TestGroovyRunner {
   public static void main (String[] args) throws IOException {
      GroovyRunner gr = new GroovyRunner();
      Map<String, Object> bindings = new HashMap<String, Object>();
      File f = new File("./runme.groovy");
      String scriptText = Files.readString(f.toPath(), StandardCharsets.UTF_8);

      RemotableGroovyScript rgs; 
      String[] stringArray = {"Jeremy", "Jezmeister", "The Enjezerator"};

      // Access and use the elements of the string array
      for (String str : stringArray) {
         bindings.put("name", str);
         rgs = new RemotableGroovyScript(scriptText, bindings);
         gr.apply(rgs);
      }
   }
}
