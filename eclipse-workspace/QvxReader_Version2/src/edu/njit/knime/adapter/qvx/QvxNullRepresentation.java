//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.20 at 07:51:10 PM EST 
//


package edu.njit.knime.adapter.qvx;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QvxNullRepresentation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QvxNullRepresentation"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="QVX_NULL_NEVER"/&gt;
 *     &lt;enumeration value="QVX_NULL_ZERO_LENGTH"/&gt;
 *     &lt;enumeration value="QVX_NULL_FLAG_WITH_UNDEFINED_DATA"/&gt;
 *     &lt;enumeration value="QVX_NULL_FLAG_SUPPRESS_DATA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "QvxNullRepresentation")
@XmlEnum
public enum QvxNullRepresentation {

    QVX_NULL_NEVER,
    QVX_NULL_ZERO_LENGTH,
    QVX_NULL_FLAG_WITH_UNDEFINED_DATA,
    QVX_NULL_FLAG_SUPPRESS_DATA;

    public String value() {
        return name();
    }

    public static QvxNullRepresentation fromValue(String v) {
        return valueOf(v);
    }

}
