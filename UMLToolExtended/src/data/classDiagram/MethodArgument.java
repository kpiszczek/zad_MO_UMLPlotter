/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.classDiagram;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 *
 * @author michau
 */
@XStreamAlias("method-argument")
public class MethodArgument {

    private String name;
    private String type;
    private String defaultValue;

    public MethodArgument() {
        this.type = "";
        this.name = "";
        this.defaultValue = "";
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        String s = this.name + " : " + this.type;

        if (!this.defaultValue.isEmpty()) {
            s += " = " + this.defaultValue;
        }

        return s;
    }
    
    public String getTxtForm(){
        StringBuilder buf = new StringBuilder();
        
        buf.append(type).append(" ").append(name);
        
        return buf.toString();
    }
}
