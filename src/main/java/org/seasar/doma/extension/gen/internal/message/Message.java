package org.seasar.doma.extension.gen.internal.message;

import org.seasar.doma.extension.gen.MessageResource;

/** @author taedium */
public enum Message implements MessageResource {
  DOMAGEN0001("The parameter \"{0}\" is null."),
  DOMAGEN0003("GenerationType.IDENTITY is not supported for the RDBMS \"{0}\"."),
  DOMAGEN0004("GenerationType.SEQUENCE is not supported for the RDBMS \"{0}\"."),
  DOMAGEN0005(
      "Cannot get any tables. Check parameters such as url, dialectName, tableNamePattern and so on."),
  DOMAGEN0007("The mandatory parameter \"{0}\" is not specified."),
  DOMAGEN0013("The class \"{1}\" to which the parameter \"{0}\" refers is not found. {2}"),
  DOMAGEN0014(
      "The class \"{1}\" to which the parameter \"{0}\" refers must be a subtype of the class \"{2}\"."),
  DOMAGEN0015(
      "The class \"{1}\" to which the parameter \"{0}\" refers cannot be instantiated. The class \"{1}\" must have a public default constructor. {2}"),
  DOMAGEN0017("The class \"{0}\" is used as a dialect class."),
  DOMAGEN0018(
      "The column \"{1}\" of the table \"{0}\" is not mapped to any Java classes. So it will be mapped to java.lang.String. (The column data type is {2} and the JDBC SQL type is {3})"),
  DOMAGEN0019("The file is created. {0}"),
  DOMAGEN0020("The file is overwritten. {0}"),
  DOMAGEN0021(
      "The column \"{2}\" which corresponds to the property \"{1}\" of the entity class \"{0}\" is not defined in the table \"{3}\"."),
  DOMAGEN0022(
      "Cannot infer the property \"{1}\" from the property \"{0}\". Specify the property \"{1}\" explicitly."),

  DOMAGEN5001(
      "The JDBC driver may not be loaded. Check that the JDBC driver is in the classpath. If the JDBC driver is not loaded automatically, load it explicitly using Class.forName. ex) Class.forName(\"oracle.jdbc.driver.OracleDriver\")"),
  DOMAGEN5002("The url parameter is not specified."),

  DOMAGEN9001("The exception was thrown. {0}"),
  ;

  private final String messagePattern;

  private Message(String messagePattern) {
    this.messagePattern = messagePattern;
  }

  @Override
  public String getCode() {
    return name();
  }

  @Override
  public String getMessagePattern() {
    return messagePattern;
  }

  @Override
  public String getMessage(Object... args) {
    return MessageFormatter.getMessage(this, args);
  }
}
