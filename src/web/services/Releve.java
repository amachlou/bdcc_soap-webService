/**
 * Releve.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package web.services;

import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType
public class Releve  implements java.io.Serializable {
    private java.util.Calendar dateDebutOperations;

    private java.util.Calendar dateFinOperations;

    private java.util.Calendar dateReleve;

    private web.services.Operation[] list_operation;

    private java.lang.String RIB;

    private double solde;

    public Releve() {
    }

    public Releve(
           java.util.Calendar dateDebutOperations,
           java.util.Calendar dateFinOperations,
           java.util.Calendar dateReleve,
           web.services.Operation[] list_operation,
           java.lang.String RIB,
           double solde) {
           this.dateDebutOperations = dateDebutOperations;
           this.dateFinOperations = dateFinOperations;
           this.dateReleve = dateReleve;
           this.list_operation = list_operation;
           this.RIB = RIB;
           this.solde = solde;
    }


    /**
     * Gets the dateDebutOperations value for this Releve.
     * 
     * @return dateDebutOperations
     */
    public java.util.Calendar getDateDebutOperations() {
        return dateDebutOperations;
    }


    /**
     * Sets the dateDebutOperations value for this Releve.
     * 
     * @param dateDebutOperations
     */
    public void setDateDebutOperations(java.util.Calendar dateDebutOperations) {
        this.dateDebutOperations = dateDebutOperations;
    }


    /**
     * Gets the dateFinOperations value for this Releve.
     * 
     * @return dateFinOperations
     */
    public java.util.Calendar getDateFinOperations() {
        return dateFinOperations;
    }


    /**
     * Sets the dateFinOperations value for this Releve.
     * 
     * @param dateFinOperations
     */
    public void setDateFinOperations(java.util.Calendar dateFinOperations) {
        this.dateFinOperations = dateFinOperations;
    }


    /**
     * Gets the dateReleve value for this Releve.
     * 
     * @return dateReleve
     */
    public java.util.Calendar getDateReleve() {
        return dateReleve;
    }


    /**
     * Sets the dateReleve value for this Releve.
     * 
     * @param dateReleve
     */
    public void setDateReleve(java.util.Calendar dateReleve) {
        this.dateReleve = dateReleve;
    }


    /**
     * Gets the list_operation value for this Releve.
     * 
     * @return list_operation
     */
    public web.services.Operation[] getList_operation() {
        return list_operation;
    }


    /**
     * Sets the list_operation value for this Releve.
     * 
     * @param list_operation
     */
    public void setList_operation(web.services.Operation[] list_operation) {
        this.list_operation = list_operation;
    }

    public web.services.Operation getList_operation(int i) {
        return this.list_operation[i];
    }

    public void setList_operation(int i, web.services.Operation _value) {
        this.list_operation[i] = _value;
    }


    /**
     * Gets the RIB value for this Releve.
     * 
     * @return RIB
     */
    public java.lang.String getRIB() {
        return RIB;
    }


    /**
     * Sets the RIB value for this Releve.
     * 
     * @param RIB
     */
    public void setRIB(java.lang.String RIB) {
        this.RIB = RIB;
    }


    /**
     * Gets the solde value for this Releve.
     * 
     * @return solde
     */
    public double getSolde() {
        return solde;
    }


    /**
     * Sets the solde value for this Releve.
     * 
     * @param solde
     */
    public void setSolde(double solde) {
        this.solde = solde;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Releve)) return false;
        Releve other = (Releve) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dateDebutOperations==null && other.getDateDebutOperations()==null) || 
             (this.dateDebutOperations!=null &&
              this.dateDebutOperations.equals(other.getDateDebutOperations()))) &&
            ((this.dateFinOperations==null && other.getDateFinOperations()==null) || 
             (this.dateFinOperations!=null &&
              this.dateFinOperations.equals(other.getDateFinOperations()))) &&
            ((this.dateReleve==null && other.getDateReleve()==null) || 
             (this.dateReleve!=null &&
              this.dateReleve.equals(other.getDateReleve()))) &&
            ((this.list_operation==null && other.getList_operation()==null) || 
             (this.list_operation!=null &&
              java.util.Arrays.equals(this.list_operation, other.getList_operation()))) &&
            ((this.RIB==null && other.getRIB()==null) || 
             (this.RIB!=null &&
              this.RIB.equals(other.getRIB()))) &&
            this.solde == other.getSolde();
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
        if (getDateDebutOperations() != null) {
            _hashCode += getDateDebutOperations().hashCode();
        }
        if (getDateFinOperations() != null) {
            _hashCode += getDateFinOperations().hashCode();
        }
        if (getDateReleve() != null) {
            _hashCode += getDateReleve().hashCode();
        }
        if (getList_operation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getList_operation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getList_operation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRIB() != null) {
            _hashCode += getRIB().hashCode();
        }
        _hashCode += new Double(getSolde()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Releve.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.web/", "releve"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateDebutOperations");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateDebutOperations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateFinOperations");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateFinOperations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateReleve");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateReleve"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("list_operation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "list_operation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.web/", "operation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RIB");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RIB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("solde");
        elemField.setXmlName(new javax.xml.namespace.QName("", "solde"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
