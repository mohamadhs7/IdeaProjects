package com.dotin.entities;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;


@Entity
public class Employee {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstName;
    private String lastName;
    private Role role;
    private int offRequestCapacities;
    private Boolean offRequset=false;
    private int offRequestcounts=0;
    private int offRequestSituation=0;
    @ElementCollection
    @JoinTable(name = "OffRequestsDates")
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<LocalDate> offRequestsDates;

    @ManyToOne(cascade = CascadeType.ALL)
    private Manager manager;

    public Employee(String firstName, String lastName, Role role, int offRequestCapacities, Manager manager) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
        this.offRequestCapacities = offRequestCapacities;
        this.manager = manager;
    }

    public Employee(){};

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public List<LocalDate> getOffRequestsDates() {
        return offRequestsDates;
    }

    public void setOffRequestsDates(List<LocalDate> offRequestsDates) {
        this.offRequestsDates = offRequestsDates;
    }

    public int getOffRequestSituation() {
        return offRequestSituation;
    }

    public void setOffRequestSituation(int offRequestSituation) {
        this.offRequestSituation = offRequestSituation;
    }

    public void offRequest(List<LocalDate> offRequests){
        this.setOffRequestcounts(this.getOffRequestcounts()+1);
        if(this.getOffRequestcounts()<=this.getOffRequestCapacities()){
                this.setOffRequset(true);
                this.setOffRequestsDates(offRequests);
        }else
            System.out.println("You aren't allowed to request for off Because your Capacity is full");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", role=" + role +
                ", offRequestCapacities=" + offRequestCapacities +
                ", offRequset=" + offRequset +
                ", offRequestcounts=" + offRequestcounts +
                ", offRequestsDates=" + offRequestsDates +
                ", manager=" + manager +
                '}';
    }
}
