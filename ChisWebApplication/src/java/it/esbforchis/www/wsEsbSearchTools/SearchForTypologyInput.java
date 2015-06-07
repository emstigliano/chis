
package it.esbforchis.www.wsEsbSearchTools;
public class SearchForTypologyInput  implements java.io.Serializable {
    private java.lang.String typology;
    public SearchForTypologyInput() {
    }
    public SearchForTypologyInput(
           java.lang.String typology) {
           this.typology = typology;
    }
    
     
     
     
     
    public java.lang.String getTypology() {
        return typology;
    }
    
     
     
     
     
    public void setTypology(java.lang.String typology) {
        this.typology = typology;
    }
    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SearchForTypologyInput)) return false;
        SearchForTypologyInput other = (SearchForTypologyInput) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.typology==null && other.getTypology()==null) || 
             (this.typology!=null &&
              this.typology.equals(other.getTypology())));
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
        if (getTypology() != null) {
            _hashCode += getTypology().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }
    
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SearchForTypologyInput.class, true);
    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.esbforchis.it/wsEsbSearchTools", "searchForTypologyInput"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typology");
        elemField.setXmlName(new javax.xml.namespace.QName("", "typology"));
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
