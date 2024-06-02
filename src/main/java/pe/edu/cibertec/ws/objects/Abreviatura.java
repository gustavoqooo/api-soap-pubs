//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.05.26 a las 12:52:19 PM PET 
//


package pe.edu.cibertec.ws.objects;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para abreviatura.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="abreviatura"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CL"/&gt;
 *     &lt;enumeration value="PE"/&gt;
 *     &lt;enumeration value="UY"/&gt;
 *     &lt;enumeration value="BR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "abreviatura")
@XmlEnum
public enum Abreviatura {

    CL,
    PE,
    UY,
    BR;

    public String value() {
        return name();
    }

    public static Abreviatura fromValue(String v) {
        return valueOf(v);
    }

}
