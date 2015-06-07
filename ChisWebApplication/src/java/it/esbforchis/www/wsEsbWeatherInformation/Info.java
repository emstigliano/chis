package it.esbforchis.www.wsEsbWeatherInformation;
public class Info  implements java.io.Serializable {
    private java.lang.String date;
    private java.lang.String day;
    private java.lang.String high;
    private java.lang.String low;
    private java.lang.String text;
    public Info() {
    }
    public Info(
           java.lang.String date,
           java.lang.String day,
           java.lang.String high,
           java.lang.String low,
           java.lang.String text) {
           this.date = date;
           this.day = day;
           this.high = high;
           this.low = low;
           this.text = text;
    }
 
    public java.lang.String getDate() {
        return date;
    }
    
    public void setDate(java.lang.String date) {
        this.date = date;
    }
   
    public java.lang.String getDay() {
        return day;
    }
  
    public void setDay(java.lang.String day) {
        this.day = day;
    }
   
    public java.lang.String getHigh() {
        return high;
    }
   
    public void setHigh(java.lang.String high) {
        this.high = high;
    }
   
    public java.lang.String getLow() {
        return low;
    }
   
    public void setLow(java.lang.String low) {
        this.low = low;
    }
    
     
     
     
     
    public java.lang.String getText() {
        return text;
    }
    
     
     
     
     
    public void setText(java.lang.String text) {
        this.text = text;
    }
    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Info)) return false;
        Info other = (Info) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.day==null && other.getDay()==null) || 
             (this.day!=null &&
              this.day.equals(other.getDay()))) &&
            ((this.high==null && other.getHigh()==null) || 
             (this.high!=null &&
              this.high.equals(other.getHigh()))) &&
            ((this.low==null && other.getLow()==null) || 
             (this.low!=null &&
              this.low.equals(other.getLow()))) &&
            ((this.text==null && other.getText()==null) || 
             (this.text!=null &&
              this.text.equals(other.getText())));
        __equalsCalc = null;
        return _equals;
    }
    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getDay() != null) {
            _hashCode += getDay().hashCode();
        }
        if (getHigh() != null) {
            _hashCode += getHigh().hashCode();
        }
        if (getLow() != null) {
            _hashCode += getLow().hashCode();
        }
        if (getText() != null) {
            _hashCode += getText().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }
    
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Info.class, true);
    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.esbforchis.it/wsEsbWeatherInformation", "info"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("day");
        elemField.setXmlName(new javax.xml.namespace.QName("", "day"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("high");
        elemField.setXmlName(new javax.xml.namespace.QName("", "high"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("low");
        elemField.setXmlName(new javax.xml.namespace.QName("", "low"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("text");
        elemField.setXmlName(new javax.xml.namespace.QName("", "text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }
    
     
     
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }
    
     
     
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }
    
     
     
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }
}
