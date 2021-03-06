/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.test.thrift.rpc;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import javax.annotation.Generated;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-07-12")
public class ArgStruct implements org.apache.thrift.TBase<ArgStruct, ArgStruct._Fields>, java.io.Serializable, Cloneable, Comparable<ArgStruct> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ArgStruct");

  private static final org.apache.thrift.protocol.TField ARG_BYTE_FIELD_DESC = new org.apache.thrift.protocol.TField("argByte", org.apache.thrift.protocol.TType.BYTE, (short)1);
  private static final org.apache.thrift.protocol.TField ARG_STRING_FIELD_DESC = new org.apache.thrift.protocol.TField("argString", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField ARG_I16_FIELD_DESC = new org.apache.thrift.protocol.TField("argI16", org.apache.thrift.protocol.TType.I16, (short)3);
  private static final org.apache.thrift.protocol.TField ARG_I32_FIELD_DESC = new org.apache.thrift.protocol.TField("argI32", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField ARG_I64_FIELD_DESC = new org.apache.thrift.protocol.TField("argI64", org.apache.thrift.protocol.TType.I64, (short)5);
  private static final org.apache.thrift.protocol.TField ARG_DOUBLE_FIELD_DESC = new org.apache.thrift.protocol.TField("argDouble", org.apache.thrift.protocol.TType.DOUBLE, (short)6);
  private static final org.apache.thrift.protocol.TField ARG_BOOL_FIELD_DESC = new org.apache.thrift.protocol.TField("argBool", org.apache.thrift.protocol.TType.BOOL, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ArgStructStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ArgStructTupleSchemeFactory());
  }

  public byte argByte; // required
  public String argString; // required
  public short argI16; // required
  public int argI32; // required
  public long argI64; // required
  public double argDouble; // required
  public boolean argBool; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ARG_BYTE((short)1, "argByte"),
    ARG_STRING((short)2, "argString"),
    ARG_I16((short)3, "argI16"),
    ARG_I32((short)4, "argI32"),
    ARG_I64((short)5, "argI64"),
    ARG_DOUBLE((short)6, "argDouble"),
    ARG_BOOL((short)7, "argBool");

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
        case 1: // ARG_BYTE
          return ARG_BYTE;
        case 2: // ARG_STRING
          return ARG_STRING;
        case 3: // ARG_I16
          return ARG_I16;
        case 4: // ARG_I32
          return ARG_I32;
        case 5: // ARG_I64
          return ARG_I64;
        case 6: // ARG_DOUBLE
          return ARG_DOUBLE;
        case 7: // ARG_BOOL
          return ARG_BOOL;
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
  private static final int __ARGBYTE_ISSET_ID = 0;
  private static final int __ARGI16_ISSET_ID = 1;
  private static final int __ARGI32_ISSET_ID = 2;
  private static final int __ARGI64_ISSET_ID = 3;
  private static final int __ARGDOUBLE_ISSET_ID = 4;
  private static final int __ARGBOOL_ISSET_ID = 5;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ARG_BYTE, new org.apache.thrift.meta_data.FieldMetaData("argByte", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.ARG_STRING, new org.apache.thrift.meta_data.FieldMetaData("argString", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ARG_I16, new org.apache.thrift.meta_data.FieldMetaData("argI16", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    tmpMap.put(_Fields.ARG_I32, new org.apache.thrift.meta_data.FieldMetaData("argI32", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.ARG_I64, new org.apache.thrift.meta_data.FieldMetaData("argI64", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.ARG_DOUBLE, new org.apache.thrift.meta_data.FieldMetaData("argDouble", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.ARG_BOOL, new org.apache.thrift.meta_data.FieldMetaData("argBool", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ArgStruct.class, metaDataMap);
  }

  public ArgStruct() {
  }

  public ArgStruct(
    byte argByte,
    String argString,
    short argI16,
    int argI32,
    long argI64,
    double argDouble,
    boolean argBool)
  {
    this();
    this.argByte = argByte;
    setArgByteIsSet(true);
    this.argString = argString;
    this.argI16 = argI16;
    setArgI16IsSet(true);
    this.argI32 = argI32;
    setArgI32IsSet(true);
    this.argI64 = argI64;
    setArgI64IsSet(true);
    this.argDouble = argDouble;
    setArgDoubleIsSet(true);
    this.argBool = argBool;
    setArgBoolIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ArgStruct(ArgStruct other) {
    __isset_bitfield = other.__isset_bitfield;
    this.argByte = other.argByte;
    if (other.isSetArgString()) {
      this.argString = other.argString;
    }
    this.argI16 = other.argI16;
    this.argI32 = other.argI32;
    this.argI64 = other.argI64;
    this.argDouble = other.argDouble;
    this.argBool = other.argBool;
  }

  public ArgStruct deepCopy() {
    return new ArgStruct(this);
  }

  @Override
  public void clear() {
    setArgByteIsSet(false);
    this.argByte = 0;
    this.argString = null;
    setArgI16IsSet(false);
    this.argI16 = 0;
    setArgI32IsSet(false);
    this.argI32 = 0;
    setArgI64IsSet(false);
    this.argI64 = 0;
    setArgDoubleIsSet(false);
    this.argDouble = 0.0;
    setArgBoolIsSet(false);
    this.argBool = false;
  }

  public byte getArgByte() {
    return this.argByte;
  }

  public ArgStruct setArgByte(byte argByte) {
    this.argByte = argByte;
    setArgByteIsSet(true);
    return this;
  }

  public void unsetArgByte() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ARGBYTE_ISSET_ID);
  }

  /** Returns true if field argByte is set (has been assigned a value) and false otherwise */
  public boolean isSetArgByte() {
    return EncodingUtils.testBit(__isset_bitfield, __ARGBYTE_ISSET_ID);
  }

  public void setArgByteIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ARGBYTE_ISSET_ID, value);
  }

  public String getArgString() {
    return this.argString;
  }

  public ArgStruct setArgString(String argString) {
    this.argString = argString;
    return this;
  }

  public void unsetArgString() {
    this.argString = null;
  }

  /** Returns true if field argString is set (has been assigned a value) and false otherwise */
  public boolean isSetArgString() {
    return this.argString != null;
  }

  public void setArgStringIsSet(boolean value) {
    if (!value) {
      this.argString = null;
    }
  }

  public short getArgI16() {
    return this.argI16;
  }

  public ArgStruct setArgI16(short argI16) {
    this.argI16 = argI16;
    setArgI16IsSet(true);
    return this;
  }

  public void unsetArgI16() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ARGI16_ISSET_ID);
  }

  /** Returns true if field argI16 is set (has been assigned a value) and false otherwise */
  public boolean isSetArgI16() {
    return EncodingUtils.testBit(__isset_bitfield, __ARGI16_ISSET_ID);
  }

  public void setArgI16IsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ARGI16_ISSET_ID, value);
  }

  public int getArgI32() {
    return this.argI32;
  }

  public ArgStruct setArgI32(int argI32) {
    this.argI32 = argI32;
    setArgI32IsSet(true);
    return this;
  }

  public void unsetArgI32() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ARGI32_ISSET_ID);
  }

  /** Returns true if field argI32 is set (has been assigned a value) and false otherwise */
  public boolean isSetArgI32() {
    return EncodingUtils.testBit(__isset_bitfield, __ARGI32_ISSET_ID);
  }

  public void setArgI32IsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ARGI32_ISSET_ID, value);
  }

  public long getArgI64() {
    return this.argI64;
  }

  public ArgStruct setArgI64(long argI64) {
    this.argI64 = argI64;
    setArgI64IsSet(true);
    return this;
  }

  public void unsetArgI64() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ARGI64_ISSET_ID);
  }

  /** Returns true if field argI64 is set (has been assigned a value) and false otherwise */
  public boolean isSetArgI64() {
    return EncodingUtils.testBit(__isset_bitfield, __ARGI64_ISSET_ID);
  }

  public void setArgI64IsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ARGI64_ISSET_ID, value);
  }

  public double getArgDouble() {
    return this.argDouble;
  }

  public ArgStruct setArgDouble(double argDouble) {
    this.argDouble = argDouble;
    setArgDoubleIsSet(true);
    return this;
  }

  public void unsetArgDouble() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ARGDOUBLE_ISSET_ID);
  }

  /** Returns true if field argDouble is set (has been assigned a value) and false otherwise */
  public boolean isSetArgDouble() {
    return EncodingUtils.testBit(__isset_bitfield, __ARGDOUBLE_ISSET_ID);
  }

  public void setArgDoubleIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ARGDOUBLE_ISSET_ID, value);
  }

  public boolean isArgBool() {
    return this.argBool;
  }

  public ArgStruct setArgBool(boolean argBool) {
    this.argBool = argBool;
    setArgBoolIsSet(true);
    return this;
  }

  public void unsetArgBool() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ARGBOOL_ISSET_ID);
  }

  /** Returns true if field argBool is set (has been assigned a value) and false otherwise */
  public boolean isSetArgBool() {
    return EncodingUtils.testBit(__isset_bitfield, __ARGBOOL_ISSET_ID);
  }

  public void setArgBoolIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ARGBOOL_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ARG_BYTE:
      if (value == null) {
        unsetArgByte();
      } else {
        setArgByte((Byte)value);
      }
      break;

    case ARG_STRING:
      if (value == null) {
        unsetArgString();
      } else {
        setArgString((String)value);
      }
      break;

    case ARG_I16:
      if (value == null) {
        unsetArgI16();
      } else {
        setArgI16((Short)value);
      }
      break;

    case ARG_I32:
      if (value == null) {
        unsetArgI32();
      } else {
        setArgI32((Integer)value);
      }
      break;

    case ARG_I64:
      if (value == null) {
        unsetArgI64();
      } else {
        setArgI64((Long)value);
      }
      break;

    case ARG_DOUBLE:
      if (value == null) {
        unsetArgDouble();
      } else {
        setArgDouble((Double)value);
      }
      break;

    case ARG_BOOL:
      if (value == null) {
        unsetArgBool();
      } else {
        setArgBool((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ARG_BYTE:
      return getArgByte();

    case ARG_STRING:
      return getArgString();

    case ARG_I16:
      return getArgI16();

    case ARG_I32:
      return getArgI32();

    case ARG_I64:
      return getArgI64();

    case ARG_DOUBLE:
      return getArgDouble();

    case ARG_BOOL:
      return isArgBool();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ARG_BYTE:
      return isSetArgByte();
    case ARG_STRING:
      return isSetArgString();
    case ARG_I16:
      return isSetArgI16();
    case ARG_I32:
      return isSetArgI32();
    case ARG_I64:
      return isSetArgI64();
    case ARG_DOUBLE:
      return isSetArgDouble();
    case ARG_BOOL:
      return isSetArgBool();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ArgStruct)
      return this.equals((ArgStruct)that);
    return false;
  }

  public boolean equals(ArgStruct that) {
    if (that == null)
      return false;

    boolean this_present_argByte = true;
    boolean that_present_argByte = true;
    if (this_present_argByte || that_present_argByte) {
      if (!(this_present_argByte && that_present_argByte))
        return false;
      if (this.argByte != that.argByte)
        return false;
    }

    boolean this_present_argString = true && this.isSetArgString();
    boolean that_present_argString = true && that.isSetArgString();
    if (this_present_argString || that_present_argString) {
      if (!(this_present_argString && that_present_argString))
        return false;
      if (!this.argString.equals(that.argString))
        return false;
    }

    boolean this_present_argI16 = true;
    boolean that_present_argI16 = true;
    if (this_present_argI16 || that_present_argI16) {
      if (!(this_present_argI16 && that_present_argI16))
        return false;
      if (this.argI16 != that.argI16)
        return false;
    }

    boolean this_present_argI32 = true;
    boolean that_present_argI32 = true;
    if (this_present_argI32 || that_present_argI32) {
      if (!(this_present_argI32 && that_present_argI32))
        return false;
      if (this.argI32 != that.argI32)
        return false;
    }

    boolean this_present_argI64 = true;
    boolean that_present_argI64 = true;
    if (this_present_argI64 || that_present_argI64) {
      if (!(this_present_argI64 && that_present_argI64))
        return false;
      if (this.argI64 != that.argI64)
        return false;
    }

    boolean this_present_argDouble = true;
    boolean that_present_argDouble = true;
    if (this_present_argDouble || that_present_argDouble) {
      if (!(this_present_argDouble && that_present_argDouble))
        return false;
      if (this.argDouble != that.argDouble)
        return false;
    }

    boolean this_present_argBool = true;
    boolean that_present_argBool = true;
    if (this_present_argBool || that_present_argBool) {
      if (!(this_present_argBool && that_present_argBool))
        return false;
      if (this.argBool != that.argBool)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_argByte = true;
    list.add(present_argByte);
    if (present_argByte)
      list.add(argByte);

    boolean present_argString = true && (isSetArgString());
    list.add(present_argString);
    if (present_argString)
      list.add(argString);

    boolean present_argI16 = true;
    list.add(present_argI16);
    if (present_argI16)
      list.add(argI16);

    boolean present_argI32 = true;
    list.add(present_argI32);
    if (present_argI32)
      list.add(argI32);

    boolean present_argI64 = true;
    list.add(present_argI64);
    if (present_argI64)
      list.add(argI64);

    boolean present_argDouble = true;
    list.add(present_argDouble);
    if (present_argDouble)
      list.add(argDouble);

    boolean present_argBool = true;
    list.add(present_argBool);
    if (present_argBool)
      list.add(argBool);

    return list.hashCode();
  }

  @Override
  public int compareTo(ArgStruct other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetArgByte()).compareTo(other.isSetArgByte());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetArgByte()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.argByte, other.argByte);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetArgString()).compareTo(other.isSetArgString());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetArgString()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.argString, other.argString);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetArgI16()).compareTo(other.isSetArgI16());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetArgI16()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.argI16, other.argI16);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetArgI32()).compareTo(other.isSetArgI32());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetArgI32()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.argI32, other.argI32);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetArgI64()).compareTo(other.isSetArgI64());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetArgI64()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.argI64, other.argI64);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetArgDouble()).compareTo(other.isSetArgDouble());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetArgDouble()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.argDouble, other.argDouble);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetArgBool()).compareTo(other.isSetArgBool());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetArgBool()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.argBool, other.argBool);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ArgStruct(");
    boolean first = true;

    sb.append("argByte:");
    sb.append(this.argByte);
    first = false;
    if (!first) sb.append(", ");
    sb.append("argString:");
    if (this.argString == null) {
      sb.append("null");
    } else {
      sb.append(this.argString);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("argI16:");
    sb.append(this.argI16);
    first = false;
    if (!first) sb.append(", ");
    sb.append("argI32:");
    sb.append(this.argI32);
    first = false;
    if (!first) sb.append(", ");
    sb.append("argI64:");
    sb.append(this.argI64);
    first = false;
    if (!first) sb.append(", ");
    sb.append("argDouble:");
    sb.append(this.argDouble);
    first = false;
    if (!first) sb.append(", ");
    sb.append("argBool:");
    sb.append(this.argBool);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ArgStructStandardSchemeFactory implements SchemeFactory {
    public ArgStructStandardScheme getScheme() {
      return new ArgStructStandardScheme();
    }
  }

  private static class ArgStructStandardScheme extends StandardScheme<ArgStruct> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ArgStruct struct) throws TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ARG_BYTE
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.argByte = iprot.readByte();
              struct.setArgByteIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ARG_STRING
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.argString = iprot.readString();
              struct.setArgStringIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ARG_I16
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.argI16 = iprot.readI16();
              struct.setArgI16IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ARG_I32
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.argI32 = iprot.readI32();
              struct.setArgI32IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // ARG_I64
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.argI64 = iprot.readI64();
              struct.setArgI64IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // ARG_DOUBLE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.argDouble = iprot.readDouble();
              struct.setArgDoubleIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // ARG_BOOL
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.argBool = iprot.readBool();
              struct.setArgBoolIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ArgStruct struct) throws TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ARG_BYTE_FIELD_DESC);
      oprot.writeByte(struct.argByte);
      oprot.writeFieldEnd();
      if (struct.argString != null) {
        oprot.writeFieldBegin(ARG_STRING_FIELD_DESC);
        oprot.writeString(struct.argString);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(ARG_I16_FIELD_DESC);
      oprot.writeI16(struct.argI16);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(ARG_I32_FIELD_DESC);
      oprot.writeI32(struct.argI32);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(ARG_I64_FIELD_DESC);
      oprot.writeI64(struct.argI64);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(ARG_DOUBLE_FIELD_DESC);
      oprot.writeDouble(struct.argDouble);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(ARG_BOOL_FIELD_DESC);
      oprot.writeBool(struct.argBool);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ArgStructTupleSchemeFactory implements SchemeFactory {
    public ArgStructTupleScheme getScheme() {
      return new ArgStructTupleScheme();
    }
  }

  private static class ArgStructTupleScheme extends TupleScheme<ArgStruct> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ArgStruct struct) throws TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetArgByte()) {
        optionals.set(0);
      }
      if (struct.isSetArgString()) {
        optionals.set(1);
      }
      if (struct.isSetArgI16()) {
        optionals.set(2);
      }
      if (struct.isSetArgI32()) {
        optionals.set(3);
      }
      if (struct.isSetArgI64()) {
        optionals.set(4);
      }
      if (struct.isSetArgDouble()) {
        optionals.set(5);
      }
      if (struct.isSetArgBool()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetArgByte()) {
        oprot.writeByte(struct.argByte);
      }
      if (struct.isSetArgString()) {
        oprot.writeString(struct.argString);
      }
      if (struct.isSetArgI16()) {
        oprot.writeI16(struct.argI16);
      }
      if (struct.isSetArgI32()) {
        oprot.writeI32(struct.argI32);
      }
      if (struct.isSetArgI64()) {
        oprot.writeI64(struct.argI64);
      }
      if (struct.isSetArgDouble()) {
        oprot.writeDouble(struct.argDouble);
      }
      if (struct.isSetArgBool()) {
        oprot.writeBool(struct.argBool);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ArgStruct struct) throws TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.argByte = iprot.readByte();
        struct.setArgByteIsSet(true);
      }
      if (incoming.get(1)) {
        struct.argString = iprot.readString();
        struct.setArgStringIsSet(true);
      }
      if (incoming.get(2)) {
        struct.argI16 = iprot.readI16();
        struct.setArgI16IsSet(true);
      }
      if (incoming.get(3)) {
        struct.argI32 = iprot.readI32();
        struct.setArgI32IsSet(true);
      }
      if (incoming.get(4)) {
        struct.argI64 = iprot.readI64();
        struct.setArgI64IsSet(true);
      }
      if (incoming.get(5)) {
        struct.argDouble = iprot.readDouble();
        struct.setArgDoubleIsSet(true);
      }
      if (incoming.get(6)) {
        struct.argBool = iprot.readBool();
        struct.setArgBoolIsSet(true);
      }
    }
  }

}

