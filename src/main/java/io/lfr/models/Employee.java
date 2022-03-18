/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package io.lfr.models;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class Employee extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 3329336144235204396L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Employee\",\"namespace\":\"io.lfr.models\",\"fields\":[{\"name\":\"first_name\",\"type\":\"string\",\"doc\":\"First name of employee\"},{\"name\":\"last_name\",\"type\":\"string\",\"doc\":\"Last name of employee\"},{\"name\":\"age\",\"type\":\"int\",\"doc\":\"age of employee\"}],\"version\":1}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Employee> ENCODER =
      new BinaryMessageEncoder<Employee>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Employee> DECODER =
      new BinaryMessageDecoder<Employee>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Employee> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Employee> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Employee> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Employee>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Employee to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Employee from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Employee instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Employee fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** First name of employee */
  private java.lang.CharSequence first_name;
  /** Last name of employee */
  private java.lang.CharSequence last_name;
  /** age of employee */
  private int age;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Employee() {}

  /**
   * All-args constructor.
   * @param first_name First name of employee
   * @param last_name Last name of employee
   * @param age age of employee
   */
  public Employee(java.lang.CharSequence first_name, java.lang.CharSequence last_name, java.lang.Integer age) {
    this.first_name = first_name;
    this.last_name = last_name;
    this.age = age;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return first_name;
    case 1: return last_name;
    case 2: return age;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: first_name = (java.lang.CharSequence)value$; break;
    case 1: last_name = (java.lang.CharSequence)value$; break;
    case 2: age = (java.lang.Integer)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'first_name' field.
   * @return First name of employee
   */
  public java.lang.CharSequence getFirstName() {
    return first_name;
  }


  /**
   * Sets the value of the 'first_name' field.
   * First name of employee
   * @param value the value to set.
   */
  public void setFirstName(java.lang.CharSequence value) {
    this.first_name = value;
  }

  /**
   * Gets the value of the 'last_name' field.
   * @return Last name of employee
   */
  public java.lang.CharSequence getLastName() {
    return last_name;
  }


  /**
   * Sets the value of the 'last_name' field.
   * Last name of employee
   * @param value the value to set.
   */
  public void setLastName(java.lang.CharSequence value) {
    this.last_name = value;
  }

  /**
   * Gets the value of the 'age' field.
   * @return age of employee
   */
  public int getAge() {
    return age;
  }


  /**
   * Sets the value of the 'age' field.
   * age of employee
   * @param value the value to set.
   */
  public void setAge(int value) {
    this.age = value;
  }

  /**
   * Creates a new Employee RecordBuilder.
   * @return A new Employee RecordBuilder
   */
  public static io.lfr.models.Employee.Builder newBuilder() {
    return new io.lfr.models.Employee.Builder();
  }

  /**
   * Creates a new Employee RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Employee RecordBuilder
   */
  public static io.lfr.models.Employee.Builder newBuilder(io.lfr.models.Employee.Builder other) {
    if (other == null) {
      return new io.lfr.models.Employee.Builder();
    } else {
      return new io.lfr.models.Employee.Builder(other);
    }
  }

  /**
   * Creates a new Employee RecordBuilder by copying an existing Employee instance.
   * @param other The existing instance to copy.
   * @return A new Employee RecordBuilder
   */
  public static io.lfr.models.Employee.Builder newBuilder(io.lfr.models.Employee other) {
    if (other == null) {
      return new io.lfr.models.Employee.Builder();
    } else {
      return new io.lfr.models.Employee.Builder(other);
    }
  }

  /**
   * RecordBuilder for Employee instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Employee>
    implements org.apache.avro.data.RecordBuilder<Employee> {

    /** First name of employee */
    private java.lang.CharSequence first_name;
    /** Last name of employee */
    private java.lang.CharSequence last_name;
    /** age of employee */
    private int age;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(io.lfr.models.Employee.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.first_name)) {
        this.first_name = data().deepCopy(fields()[0].schema(), other.first_name);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.last_name)) {
        this.last_name = data().deepCopy(fields()[1].schema(), other.last_name);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.age)) {
        this.age = data().deepCopy(fields()[2].schema(), other.age);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
    }

    /**
     * Creates a Builder by copying an existing Employee instance
     * @param other The existing instance to copy.
     */
    private Builder(io.lfr.models.Employee other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.first_name)) {
        this.first_name = data().deepCopy(fields()[0].schema(), other.first_name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.last_name)) {
        this.last_name = data().deepCopy(fields()[1].schema(), other.last_name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.age)) {
        this.age = data().deepCopy(fields()[2].schema(), other.age);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'first_name' field.
      * First name of employee
      * @return The value.
      */
    public java.lang.CharSequence getFirstName() {
      return first_name;
    }


    /**
      * Sets the value of the 'first_name' field.
      * First name of employee
      * @param value The value of 'first_name'.
      * @return This builder.
      */
    public io.lfr.models.Employee.Builder setFirstName(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.first_name = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'first_name' field has been set.
      * First name of employee
      * @return True if the 'first_name' field has been set, false otherwise.
      */
    public boolean hasFirstName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'first_name' field.
      * First name of employee
      * @return This builder.
      */
    public io.lfr.models.Employee.Builder clearFirstName() {
      first_name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'last_name' field.
      * Last name of employee
      * @return The value.
      */
    public java.lang.CharSequence getLastName() {
      return last_name;
    }


    /**
      * Sets the value of the 'last_name' field.
      * Last name of employee
      * @param value The value of 'last_name'.
      * @return This builder.
      */
    public io.lfr.models.Employee.Builder setLastName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.last_name = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'last_name' field has been set.
      * Last name of employee
      * @return True if the 'last_name' field has been set, false otherwise.
      */
    public boolean hasLastName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'last_name' field.
      * Last name of employee
      * @return This builder.
      */
    public io.lfr.models.Employee.Builder clearLastName() {
      last_name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'age' field.
      * age of employee
      * @return The value.
      */
    public int getAge() {
      return age;
    }


    /**
      * Sets the value of the 'age' field.
      * age of employee
      * @param value The value of 'age'.
      * @return This builder.
      */
    public io.lfr.models.Employee.Builder setAge(int value) {
      validate(fields()[2], value);
      this.age = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'age' field has been set.
      * age of employee
      * @return True if the 'age' field has been set, false otherwise.
      */
    public boolean hasAge() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'age' field.
      * age of employee
      * @return This builder.
      */
    public io.lfr.models.Employee.Builder clearAge() {
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Employee build() {
      try {
        Employee record = new Employee();
        record.first_name = fieldSetFlags()[0] ? this.first_name : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.last_name = fieldSetFlags()[1] ? this.last_name : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.age = fieldSetFlags()[2] ? this.age : (java.lang.Integer) defaultValue(fields()[2]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Employee>
    WRITER$ = (org.apache.avro.io.DatumWriter<Employee>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Employee>
    READER$ = (org.apache.avro.io.DatumReader<Employee>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.first_name);

    out.writeString(this.last_name);

    out.writeInt(this.age);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.first_name = in.readString(this.first_name instanceof Utf8 ? (Utf8)this.first_name : null);

      this.last_name = in.readString(this.last_name instanceof Utf8 ? (Utf8)this.last_name : null);

      this.age = in.readInt();

    } else {
      for (int i = 0; i < 3; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.first_name = in.readString(this.first_name instanceof Utf8 ? (Utf8)this.first_name : null);
          break;

        case 1:
          this.last_name = in.readString(this.last_name instanceof Utf8 ? (Utf8)this.last_name : null);
          break;

        case 2:
          this.age = in.readInt();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}









