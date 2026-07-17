
package com.example.consumeWS.demo.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="marca" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="modelo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="año" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="cilindrada" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="potencia" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "marca",
    "modelo",
    "version",
    "a\u00f1o",
    "cilindrada",
    "potencia",
    "id"
})
@XmlRootElement(name = "setCarroRequest")
public class SetCarroRequest {

    @XmlElement(required = true)
    protected String marca;
    @XmlElement(required = true)
    protected String modelo;
    @XmlElement(required = true)
    protected String version;
    protected int año;
    @XmlElement(required = true)
    protected String cilindrada;
    @XmlElement(required = true)
    protected String potencia;
    protected int id;

    /**
     * Gets the value of the marca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Sets the value of the marca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarca(String value) {
        this.marca = value;
    }

    /**
     * Gets the value of the modelo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Sets the value of the modelo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelo(String value) {
        this.modelo = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the año property.
     * 
     */
    public int getAño() {
        return año;
    }

    /**
     * Sets the value of the año property.
     * 
     */
    public void setAño(int value) {
        this.año = value;
    }

    /**
     * Gets the value of the cilindrada property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCilindrada() {
        return cilindrada;
    }

    /**
     * Sets the value of the cilindrada property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCilindrada(String value) {
        this.cilindrada = value;
    }

    /**
     * Gets the value of the potencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPotencia() {
        return potencia;
    }

    /**
     * Sets the value of the potencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPotencia(String value) {
        this.potencia = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

}
