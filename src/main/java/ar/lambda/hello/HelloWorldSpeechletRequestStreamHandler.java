package ar.lambda.hello;

import com.amazon.speech.speechlet.lambda.SpeechletRequestStreamHandler;

import java.util.HashSet;
import java.util.Set;

public class HelloWorldSpeechletRequestStreamHandler extends SpeechletRequestStreamHandler {

  private static final Set<String> supportedApplicationIds = new HashSet<String>();

  static {
    supportedApplicationIds.add("amzn1.echo-sdk-ams.app.d8b2497c-dc9d-4646-aa34-307a94bf9e66");
  }

  public HelloWorldSpeechletRequestStreamHandler() {
    super(new HelloWorldSpeechlet(), supportedApplicationIds);
  }

}
