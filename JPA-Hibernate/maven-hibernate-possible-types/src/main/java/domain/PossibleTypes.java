package domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

/**
 * Created by user on 08.02.2017.
 */

@Entity
public class PossibleTypes {

    @Id
    private long id;

    //primitive types
    private int example_int;
    private double example_double;

    //wrappers - all types that are numbers
    private Integer example_Integer;
    private BigInteger example_BigInteger;
    private BigDecimal example_BigDecimal;

    // arrays
    private int[] integerArray;
    private double[] doubleArray;

    // enums
    private DefaultEnum defaultEnum;

    //colections
    private ArrayList<String> stringArrayList = new ArrayList<String>();

    // ignored fields
    @Transient
    private int ignoredField;

    public ArrayList<String> getStringArrayList() {
        return stringArrayList;
    }

    public void setStringArrayList(ArrayList<String> stringArrayList) {
        this.stringArrayList = stringArrayList;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getExample_int() {
        return example_int;
    }

    public void setExample_int(int example_int) {
        this.example_int = example_int;
    }

    public double getExample_double() {
        return example_double;
    }

    public void setExample_double(double example_double) {
        this.example_double = example_double;
    }

    public Integer getExample_Integer() {
        return example_Integer;
    }

    public void setExample_Integer(Integer example_Integer) {
        this.example_Integer = example_Integer;
    }

    public BigInteger getExample_BigInteger() {
        return example_BigInteger;
    }

    public void setExample_BigInteger(BigInteger example_BigInteger) {
        this.example_BigInteger = example_BigInteger;
    }

    public BigDecimal getExample_BigDecimal() {
        return example_BigDecimal;
    }

    public void setExample_BigDecimal(BigDecimal example_BigDecimal) {
        this.example_BigDecimal = example_BigDecimal;
    }

    public int[] getIntegerArray() {
        return integerArray;
    }

    public void setIntegerArray(int[] integerArray) {
        this.integerArray = integerArray;
    }

    public double[] getDoubleArray() {
        return doubleArray;
    }

    public void setDoubleArray(double[] doubleArray) {
        this.doubleArray = doubleArray;
    }

    public DefaultEnum getDefaultEnum() {
        return defaultEnum;
    }

    public void setDefaultEnum(DefaultEnum defaultEnum) {
        this.defaultEnum = defaultEnum;
    }
}
