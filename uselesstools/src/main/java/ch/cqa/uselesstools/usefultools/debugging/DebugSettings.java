package ch.cqa.uselesstools.usefultools.debugging;

import net.minecraft.util.math.vector.Vector3d;

import java.util.*;

public class DebugSettings {

  public static synchronized void setDebugParameter(String parameterName, double value) {
    debugParameters.put(parameterName, Optional.of(value));
  }

  public static synchronized void clearDebugParameter(String parameterName) {
    debugParameters.put(parameterName, Optional.empty());
  }

  /**
   * Gets the value of the given debug parameter; or empty if not previously set.
   * @param parameterName
   * @return
   */
  public static synchronized Optional<Double> getDebugParameter(String parameterName) {
    Optional<Double> value = debugParameters.get(parameterName);
    if (value == null) {
      debugParameters.put(parameterName, Optional.empty());
      return Optional.empty();
    }
    return value;
  }

  public static synchronized Set<String> listAllDebugParameters() {
    return debugParameters.keySet();
  }

  private static HashMap<String, Optional<Double>> debugParameters = new HashMap<>();

  //-----------

  public static synchronized void setDebugParameterVec3d(String parameterName, Vector3d value) {
    debugParameterVec3ds.put(parameterName, Optional.of(value));
  }

  public static synchronized void clearDebugParameterVec3d(String parameterName) {
    debugParameterVec3ds.put(parameterName, Optional.empty());
  }

  /**
   * Gets the value of the given debug parameter; or 0 if not previously set
   * @param parameterName
   * @return
   */
  public static synchronized Optional<Vector3d> getDebugParameterVec3d(String parameterName) {
    Optional<Vector3d> value = debugParameterVec3ds.get(parameterName);
    if (value == null) {
      debugParameterVec3ds.put(parameterName, Optional.empty());
      return Optional.empty();
    }
    return value;
  }

  public static synchronized Set<String> listAllDebugParameterVec3ds() {
    return debugParameterVec3ds.keySet();
  }

  private static HashMap<String, Optional<Vector3d>> debugParameterVec3ds = new HashMap<>();

  //-----------

  public static synchronized void setDebugTrigger(String parameterName) {
    debugTriggers.put(parameterName, true);
  }

  /**
   * Returns true if the trigger is set.  Resets to false.
   * @param parameterName
   * @return
   */
  public static synchronized boolean getDebugTrigger(String parameterName) {
    Boolean value = debugTriggers.getOrDefault(parameterName, false);
    debugTriggers.put(parameterName, false);
    return value;
  }

  public static synchronized Set<String> listAllDebugTriggers() {
    return debugTriggers.keySet();
  }

  private static HashMap<String, Boolean> debugTriggers = new HashMap<>();

  //-----------------

  public static synchronized void setDebugTest(int testnumber) {
    debugTest = testnumber;
  }

  /**
   * Checks the specified range of test numbers and returns the currently triggered test number if it lies within the checked range.
   * If the currently triggered test lies within the checked range, it is reset
   * Beware - if you have multiple callers looking for debug tests in the same range using getDebugTest, only the first caller will ever find one.
   *
   * eg:
   * 1) caller calls setDebugTest(65)
   * 2a) getDebugTest(0, 10) returns NO_TEST_TRIGGERED
   * 2b) getDebugTest(60, 65) returns NO_TEST_TRIGGERED
   * 2c) getDebugTest(60, 66) returns 65
   * 2d) calling getDebugTest(60, 66) for a second time now returns NO_TEST_TRIGGERED
   *
   * @param testNumberMin lowest test number to check
   * @param  testNumberMaxPlusOne highest test number to check plus one
   * @return the test number to execute, or NO_TEST_TRIGGERED if none triggered
   */
  public static synchronized int getDebugTest(int testNumberMin, int testNumberMaxPlusOne) {
    if (debugTest < testNumberMin || debugTest >= testNumberMaxPlusOne) return NO_TEST_TRIGGERED;
    int value = debugTest;
    debugTest = NO_TEST_TRIGGERED;
    return value;
  }

  public static final int NO_TEST_TRIGGERED = -1;
  private static int debugTest = NO_TEST_TRIGGERED;
}
