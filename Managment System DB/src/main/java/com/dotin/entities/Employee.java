package com.dotin.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.Period;

@Entity
public class Employee {
    @Id
    private double id;
    private String firstName;
    private String lastName;
    private Role role;
    private int offRequestCapacities;
    private Boolean offRequset;
    private int offRequestcounts=0;

    @ManyToOne
    private Manager manager;

    public Employee(){};

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public int getOffRequestCapacities() {
        return offRequestCapacities;
    }

    public void setOffRequestCapacities(int offRequestCapacities) {
        this.offRequestCapacities = offRequestCapacities;
    }

    public Boolean getOffRequset() {
        return offRequset;
    }

    public void setOffRequset(Boolean offRequset) {
        this.offRequset = offRequset;
    }

    public int getOffRequestcounts() {
        return offRequestcounts;
    }

    public void setOffRequestcounts(int offRequestcounts) {
        this.offRequestcounts = offRequestcounts;
    }

    public void offRequest(Period p){
        this.setOffRequestcounts(this.getOffRequestcounts()+1);
        if(this.getOffRequestcounts()<=this.getOffRequestCapacities()){
            if(){
                this.setOffRequset(true);

            }
        }else
            System.out.println("You aren't allowed to request for off Because your Capacity is full");
    }

}
