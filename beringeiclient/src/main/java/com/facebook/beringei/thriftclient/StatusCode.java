package com.facebook.beringei.thriftclient;

/**

 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

import java.lang.reflect.*;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import com.facebook.thrift.IntRangeSet;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({ "unused" })
public class StatusCode {
  public static final int OK = 0;
  public static final int DONT_OWN_SHARD = 1;
  public static final int KEY_MISSING = 2;
  public static final int RPC_FAIL = 3;
  public static final int SHARD_IN_PROGRESS = 4;
  public static final int BUCKET_NOT_FINALIZED = 5;
  public static final int ZIPPY_STORAGE_FAIL = 6;
  public static final int MISSING_TOO_MUCH_DATA = 7;

  public static final IntRangeSet VALID_VALUES;
  public static final Map<Integer, String> VALUES_TO_NAMES = new HashMap<Integer, String>();

  static {
    try {
      Class<?> klass = StatusCode.class;
      for (Field f : klass.getDeclaredFields()) {
        if (f.getType() == Integer.TYPE) {
          VALUES_TO_NAMES.put(f.getInt(null), f.getName());
        }
      }
    } catch (ReflectiveOperationException e) {
      throw new AssertionError(e);
    }

    int[] values = new int[VALUES_TO_NAMES.size()];
    int i = 0;
    for (Integer v : VALUES_TO_NAMES.keySet()) {
      values[i++] = v;
    }

    VALID_VALUES = new IntRangeSet(values);
  }
}
