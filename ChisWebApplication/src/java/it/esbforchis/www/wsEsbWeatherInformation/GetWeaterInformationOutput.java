package it.esbforchis.www.wsEsbWeatherInformation;
public class GetWeaterInformationOutput  implements java.io.Serializable {
    private it.esbforchis.www.wsEsbWeatherInformation.Info[] info;
    private java.lang.String errorCode;
    private java.lang.String errorDescription;
    public GetWeaterInformationOutput() {
    }
    public GetWeaterInformationOutput(
           it.esbforchis.www.wsEsbWeatherInformation.Info[] info,
           java.lang.String errorCode,
           java.lang.String errorDescription) {
           this.info = info;
           this.errorCode = errorCode;
           this.errorDescription = errorDescription;
    }
  
    public it.esbforchis.www.wsEsbWeatherInformation.Info[] getInfo() {
        return info;
    }
    
    public void setInfo(it.esbforchis.www.wsEsbWeatherInformation.Info[] info) {
        this.info = info;
    }
    public it.esbforchis.www.wsEsbWeatherInformation.Info getInfo(int i) {
        return this.info[i];
    }
    public void setInfo(int i, it.esbforchis.www.wsEsbWeatherInformation.Info _value) {
        this.info[i] = _value;
    }
    public java.lang.String getErrorCode() {
        return errorCode;
    }
    public void setErrorCode(java.lang.String errorCode) {
        this.errorCode = errorCode;
    }
    public java.lang.String getErrorDescription() {
        return errorDescription;
    }
    public void setErrorDescription(java.lang.String errorDescription) {
        this.errorDescription = errorDescription;
    }
    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetWeaterInformationOutput)) return false;
        GetWeaterInformationOutput other = (GetWeaterInformationOutput) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.info==null && other.getInfo()==null) || 
             (this.info!=null &&
              java.util.Arrays.equals(this.info, other.getInfo()))) &&
            ((this.errorCode==null && other.getErrorCode()==null) || 
             (this.errorCode!=null &&
              this.errorCode.equals(other.getErrorCode()))) &&
            ((this.errorDescription==null && other.getErrorDescription()==null) || 
             (this.errorDescription!=null &&
              this.errorDescription.equals(other.getErrorDescription())));
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
        if (getInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getErrorCode() != null) {
            _hashCode += getErrorCode().hashCode();
        }
        if (getErrorDescription() != null) {
            _hashCode += getErrorDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }
    
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetWeaterInformationOutput.class, true);
    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.esbforchis.it/wsEsbWeatherInformation", "getWeatherInformationOutput"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("info");
        elemField.setXmlName(new javax.xml.namespace.QName("", "info"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.esbforchis.it/wsEsbWeatherInformation", "info"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
