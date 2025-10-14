package org.qa.light.session3.homeWork;

//Add model name and color to Android and IOS classes
//add equals and hashcode methods.

public class BasePhone {
    public String color;
    public String modelName;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof BasePhone) {
            BasePhone phone = (BasePhone) obj;
            return this.color.equals(phone.color) && this.modelName.equals(phone.modelName);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (modelName + color).hashCode();
    }
}
