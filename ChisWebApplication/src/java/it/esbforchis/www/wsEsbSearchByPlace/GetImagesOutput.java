
package it.esbforchis.www.wsEsbSearchByPlace;
public class GetImagesOutput  implements java.io.Serializable {
    private it.esbforchis.www.wsEsbSearchByPlace.Image[] image;
    private java.lang.String errorCode;
    private java.lang.String errorDescription;
    public GetImagesOutput() {
    }
    public GetImagesOutput(
           it.esbforchis.www.wsEsbSearchByPlace.Image[] image,
           java.lang.String errorCode,
           java.lang.String errorDescription) {
           this.image = image;
           this.errorCode = errorCode;
           this.errorDescription = errorDescription;
    }
    public it.esbforchis.www.wsEsbSearchByPlace.Image[] getImage() {
        return image;
    }
   
    public void setImage(it.esbforchis.www.wsEsbSearchByPlace.Image[] image) {
        this.image = image;
    }
    public it.esbforchis.www.wsEsbSearchByPlace.Image getImage(int i) {
        return this.image[i];
    }
    public void setImage(int i, it.esbforchis.www.wsEsbSearchByPlace.Image _value) {
        this.image[i] = _value;
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
        if (!(obj instanceof GetImagesOutput)) return false;
        GetImagesOutput other = (GetImagesOutput) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.image==null && other.getImage()==null) || 
             (this.image!=null &&
              java.util.Arrays.equals(this.image, other.getImage()))) &&
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
        if (getImage() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getImage());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getImage(), i);
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
        new org.apache.axis.description.TypeDesc(GetImagesOutput.class, true);
    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.esbforchis.it/wsEsbSearchByPlace", "getImagesOutput"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("image");
        elemField.setXmlName(new javax.xml.namespace.QName("", "image"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.esbforchis.it/wsEsbSearchByPlace", "image"));
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
