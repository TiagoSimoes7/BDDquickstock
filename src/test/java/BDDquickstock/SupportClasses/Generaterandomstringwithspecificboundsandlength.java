package BDDquickstock.SupportClasses;

import io.testproject.sdk.internal.addons.ActionProxy;
import io.testproject.sdk.internal.addons.ProxyDescriptor;
import java.lang.String;

/**
 * Proxy for Generate random string with specific bounds and length Addon */
public class Generaterandomstringwithspecificboundsandlength {
  /**
   * Factory method for GenerateRandomStringWithFormat */
  public static GenerateRandomStringWithFormat getGenerateRandomStringWithFormat() {
    return new GenerateRandomStringWithFormat();
  }

  /**
   * Factory method for GenerateRandomStringWithFormat
   * @param characters Characters to create the string from (Default Value = Random characters)
   * @param lengthOfString Length of generated string (Default Value = Random length) */
  public static GenerateRandomStringWithFormat generateRandomStringWithFormat(String characters,
      String lengthOfString) {
    return new GenerateRandomStringWithFormat(characters,lengthOfString);
  }

  /**
   * Generate random String with specific characters and length.  */
  public static class GenerateRandomStringWithFormat extends ActionProxy {
    /**
     * Characters to create the string from (Default Value = Random characters) (INPUT) */
    public String characters;

    /**
     * Length of generated string (Default Value = Random length) (INPUT) */
    public String lengthOfString;

    /**
     * Generated string (OUTPUT) */
    public String output;

    public GenerateRandomStringWithFormat() {
      this.setDescriptor(new ProxyDescriptor("isPuWQzkBU-t6MMgxY5QrA", "GenerateRandomStringWithFormat"));
    }

    public GenerateRandomStringWithFormat(String characters, String lengthOfString) {
      this();
      this.characters = characters;
      this.lengthOfString = lengthOfString;
    }
  }
}
