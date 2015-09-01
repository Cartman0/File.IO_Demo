/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializabledemo;

import java.io.Serializable;

/**
 *
 * @author nabana
 */
public class Person implements Serializable{
    String name_;
    int age_;
    String location_;
    String phone_number_;
    
    public Person(String name, int age, String location, String phone_number) {
        this.name_ = name;
        this.age_ = age;
        this.location_ = location;
        this.phone_number_ = phone_number;
    }
    
    @Override
    public String toString(){
        return "name: " + this.name_ + " age: " + this.age_ + " loc: " + this.location_ + " phone: " + this.phone_number_;
    }
}
