package com.leansoft.luxun.quickstart;

/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogEvent implements org.apache.thrift.TBase<LogEvent, LogEvent._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("LogEvent");

  private static final org.apache.thrift.protocol.TField CREATED_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("createdTime", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField HOST_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("hostId", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField LOG_LEVEL_FIELD_DESC = new org.apache.thrift.protocol.TField("logLevel", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField MESSAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("message", org.apache.thrift.protocol.TType.STRING, (short)4);

  public long createdTime;
  public String hostId;
  /**
   * 
   * @see LogLevel
   */
  public LogLevel logLevel;
  public String message;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CREATED_TIME((short)1, "createdTime"),
    HOST_ID((short)2, "hostId"),
    /**
     * 
     * @see LogLevel
     */
    LOG_LEVEL((short)3, "logLevel"),
    MESSAGE((short)4, "message");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // CREATED_TIME
          return CREATED_TIME;
        case 2: // HOST_ID
          return HOST_ID;
        case 3: // LOG_LEVEL
          return LOG_LEVEL;
        case 4: // MESSAGE
          return MESSAGE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __CREATEDTIME_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CREATED_TIME, new org.apache.thrift.meta_data.FieldMetaData("createdTime", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.HOST_ID, new org.apache.thrift.meta_data.FieldMetaData("hostId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.LOG_LEVEL, new org.apache.thrift.meta_data.FieldMetaData("logLevel", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, LogLevel.class)));
    tmpMap.put(_Fields.MESSAGE, new org.apache.thrift.meta_data.FieldMetaData("message", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(LogEvent.class, metaDataMap);
  }

  public LogEvent() {
  }

  public LogEvent(
    long createdTime,
    String hostId,
    LogLevel logLevel,
    String message)
  {
    this();
    this.createdTime = createdTime;
    setCreatedTimeIsSet(true);
    this.hostId = hostId;
    this.logLevel = logLevel;
    this.message = message;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public LogEvent(LogEvent other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.createdTime = other.createdTime;
    if (other.isSetHostId()) {
      this.hostId = other.hostId;
    }
    if (other.isSetLogLevel()) {
      this.logLevel = other.logLevel;
    }
    if (other.isSetMessage()) {
      this.message = other.message;
    }
  }

  public LogEvent deepCopy() {
    return new LogEvent(this);
  }

  @Override
  public void clear() {
    setCreatedTimeIsSet(false);
    this.createdTime = 0;
    this.hostId = null;
    this.logLevel = null;
    this.message = null;
  }

  public long getCreatedTime() {
    return this.createdTime;
  }

  public LogEvent setCreatedTime(long createdTime) {
    this.createdTime = createdTime;
    setCreatedTimeIsSet(true);
    return this;
  }

  public void unsetCreatedTime() {
    __isset_bit_vector.clear(__CREATEDTIME_ISSET_ID);
  }

  /** Returns true if field createdTime is set (has been assigned a value) and false otherwise */
  public boolean isSetCreatedTime() {
    return __isset_bit_vector.get(__CREATEDTIME_ISSET_ID);
  }

  public void setCreatedTimeIsSet(boolean value) {
    __isset_bit_vector.set(__CREATEDTIME_ISSET_ID, value);
  }

  public String getHostId() {
    return this.hostId;
  }

  public LogEvent setHostId(String hostId) {
    this.hostId = hostId;
    return this;
  }

  public void unsetHostId() {
    this.hostId = null;
  }

  /** Returns true if field hostId is set (has been assigned a value) and false otherwise */
  public boolean isSetHostId() {
    return this.hostId != null;
  }

  public void setHostIdIsSet(boolean value) {
    if (!value) {
      this.hostId = null;
    }
  }

  /**
   * 
   * @see LogLevel
   */
  public LogLevel getLogLevel() {
    return this.logLevel;
  }

  /**
   * 
   * @see LogLevel
   */
  public LogEvent setLogLevel(LogLevel logLevel) {
    this.logLevel = logLevel;
    return this;
  }

  public void unsetLogLevel() {
    this.logLevel = null;
  }

  /** Returns true if field logLevel is set (has been assigned a value) and false otherwise */
  public boolean isSetLogLevel() {
    return this.logLevel != null;
  }

  public void setLogLevelIsSet(boolean value) {
    if (!value) {
      this.logLevel = null;
    }
  }

  public String getMessage() {
    return this.message;
  }

  public LogEvent setMessage(String message) {
    this.message = message;
    return this;
  }

  public void unsetMessage() {
    this.message = null;
  }

  /** Returns true if field message is set (has been assigned a value) and false otherwise */
  public boolean isSetMessage() {
    return this.message != null;
  }

  public void setMessageIsSet(boolean value) {
    if (!value) {
      this.message = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CREATED_TIME:
      if (value == null) {
        unsetCreatedTime();
      } else {
        setCreatedTime((Long)value);
      }
      break;

    case HOST_ID:
      if (value == null) {
        unsetHostId();
      } else {
        setHostId((String)value);
      }
      break;

    case LOG_LEVEL:
      if (value == null) {
        unsetLogLevel();
      } else {
        setLogLevel((LogLevel)value);
      }
      break;

    case MESSAGE:
      if (value == null) {
        unsetMessage();
      } else {
        setMessage((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CREATED_TIME:
      return new Long(getCreatedTime());

    case HOST_ID:
      return getHostId();

    case LOG_LEVEL:
      return getLogLevel();

    case MESSAGE:
      return getMessage();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CREATED_TIME:
      return isSetCreatedTime();
    case HOST_ID:
      return isSetHostId();
    case LOG_LEVEL:
      return isSetLogLevel();
    case MESSAGE:
      return isSetMessage();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof LogEvent)
      return this.equals((LogEvent)that);
    return false;
  }

  public boolean equals(LogEvent that) {
    if (that == null)
      return false;

    boolean this_present_createdTime = true;
    boolean that_present_createdTime = true;
    if (this_present_createdTime || that_present_createdTime) {
      if (!(this_present_createdTime && that_present_createdTime))
        return false;
      if (this.createdTime != that.createdTime)
        return false;
    }

    boolean this_present_hostId = true && this.isSetHostId();
    boolean that_present_hostId = true && that.isSetHostId();
    if (this_present_hostId || that_present_hostId) {
      if (!(this_present_hostId && that_present_hostId))
        return false;
      if (!this.hostId.equals(that.hostId))
        return false;
    }

    boolean this_present_logLevel = true && this.isSetLogLevel();
    boolean that_present_logLevel = true && that.isSetLogLevel();
    if (this_present_logLevel || that_present_logLevel) {
      if (!(this_present_logLevel && that_present_logLevel))
        return false;
      if (!this.logLevel.equals(that.logLevel))
        return false;
    }

    boolean this_present_message = true && this.isSetMessage();
    boolean that_present_message = true && that.isSetMessage();
    if (this_present_message || that_present_message) {
      if (!(this_present_message && that_present_message))
        return false;
      if (!this.message.equals(that.message))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(LogEvent other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    LogEvent typedOther = (LogEvent)other;

    lastComparison = Boolean.valueOf(isSetCreatedTime()).compareTo(typedOther.isSetCreatedTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCreatedTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.createdTime, typedOther.createdTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetHostId()).compareTo(typedOther.isSetHostId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHostId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.hostId, typedOther.hostId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLogLevel()).compareTo(typedOther.isSetLogLevel());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLogLevel()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.logLevel, typedOther.logLevel);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMessage()).compareTo(typedOther.isSetMessage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMessage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.message, typedOther.message);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    org.apache.thrift.protocol.TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == org.apache.thrift.protocol.TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // CREATED_TIME
          if (field.type == org.apache.thrift.protocol.TType.I64) {
            this.createdTime = iprot.readI64();
            setCreatedTimeIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // HOST_ID
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.hostId = iprot.readString();
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // LOG_LEVEL
          if (field.type == org.apache.thrift.protocol.TType.I32) {
            this.logLevel = LogLevel.findByValue(iprot.readI32());
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // MESSAGE
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.message = iprot.readString();
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    oprot.writeFieldBegin(CREATED_TIME_FIELD_DESC);
    oprot.writeI64(this.createdTime);
    oprot.writeFieldEnd();
    if (this.hostId != null) {
      oprot.writeFieldBegin(HOST_ID_FIELD_DESC);
      oprot.writeString(this.hostId);
      oprot.writeFieldEnd();
    }
    if (this.logLevel != null) {
      oprot.writeFieldBegin(LOG_LEVEL_FIELD_DESC);
      oprot.writeI32(this.logLevel.getValue());
      oprot.writeFieldEnd();
    }
    if (this.message != null) {
      oprot.writeFieldBegin(MESSAGE_FIELD_DESC);
      oprot.writeString(this.message);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("LogEvent(");
    boolean first = true;

    sb.append("createdTime:");
    sb.append(this.createdTime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("hostId:");
    if (this.hostId == null) {
      sb.append("null");
    } else {
      sb.append(this.hostId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("logLevel:");
    if (this.logLevel == null) {
      sb.append("null");
    } else {
      sb.append(this.logLevel);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("message:");
    if (this.message == null) {
      sb.append("null");
    } else {
      sb.append(this.message);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

}

